package com.tieto.planetwars.world;

import com.tieto.planetwars.player.Player;

/**
 * 
 * 
 */
public class Planet {
	private final Integer id;
	private final Integer growthRate;
	private final Coordinates coordinates;
	private Player owner;
	private Integer numberOfShips;

	public Planet(Integer id, Integer growthRate, Player owner,
			Integer numberOfShips, Coordinates coordinates) {
		super();
		this.id = id;
		this.growthRate = growthRate;
		this.owner = owner;
		this.numberOfShips = numberOfShips;
		this.coordinates = coordinates;
	}

	/**
 * 
 */
	public void advancement() {
		numberOfShips += growthRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// //P <x:float> <y:float> <owner:int> <ships:int> <growth:int>
		return "P " + coordinates.toString() + " "
				+ (owner != null ? owner.getId() : 0) + " " + numberOfShips
				+ " " + growthRate;
	}

	public Integer getId() {
		return id;
	}

	public Integer getGrowthRate() {
		return growthRate;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public Player getOwner() {
		return owner;
	}

	public Integer getNumberOfShips() {
		return numberOfShips;
	}

	public void setOwner(Player player) {
		owner = player;
	}

	public void setNumberOfShips(int numberOfShips) {
		this.numberOfShips = numberOfShips;
	}
}
