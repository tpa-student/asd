package com.tieto.planetwars.world;

import com.tieto.planetwars.player.Player;

/**
 * Represents fleet  
 * 
 */
public class Fleet {
	Player owner;
	int numberOfShips;
	Planet sourcePlanet;
	Planet destinationPlanet;
	int totalTurns;
	int remainingTurns;

	public Fleet(Player owner, int numberOfShips, Planet sourcePlanet,
			Planet destinationPlanet) {
		super();
		this.owner = owner;
		this.numberOfShips = numberOfShips;
		this.sourcePlanet = sourcePlanet;
		this.destinationPlanet = destinationPlanet;
		this.totalTurns = this.sourcePlanet.getCoordinates().distance(
				this.destinationPlanet.getCoordinates());
		this.remainingTurns = this.totalTurns;
	}

	public Fleet(Player owner, int numberOfShips, Planet sourcePlanet,
			Planet destinationPlanet, int totalTurns, int remainingTurns) {
		this(owner, numberOfShips, sourcePlanet, destinationPlanet);
		this.totalTurns = totalTurns;
		this.remainingTurns = remainingTurns;
	}

	public void advancement() {
		remainingTurns--;
	}

	public int getRemainingTurns() {
		return remainingTurns;
	}

	public int getNumberOfShips() {
		return numberOfShips;
	}

	public Player getOwner() {
		return owner;
	}

	public Planet getSourcePlanet() {
		return sourcePlanet;
	}

	public Planet getDestinationPlanet() {
		return destinationPlanet;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		// F <owner:int> <ships:int> <source:int> <destination:int>
		// <total_turns:int> <remaining_turns:int>
		return "F " + owner.getId() + " " + numberOfShips + " "
				+ sourcePlanet.getId() + " " + destinationPlanet.getId() + " "
				+ totalTurns + " " + remainingTurns;
	}
}
