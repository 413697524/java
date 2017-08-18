package com.example.controller;

import com.example.entity.Book;
import com.example.repository.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/8/18.
 */
@Controller
@RequestMapping("/")
public class ReadingListController {
    private static ReadingListRepository readingListRepository;


    @Autowired
    public ReadingListController(ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }

    @RequestMapping(value="/{reader}", method= RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model) {
        System.out.println("============reader:"+reader);
        System.out.println("============model:"+model);

        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    @RequestMapping(value="/{reader}", method=RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";
    }


    @RequestMapping("/")
    @ResponseBody
    public String content(){
        return "test";
    }
//
//    @RequestMapping(value = "/haha/demo/",method = RequestMethod.GET)
//    public String getDemoHeml(Model model){
//        model.addAttribute("haha","haha");
//        return "haha";
//    }

    @RequestMapping(value = "/api/haha",method = RequestMethod.GET)
    private String getHahaHtml(){
        return "haha";
    }

}
