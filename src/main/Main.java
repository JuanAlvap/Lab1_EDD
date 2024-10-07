package main;

import frames.InterfaceGUI;

public class Main {
    public static void main(String[] args) {       
        InterfaceGUI inteface = new InterfaceGUI();
        inteface.setDefaultCloseOperation(InterfaceGUI.EXIT_ON_CLOSE);
        inteface.pack();
        inteface.setVisible(true);
        
        
    }
}
