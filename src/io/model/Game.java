package io.model;

import java.util.ArrayList;

public class Game
{
	private ArrayList<String> gameRules;
	private int funRanking;
	private String gameTitle;
	
	public Game()
	{
		gameRules = new ArrayList<String>();
		funRanking = 0;
		gameTitle = " ";
	}
	
	public Game(ArrayList<String> gameRules, int funRanking, String gameTitle)
	{
		this.gameRules = gameRules;
		this.funRanking = funRanking;
		this.gameTitle = gameTitle;
	}
}
