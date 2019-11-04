package com.nt.oopjavaservice.util;

import com.nt.oopjavaservice.domain.vo.ConsumeMsu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.channels.ScatteringByteChannel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class File {
    private String name;
    private String path;
    private LocalDate reveived;

    public File(String name, String path, LocalDate reveived) {
        this.name = name;
        this.path = path;
        this.reveived = reveived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LocalDate getReveived() {
        return reveived;
    }

    public void setReveived(LocalDate reveived) {
        this.reveived = reveived;
    }

    public ConsumeMsu[] getContent() {
        return content;
    }

    public void setContent(ConsumeMsu[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", reveived=" + reveived +
                ", content=" + Arrays.toString(content) +
                '}';
    }

    //* arreglo
    private ConsumeMsu content[];

    public  void read() {
        try {

        java.io.File file = new java.io.File(path.concat(name));
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea = null;
        while ((linea = bufferedReader.readLine()) != null) {
            System.out.println(linea);
        }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
