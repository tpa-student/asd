package com.tieto.planetwars.player;

import com.tieto.planetwars.world.Planet;

/**
 * Represents a player's command, which is sending some ships (<code>numShpis</code>) 
 * from source planet (<code>sourcePlanet</code>) to
 * destination planet (<code>destinationPlanet</code>)
 */
public final class Command {
	private Planet sourcePlanet;
	private Planet destinationPlanet;
	private int numShips;

	public Command(Planet sourcePlanet, Planet destinationPlanet, int numShips) {
		super();
		this.sourcePlanet = sourcePlanet;
		this.destinationPlanet = destinationPlanet;
		this.numShips = numShips;
	}

	@Override
	public String toString() {
		return sourcePlanet.getId() + " " + destinationPlanet.getId() + " "
				+ numShips;
	}

	public int getNumShips() {
		return numShips;
	}

	public Planet getSourcePlanet() {
		return sourcePlanet;
	}

	public Planet getDestinationPlanet() {
		return destinationPlanet;
	}
}
