package com.spconger.FileExamples;
import java.io.*;
import java.util.Scanner;


public class Program {
/**
 * This class calls the writeFile and readFile methods
 * to write and read text files
 * 
 */
	//the scanner object reads from  the console
	Scanner scan = new Scanner(System.in);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program p = new Program();
		p.writeFile();
		p.readFile();
	}
			
			private void writeFile(){
				//this method calls the WriteFile class and send it
				//a file path and a content string
				System.out.println("Enter a file name");
				 scan = new Scanner(System.in);
				String path = scan.nextLine();
			
				//the try catch is required when you do
				//file input and output
					try {
						WriteFile write = new WriteFile(path);
						System.out.println("enter some text for the file");
						String text = scan.nextLine();
						write.addText(text);
						write.closeFile();
					} catch (IOException e) {
						//message would be better for user
						//than stack trace
						e.getMessage();
						//e.printStackTrace();
					}
			}
			
			private void readFile(){
				//this method reads the file
				System.out.println("enter the path for the file");
				String path = scan.nextLine();
				ReadFile read = new ReadFile(path);
				try {
					System.out.println(read.getText());
				} catch (IOException e) {
					e.getMessage();
					//e.printStackTrace();
				}
				
			}
	
		}
	
	


