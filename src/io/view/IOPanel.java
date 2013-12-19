package io.view;

import java.awt.Color;

import io.controller.IOController;
import javax.swing.*;

public class IOPanel extends JPanel
{
	
	private IOController baseController;
	private JButton saveButton;
	private JTextField titleField;
	private JTextField rankingField;
	private JTextArea rulesArea;
	private JLabel rulesLabel;
	private JLabel rankingLabel;
	private JLabel titleLabel;
	private SpringLayout baseLayout;
	
	public IOPanel(IOController baseController)
	{
		this.baseController = baseController;
		
		saveButton = new JButton("save the game stuff");
		titleField = new JTextField(14);
		titleLabel = new JLabel("Game Title:");
		rankingField = new JTextField(5);
		rankingLabel = new JLabel("Game Ranking:");
		rulesArea = new JTextArea(5, 20);
		rulesLabel = new JLabel("Game Rules: ");
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.MAGENTA);
		this.add(rankingField);
		this.add(rankingLabel);
		this.add(rulesArea);
		this.add(rulesLabel);
		this.add(saveButton);
		this.add(titleField);
		this.add(titleLabel);
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}

}

