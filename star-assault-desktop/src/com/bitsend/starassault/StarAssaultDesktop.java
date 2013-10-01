package com.bitsend.starassault;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class StarAssaultDesktop {
	public static void main(String[] args) {
		new LwjglApplication(new StarAssault(), "Star Assault", 480, 320, true);
	}
}
