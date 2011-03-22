package com.tieto.planetwars.map.parser;

import junit.framework.Assert;

import org.junit.Test;

import com.tieto.planetwars.world.Fleet;

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
	
//	@Test
//	public void should_return_fleet_object() {
//		FleetParser parser = new FleetParser();
//		parser.parse("F 1 15 0 1 12 2");
//	}
}
