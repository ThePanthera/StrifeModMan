package org.Kairus.StrifeModMan;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;

class mod{
	ArrayList<String> fileNames = new ArrayList<String>();
	String fileName;
	String name = "defaultModName";
	String author = "defaultModName";
	String version = "0";
	ImageIcon image = null;
	StringWriter xmlModifications = new StringWriter();
	HashMap<String, String> patches = new HashMap<String, String>();
	HashMap<String, String> patchesToSave = new HashMap<String, String>();
	modMan modman;


	mod(String fileName, modMan mm){
		this.fileName = fileName;
		modman = mm;
	}
	Object[] getData(){
		return new Object[]{false, name, author, version, image!=null?image:modman.gui.defaultIcon};
	}
}