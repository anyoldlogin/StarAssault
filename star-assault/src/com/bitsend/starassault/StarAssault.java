package com.bitsend.starassault;


import com.badlogic.gdx.Game;
import com.bitsend.starassault.screen.GameScreen;

public class StarAssault extends Game {
	@Override
	public void create() {		
		setScreen(new GameScreen());
	}

	
}
