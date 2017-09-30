package com.company;
import java.util.Scanner;
public class man {
    private  String name;
    private String otch;
private String last_name;
//человек говорит
    public void say () {
     System.out.print("Hello!\n"+
             "Enter your name,last name and surname\n");
    }
//ввод ф.и.о
    public void setFio (){
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        last_name=in.nextLine();
        otch=in.nextLine();
        System.out.print("Your name is"+" "+ name+"\n");
        System.out.print("Your last name is"+" "+ last_name+"\n");
        System.out.print("Your surname is"+" "+ otch+"\n");
}

    }

