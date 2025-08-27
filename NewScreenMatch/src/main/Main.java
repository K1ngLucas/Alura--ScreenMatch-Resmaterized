package main;

import static functions.MenuFunction.screenMatchMenu;

public class Main {
    public static void main(String[] args) {
        try{
            screenMatchMenu();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
