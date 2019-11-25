package com.nt.oopjavaservice.session;

import com.nt.oopjavaservice.session.access.Capacity;

public class ModifierAccess extends Capacity {
    public static void main(String[] args) {
        Capacity capacity = new Capacity();
        capacity.analysis();
        capacity.ramMetric = 1.3;

    }
}

