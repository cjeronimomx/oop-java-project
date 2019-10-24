package com.nt.oopjavaservice.domain.vo;

import java.time.LocalDateTime;

public class ConsumeMsu {
    private String lpar;
    private int highest;
    private LocalDateTime utc;
    private LocalDateTime local;

    public ConsumeMsu() {
    }

    public ConsumeMsu(String lpar, int highest) {
        this.lpar = lpar;
        this.highest = highest;
    }

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

    @Override
    public String toString() {
        return "ConsumeMsu{" +
                "lpar='" + lpar + '\'' +
                ", highest=" + highest +
                ", utc=" + utc +
                ", local=" + local +
                '}';
    }
}
