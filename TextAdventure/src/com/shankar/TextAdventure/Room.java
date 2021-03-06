package com.shankar.TextAdventure;
class Room
{
    Room east = null;
    Room north = null;
    Room south = null;
    Room west = null;
    String room_desc;
    IO io;

    Room(IO io, String room_desc)
    {
        this.io = io;
        this.room_desc = room_desc;

    }
    
    void addEastExit(Room e)
    {
        east = e;
        
    }
    
    void addWestExit(Room e)
    {
        west = e;
    }
    
    void addNorthExit(Room e)
    {
        north = e;
    }
    
    void addSouthExit(Room e)
    {
        south = e;
    }
    
    void linkNorth(Room e)
    {
    	this.addNorthExit(e);
    	e.addSouthExit(this);
    }
    void linkSouth(Room e)
    {
    	this.addSouthExit(e);
    	e.addNorthExit(this);
    }
    void linkEast(Room e)
    {
    	this.addEastExit(e);
    	e.addWestExit(this);
    }
    void linkWest(Room e)
    {
    	this.addWestExit(e);
    	e.addEastExit(this);
    }

    void displayExits()
    {
    	io.println("You are in room "+room_desc);
        io.println("Obvious Exits:");
        io.print((north != null)?"North,":"");
        io.print((south != null)?"South,":"");
        io.print((east != null)?"East,":"");
        io.print((west != null)?"West,":"");
        io.println("");
    }
    boolean isNull(Object ob)
    {
    	if(ob == null)
    		return true;
    	return false;
    }
    String runGameLoop()
    {
    	String command;
    	while(true)
    	{
    		displayExits();
    		io.println("What do you want to do?");
    		command = io.accept();
    		if(command.equals("exit"))
    		{
    			return "exit";
    		}
    		if(command.equals("go north") || command.equals("north"))
    		{
    			if(isNull(north))
    			{
    				io.println("There is no way there!");
    				continue;
    			}
    			return "north";
    		}
    		if(command.equals("go south") || command.equals("south"))
    		{
    			if(isNull(south))
    			{
    				io.println("There is no way there!");
    				continue;
    			}
    			return "south";
    		}
    		if(command.equals("go east") || command.equals("east"))
    		{
    			if(isNull(east))
    			{
    				io.println("There is no way there!");
    				continue;
    			}
    			return "east";
    		}
    		if(command.equals("go west") || command.equals("west"))
    		{
    			if(isNull(west))
    			{
    				io.println("There is no way there!");
    				continue;
    			}
    			return "west";
    		}
    		io.println("Command not found! Please refer the manual");
    	}
    }
}
    
    
