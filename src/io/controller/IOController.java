package io.controller;

import io.model.Game;
import io.view.IOFrame;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

/**
 * Controller class for the IO project.
 * @author jjen1202
 *
 */
public class IOController
{
	/**
	 * Reference to the GUI Frame for the project.
	 */
	private IOFrame appFrame;
	
	/**
	 * 
	 */
	public IOController()
	{
		
	}
	
	public void start()
	{
		appFrame = new IOFrame(this);
	}
	
	public void saveGameInformation(Game currentGame)
	{
		PrintWriter gameWrier;
		String saveFile = "savefile.txt";
		
		try
		{
			gameWriter = new PrintWriter(saveFile); //Creates the save file.
			
			gameWriter.println(currentGame.getGameTitle());
			gameWriter.println(currentGame.getFunRanking());
			for(int count = 0; count < currentGame.getGameRules().size(); count++)
			{
				gameWriter.println(currentGame.getGameRules().get(count));
			}
			
			gameWriter.close(); //Required to prevent corruption of data and maintain security of the file
		}
		catch(FileNotFoundException noFileExists)
		{
			JOptionPane.showMessageDialog(appFrame, "Could not create the save file. :(");
			JOptionPane.showMessageDialog(appFrame, noFileExisits.getMessage());
		}
	}
}
