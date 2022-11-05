package com.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindFile {

	public static void main(String[] args) throws IOException {
		//File f=new File("C:\\Users\\HP\\Documents.txt");
		FileReader fr=new FileReader("C:\\Users\\HP\\Documents\\Testing\\Hello.txt");
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char) temp);
		}
		fr.close();

	}

}
