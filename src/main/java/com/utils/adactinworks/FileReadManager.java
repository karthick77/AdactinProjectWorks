package com.utils.adactinworks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadManager {
	
	//Singleton design pattern
	private FileReadManager() {
		
	}
	
	public static FileReadManager getInstanceFRM() {
		FileReadManager frm = new FileReadManager();
		return frm;
	}
	
	public Configuration_Reader getInstanceCR() throws FileNotFoundException, IOException {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}

}
