package com.tieto.planetwars.map.parser;

import java.util.List;

import junit.framework.Assert;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.tieto.planetwars.player.Command;
import com.tieto.planetwars.player.Player;
import com.tieto.planetwars.world.Coordinates;
import com.tieto.planetwars.world.Fleet;
import com.tieto.planetwars.world.Planet;
import com.tieto.planetwars.world.WarsMap;

public class FleetParserTest {

	@Test
	public void should_throw_exception_for_empty_string() {
		FleetParser parser = new FleetParser();
		try {
			parser.parse("");
			Assert.fail();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void should_return_exception_for_command_not_about_fleet(){
		FleetParser parser = new FleetParser();
		try {
			parser.parse("P 3.14 2.71 0 15 5");
			Assert.fail();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void number_of_elements_in_command_should_be_six(){
		FleetParser parser = new FleetParser();
		try {
			Fleet result = parser.parse("F 1 15 1 12 2");
			Assert.fail();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void should_return_fleet_object() {
		FleetParser parser = new FleetParser();
		Fleet result = parser.parse("F 1 15 0 1 12 2");
		Player player1 = new Player() {
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getId() {
				// TODO Auto-generated method stub
				return 1;
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
		Planet planet1 = new Planet(0, 1, player1, 15, coordinates1);
		Planet planet2 = new Planet(1, 1, player2, 15, coordinates1);
		Fleet expectedFleet = new Fleet(player1, 15, planet1, planet2,12,2);
		Assert.assertEquals(expectedFleet, result);
		



	}
}
