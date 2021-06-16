package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javastudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javastudy\\file\\byteBufferImg.jpg");
		
		
		int data;
		byte[] buff = new byte[1024];
		
		System.out.println("Copy start");
		while(true) {
			data = in.read(buff);
			if(data == -1) {
				System.out.println("copy end:" + data);
				break;
			}
			
			out.write(buff);
		}
		
		out.close();
		in.close();
	}
}
