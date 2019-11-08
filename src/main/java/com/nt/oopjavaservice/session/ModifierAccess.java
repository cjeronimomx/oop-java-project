package com.nt.oopjavaservice.session;

import com.nt.oopjavaservice.session.access.Capacity;

import static com.nt.oopjavaservice.session.StaticMembers.*;

public class ModifierAccess extends Capacity {
    public static void main(String[] args) {
        Capacity capacity = new Capacity();
        capacity.analysis();
        capacity.ramMetric = 1.3;

        System.out.println(greet("Nombre"));
        System.out.println(staticCounter);
        System.out.println(test());
    }
}
