package com.tieto.planetwars.player;

import java.util.List;

import com.tieto.planetwars.world.WarsMap;

public interface Player {
	public int getId();

	public String getName();

	public List<Command> doTurn(WarsMap gameMap);

}