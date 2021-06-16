package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javastudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("C:\\javastudy\\file\\bufferedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int data;
		System.out.println("Copy Start");
		while(true) {
			data = bin.read();
			if(data == -1) {
				System.out.println("Copy end;"+data);
				break;
				
			}
			
			bout.write(data);
		}
		
		bout.close();
		bin.close(); //buffer stream close 시 input output stream 자동 close
		
	}
}
