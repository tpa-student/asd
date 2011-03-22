package com.tieto.planetwars.map.parser;

import java.util.List;

import com.tieto.planetwars.player.Command;
import com.tieto.planetwars.player.Player;
import com.tieto.planetwars.world.Coordinates;
import com.tieto.planetwars.world.Fleet;
import com.tieto.planetwars.world.Planet;
import com.tieto.planetwars.world.WarsMap;

public class FleetParser {
	public FleetParser() {

	}

	public Fleet parse(String command) {
		if (command.isEmpty())
			throw new RuntimeException("Empty command received");
		if (!command.startsWith("F"))
			throw new RuntimeException("Wrong command received for fleet");
		command = command.substring(2);
		final String[] commandElement = command.split(" ");
		if (commandElement.length != 6)
			throw new RuntimeException("Wrong number of elements in command");
		
		Player player1 = new Player() {
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getId() {
				// TODO Auto-generated method stub
				return Integer.parseInt(commandElement[0]);
			}
			
			@Override
			public List<Command> doTurn(WarsMap gameMap) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		Player player2 = new Player() {
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getId() {
				// TODO Auto-generated method stub
				return 2;
			}
			
			@Override
			public List<Command> doTurn(WarsMap gameMap) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Coordinates coordinates1 = new Coordinates(1.5,2);
		Planet planet1 = new Planet(Integer.parseInt(commandElement[2]), 1, player1, 15, coordinates1);
		Planet planet2 = new Planet(Integer.parseInt(commandElement[3]), 1, player2, 15, coordinates1);
	
		return new Fleet(player1, Integer.parseInt(commandElement[1]), planet1, planet2, Integer.parseInt(commandElement[4]), Integer.parseInt(commandElement[5]));
	}
}
