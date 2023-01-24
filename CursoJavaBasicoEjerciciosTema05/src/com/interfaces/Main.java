package com.interfaces;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        CocheCRUDImpl coche1 =new CocheCRUDImpl(2001,"BMW",2.6);
        CocheCRUDImpl coche2 =new CocheCRUDImpl(20010,"Mercedes",1.6);

        cocheCRUD.save(coche1);
        cocheCRUD.save(coche2);

        System.out.println(cocheCRUD.findAll());

        cocheCRUD.delete(coche2);

        System.out.println(cocheCRUD.findAll());

    }
}