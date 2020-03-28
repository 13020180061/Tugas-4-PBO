import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
import javax.swing.*; 
public class BacaString { 
 
	/*
    		Nama	: St.Hatijah H.Ilyas
		Tanggal	: 26 Maret 2020
		Waktu	: 21.01 WITA
	*/  

public static void main(String[] args) throws IOException {   
	// TODO Auto-generated method stub   
	/* Kamus */    
	String str;          

	BufferedReader datAIn = new BufferedReader(new 
	InputStreamReader(System.in));   
	/* Program */ 
 
 	System.out.print ("\nBaca string dan Integer: \n");       
	System.out.print("masukkan sebuah string: ");       
	str= datAIn.readLine();      
	System.out.print ("String yang dibaca : "+ str);       
	} 
 
} 