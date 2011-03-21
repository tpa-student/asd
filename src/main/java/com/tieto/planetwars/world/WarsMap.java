package com.tieto.planetwars.world;

import java.util.List;

public class WarsMap {

	private final List<Planet> planets;
	private final List<Fleet> fleets;

	public WarsMap(List<Planet> planets, List<Fleet> fleets) {
		this.planets = planets;
		this.fleets = fleets;
	}

	public List<Planet> getPlanets() {
		return planets;
	}

	public List<Fleet> getFleets() {
		return fleets;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (planets != null) {
			for (Planet planet : planets) {
				sb.append(planet.toString() + "\n");
			}
		}
		if (fleets != null) {
			for (Fleet fleet : fleets) {
				sb.append(fleet.toString() + "\n");
			}
		}
		return sb.toString();
	}
}
