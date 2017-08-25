package com.example.interfaces;

import com.example.demo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/18.
 *
 * Book代表操作对象 long是对象向属性id的类型
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {


    List<Book> findByReader(String reader);
}
