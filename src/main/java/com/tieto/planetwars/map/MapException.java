package com.tieto.planetwars.map;

/**
 * Exception representing problems during creation of map element
 */
public class MapException extends RuntimeException {
	private static final long serialVersionUID = -3199882856465740122L;

	public MapException(String mesasge) {
		super(mesasge);
	}
}
