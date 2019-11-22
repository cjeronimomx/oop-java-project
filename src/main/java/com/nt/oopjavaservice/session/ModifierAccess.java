package com.nt.oopjavaservice.session;

import com.nt.oopjavaservice.session.access.Capacity;

public class ModifierAccess extends Capacity {
    public static void main(String[] args) {
        Capacity capacity = new Capacity();
        capacity.analysis();
        capacity.ramMetrics = 1.3;
    }
}
