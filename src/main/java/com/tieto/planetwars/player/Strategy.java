package com.tieto.planetwars.player;

import java.util.List;

import com.tieto.planetwars.world.WarsMap;

/**
 * 
 *
 */
public interface Strategy {
	/**
	 * 
	 * @param gameMap
	 * @param player
	 * @return
	 */
	public List<Command> doTurn(WarsMap gameMap, Player player);
}
