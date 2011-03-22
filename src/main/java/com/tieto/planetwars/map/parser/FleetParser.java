package com.tieto.planetwars.map.parser;


import com.tieto.planetwars.world.Fleet;

public class FleetParser  {
	public FleetParser() {
	
	}
	public Fleet parse (String command){
		if(command.isEmpty())
			throw new RuntimeException("Empty command received");
		if(!command.startsWith("F"))
			throw new RuntimeException("Wrong command received for fleet");
		
		return null;
	}
}
