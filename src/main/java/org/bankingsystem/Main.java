package org.bankingsystem;

import gui.window.UserInterface;
import system.Operation;

public class Main {
    Operation run;

    public Main(){
        run = new Operation();
    }
    public static void main(String[] args) {
        new Main();
    }
}