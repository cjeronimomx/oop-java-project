package com.nt.oopjavaservice.util;

import com.nt.oopjavaservice.domain.vo.ConsumeMsu;

import java.time.LocalDate;
import java.util.Arrays;

public class File {
    private String name;
    private String path;
    private LocalDate received;
    private ConsumeMsu content[];

    public File(String name, String path, LocalDate received) {
        this.name = name;
        this.path = path;
        this.received = received;
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

    public LocalDate getReceived() {
        return received;
    }

    public void setReceived(LocalDate received) {
        this.received = received;
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
                ", received=" + received +
                ", content=" + Arrays.toString(content) +
                '}';
    }
}
