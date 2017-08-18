package com.example.repository;

import com.example.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by Administrator on 2017/8/18.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
    Reader findOne(String s);
}
