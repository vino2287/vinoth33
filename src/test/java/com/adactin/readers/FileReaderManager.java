package com.adactin.readers;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {

	}
	public static FileReaderManager getInstance() {
		FileReaderManager frm = new FileReaderManager();
				return frm;
	}
	public ConfigurationReader getInstanceCR() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
				return cr;
	}

}
