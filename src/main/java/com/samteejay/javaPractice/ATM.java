package main.java.com.samteejay.javaPractice;

import main.java.com.samteejay.javaPractice.Bank;
import main.java.com.samteejay.javaPractice.SavingsAccount;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;


public class ATM {

    private JFrame theFrame;
    JPanel mainPanel;
    JPanel background;
    private static Bank bank;
    private SavingsAccount account;
    private BorderLayout layout;

    public ATM(Bank bank) {

        this.bank = bank;
        this.account = null;
        this.theFrame = new JFrame("ATM");
        this.theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.layout = new BorderLayout();
        this.background = new JPanel(layout);
        this.background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    }

    public static void main (String[] args) {
        // Instantiate a Bank and an ATM and run it.

        bank = new Bank();
        bank.add(new SavingsAccount("Samuel", "7777", 1000.00));
        bank.add(new SavingsAccount("Ayo", "6565", 20.00));
        System.out.println("The bank has been loaded");
        ATM atm = new ATM(bank);
        System.out.println("Running the GUI");


        System.out.println("The bank has been updated");
    }
}
