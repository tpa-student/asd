package com.tieto.planetwars.world;

/**
 * Represents coordinates in planetwars world.
 * 
 */
public class Coordinates {

	private final double x;
	private final double y;

	public Coordinates(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * Count distance to <code>destination</code> coordinates.
	 * 
	 * @param destination
	 * @return
	 */
	public int distance(Coordinates destination) {
		if (destination == null) {
			throw new IllegalArgumentException(
					"Destination coordinates cannot be null");
		}

		return (int) Math.round(Math.sqrt(Math.pow(this.x - destination.x, 2)
				+ Math.pow(this.y - destination.y, 2)));
	}

	public double getY() {
		return y;
	}

	public double getX() {
		return x;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}
}
