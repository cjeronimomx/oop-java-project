package com.nt.oopjavaservice.domain.vo;

import java.time.LocalDateTime;

public class ConsumeMsu {
    private String lpar;
    private int highest;
    private LocalDateTime utc;
    private LocalDateTime local;

    //Este es el cosntructor de la clase
    public ConsumeMsu(){

    }

    // Estos son los metodos para poder accesar a los atributos de la clase

    public String getLpar() {
        return lpar;
    }

    public void setLpar(String lpar) {
        this.lpar = lpar;
    }

    public int getHighest() {
        return highest;
    }

    public void setHighest(int highest) {
        this.highest = highest;
    }

    public LocalDateTime getUtc() {
        return utc;
    }

    public void setUtc(LocalDateTime utc) {
        this.utc = utc;
    }

    public LocalDateTime getLocal() {
        return local;
    }

    public void setLocal(LocalDateTime local) {
        this.local = local;
    }

    //Este es el cosntructor de la clase
    public ConsumeMsu(String lpar, int highest, LocalDateTime utc, LocalDateTime local) {
        this.lpar = lpar;
        this.highest = highest;
        this.utc = utc;
        this.local = local;
    }

    //Este es el cosntructor de la clase
    public ConsumeMsu(String lpar, int highest) {
        this.lpar = lpar;
        this.highest = highest;
    }



}
