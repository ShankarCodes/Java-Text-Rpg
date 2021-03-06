package com.shankar.TextAdventure;
import java.util.Scanner;
class Console implements IO
{
    Scanner sc = new Scanner(System.in);
    @Override
    public String accept()
    {
        return sc.nextLine();
    }
    
    @Override
    public void print(String str)
    {
        System.out.print(str);
    }
    
    @Override 
    public void println(String str)
    {
        System.out.println(str);
    }
    
    @Override
    public void clear()
    {
        System.out.println("\f");
    }
}