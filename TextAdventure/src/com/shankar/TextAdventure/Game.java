package com.shankar.TextAdventure;
import java.util.ArrayList;
class Game
{
    IO io;
    void initIO(IO io)
    {
        this.io = io;
        
    }
   
    public static void main(String args[])
    {
        Difficulty d = Difficulty.HARD;
        if(d == Difficulty.HARD)
        System.out.println("HARD:");
    }
}
