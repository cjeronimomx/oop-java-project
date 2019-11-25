package com.nt.oopjavaservice.service;

import com.nt.oopjavaservice.util.File;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.time.LocalDate;

@Service
public class ScrtService implements IScrtService {
    @Override
    public void processFile() {
        //JOptionPane.showMessageDialog(null,"processFile");
        File file = new File("SCRT_SEPT_2019.csv", "C:\\Users\\M842524\\IdeaProjects\\oop-java-project\\src\\main\\resources\\", LocalDate.now());
        file.read();
    }

    @Override
    public void convertMSUToMips() {
        JOptionPane.showMessageDialog(null,"convertMSUToMips");
    }

    @Override
    public void saveIntoDatabase() {
        JOptionPane.showMessageDialog(null,"saveIntoDatabase");
    }
}
