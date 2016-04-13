package com.kevinmichie;


import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String words = scanner.next();
    int i = 0;
    int j=1;
    String emptyString = "";

    public boolean isValidWord(String string){
        //...some randome code that checks if string is a valid word
        return true; //need a return statement
    }


    public boolean wordChecker(String stuff) {
        while (j < stuff.length()+1) {
            if (isValidWord(stuff.substring(i, j))) {
                emptyString += stuff.substring(i, j);
                i = j;
                j++;
            } else {
                j++;
            }
        }
        if(emptyString.length() == stuff.length()){
            return true;
        }
        else {
            return false;
        }
    }
        /*if(emptyString.length() == 6){
            System.out.println(emptyString.length());
            return true;
        }
        else{
            System.out.println(emptyString.length());
            return false;
        }*/


    public void printVariables(){
        System.out.println(wordChecker(words));
    }

    public static void main(String[] args) {
        Main checkingWords = new Main();
        checkingWords.printVariables();
    }
}

