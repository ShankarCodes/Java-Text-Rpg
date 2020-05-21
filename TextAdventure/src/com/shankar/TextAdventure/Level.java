package com.shankar.TextAdventure;

public class Level {
	public static void main(String args[])
	{
		
		IO io = new Console();
		Room first = new Room(io, "first room");
		
		Room current = first;
		
		Room firstn = new Room(io, "north of first room");
		Room firsts = new Room(io, "south of first room");
		Room firste = new Room(io, "east of first room");
		Room second = new Room(io, "second room");
		Room seconds = new Room(io, "south of second room");
		Room secondw = new Room(io, "west of second room");
		
		//first.addNorthExit(firstn);
		//firstn.addSouthExit(first);
		
		//first.addSouthExit(firsts);
		//firsts.addNorthExit(first);
		
		//first.addEastExit(firste);
		//firste.addWestExit(first);
		
		//first.addWestExit(second);
		//second.addEastExit(first);
		
		//second.addSouthExit(seconds);
		//seconds.addNorthExit(second);
		
		//second.addWestExit(secondw);
		//secondw.addEastExit(second);
		
		first.linkNorth(firstn);
		first.linkSouth(firsts);
		first.linkEast(firste);
		first.linkWest(second);
		
		second.linkSouth(seconds);
		second.linkWest(secondw);
		
		String op;
		
		while(true)
		{
			op = current.runGameLoop();
			if (op.equals("exit"))
			break;
			if (op.equals("north"))
				current = current.north;
			if(op.equals("south"))
				current = current.south;
			if(op.equals("east"))
				current = current.east;
			if(op.equals("west"))
				current = current.west;
			
		}
	}
	


}
