package com.nt.oopjavaservice.service;

import java.security.PublicKey;

//* cuando se crea un API se crean interfaces *//

public abstract interface IScrtServicce { // el compilador lo pone x nosotros,abstract se pone automatico
    public abstract void processFile(); // metodos, todos son publicos, y se debe de poner como abstract
    public abstract void convertMsuTOMIPS();
    public  abstract void saveIntoDatabase();


}
