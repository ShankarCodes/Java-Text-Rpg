package com.shankar.TextAdventure;
// (c) 2020. Shankar
// This interface is to declare a class IO which handles all input and output.

public interface IO
{
    void print(String s);     // method to print a String.
    void println(String s);   // method to print a String along with a newline.
    String accept();          // method to accept a string from keyboard.
    void clear();             // method to clear the display.
}