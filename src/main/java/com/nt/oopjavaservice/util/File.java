package com.nt.oopjavaservice.util;

import com.nt.oopjavaservice.domain.vo.ConsumeMsu;

import java.time.LocalDateTime;
import java.util.Arrays;

public class File {
    private String name;
    private String path;
    private LocalDateTime recived;
    private ConsumeMsu content [];

    public File(String name, String path, LocalDateTime recived) {
        this.name = name;
        this.path = path;
        this.recived = recived;
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

    public LocalDateTime getRecived() {
        return recived;
    }

    public void setRecived(LocalDateTime recived) {
        this.recived = recived;
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
                ", recived=" + recived +
                ", content=" + Arrays.toString(content) +
                '}';
    }

}
