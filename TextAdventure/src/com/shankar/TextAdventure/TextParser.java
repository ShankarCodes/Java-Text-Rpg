package com.shankar.TextAdventure;

public class TextParser {

	Commands parse(String str)
	{
		str = str.trim();
		String tokens [] = str.split(" ");
		
		if(tokens[0].equals("go")|| tokens[0].equals("move") || tokens[0].equals("travel"))
		{
			if(tokens.length!=2)
				return Commands.WHERE_TO_GO;
				
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
				|| tokens[0].equals("x"))
		{
			if(tokens.length==1)
				return Commands.EXAMINE_ROOM;
			
			if(tokens.length!=2)
				return Commands.WHAT_TO_EXAMINE;
			
			if(tokens[1].equals("east"))
				return Commands.LOOK_EAST;
			if(tokens[1].equals("west"))
				return Commands.LOOK_WEST;
			if(tokens[1].equals("north"))
				return Commands.LOOK_NORTH;
			if(tokens[1].equals("south"))
				return Commands.LOOK_SOUTH;
			if(tokens[1].equals("me")|| tokens[1].equals("self"))
				return Commands.EXAMINE_SELF;
			else
				return Commands.EXAMINE_ITEM;
		}
		
		if(tokens[0].equals("take")
				|| tokens[0].equals("pick") 
				|| tokens[0].equals("obtain"))
		{
			if(tokens.length!=2)
				return Commands.WHAT_TO_TAKE;
			else
				return Commands.TAKE_ITEM;
			
		}
		
		if(tokens[0].equals("remove")
				|| tokens[0].equals("throw") 
				|| tokens[0].equals("drop"))
		{
			if(tokens.length!=2)
				return Commands.WHAT_TO_DROP;
			else
				return Commands.DROP_ITEM;
			
		}
		
		if(tokens[0].equals("use"))
		{
			if(tokens.length!=2)
				return Commands.WHAT_TO_TAKE;
			else
				return Commands.TAKE_ITEM;
			
		}
		
		
		return Commands.ATTACK;
		
	}
	

}
