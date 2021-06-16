package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader reader=null;
        try {

            reader= new BufferedReader(new FileReader("C:\\JavaLearning1\\ExeceptionReadingFile-JAVA\\src\\com\\company\\sayilar.txt"));
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}
