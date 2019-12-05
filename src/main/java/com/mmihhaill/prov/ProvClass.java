package com.mmihhaill.prov;

import java.util.Scanner;

public class ProvClass {
    private String name;

    public ProvClass(String name) {
        this.name = name;
    }

    private String setPreWithConsole(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter pref: ");
        return in.next();
    }

    public void showHello(){

        System.out.println("\nHello " + setPreWithConsole() + " " + name);
    }
}
