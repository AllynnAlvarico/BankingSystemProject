package org.bankingsystem;

import gui.window.RegisterPanel;
import gui.window.UserInterface;

import javax.swing.*;

public class Main {

    UserInterface userInterface;
    public Main(){
        userInterface = new UserInterface();
    }
    public static void main(String[] args) {
        new Main();
    }
}