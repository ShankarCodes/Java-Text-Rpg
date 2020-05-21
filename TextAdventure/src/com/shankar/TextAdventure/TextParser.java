package com.shankar.TextAdventure;

public class TextParser {
	String mv [] = {"go", "move", "travel", ""};
	Commands parse(String str)
	{
		str = str.trim();
		String tokens [] = str.split(" ");
		
		if(tokens[0].equals("go")|| tokens[0].equals("move") || tokens[0].equals("travel"))
		{
			if(tokens[1].equals("east"))
				return Commands.MOVE_EAST;
			if(tokens[1].equals("west"))
				return Commands.MOVE_WEST;
			if(tokens[1].equals("north"))
				return Commands.MOVE_NORTH;
			if(tokens[1].equals("south"))
				return Commands.MOVE_SOUTH;
		}
		if(tokens[0].equals("look")
				|| tokens[0].equals("see") 
				|| tokens[0].equals("examine")
				|| token)
		{
			if(tokens[1].equals("east"))
				return Commands.MOVE_EAST;
			if(tokens[1].equals("west"))
				return Commands.MOVE_WEST;
			if(tokens[1].equals("north"))
				return Commands.MOVE_NORTH;
			if(tokens[1].equals("south"))
				return Commands.MOVE_SOUTH;
		}
		return Commands.ATTACK;
		
	}
	

}
