package com.shankar.TextAdventure;
class IOtest
{
    IO io;
    void initIO(IO iob)
    {
        io = iob;
    }
    void nameTest()
    {
       io.print("hello What is your name?");
       String inp = io.accept();
       io.print(inp);
    }
    public static void main(String args[])
    {
        IOtest i = new IOtest();
        i.initIO(new Console());
        for(int j = 0; j < 10; j++)
        System.out.println();
        i.nameTest();
    }
}