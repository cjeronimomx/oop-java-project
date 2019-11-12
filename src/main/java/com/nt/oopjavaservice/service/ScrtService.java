package com.nt.oopjavaservice.service;

import com.nt.oopjavaservice.util.File;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ScrtService implements IScrtService {
    @Override
    public void processFile(){
        System.out.println("ProcessFile");
        File file = new File("SCRT_SEPT_2019.csv", "/Users/mb69369/IdeaProjects/oop-java-project/src/main/resources/", LocalDate.now());
        file.read();

    }
    @Override
    public void convertMsuToMips(){
        System.out.println("ConvertMsuToMips");
    }
    @Override
    public void saveIntoDatabase(){
        System.out.println("SaveIntoDatabase");
    }
}
