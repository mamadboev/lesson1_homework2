package controllers;

import config.Db_config;

public class MainController {
    public static void main(String[] args) {
        Db_config db_config = new Db_config();
        System.out.println("Pc list");
        db_config.getList("pc");
        System.out.println("Laptop list");
        db_config.getList("laptop");
        System.out.println("Printer list");
        db_config.getList("printer");
    }
}
