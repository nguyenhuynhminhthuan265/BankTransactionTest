package com.cybersoft.avltree;

import java.io.IOException;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) throws IOException {

		System.out.println("abcd".compareTo("abcdeyyyyy"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("start");
		Dictionary dictionary = new Dictionary();
		System.out.println("end");
		dictionary.xuLyTuDien(sc);

		dictionary.dictionary.Traverse();
		//14051398001
		//147488161001
	}
}
