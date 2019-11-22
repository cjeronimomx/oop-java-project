package com.nt.oopjavaservice.service;

import com.nt.oopjavaservice.util.File;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.time.LocalDate;

@Service
public class ScrtService implements IScrtServicce {
    @Override    // se llaman anotaciones sirve para q el compilador agregue funcionalidad
    public void processFile() {   // lo decimos sobreescribe este metodo
        // JOptionPane.showMessageDialog(null,"processFile");
        File file = new File ("SCRT_SEPT_2019.csv", "C:\\Users\\M905754\\IdeaProjects\\oop-java-project\\src\\main\\resources\\", LocalDate.now());
        file.read();

        }

    @Override
    public void convertMsuTOMIPS() {
        JOptionPane.showMessageDialog(null,"convertMSUTOMIPS");
    }

    @Override
    public void saveIntoDatabase() {
        JOptionPane.showMessageDialog(null,"saveIntoDatabase");
    }
}

