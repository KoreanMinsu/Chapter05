package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		
		InputStream in = new FileInputStream("C:\\javastudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javastudy\\file\\Imgjpg");
		int data = in.read();
		System.out.println("복사시작");
		while(true) {
			data = in.read();
			if(data == -1) {
				System.out.println("복사끝" + data);
				break;
			}
			
			out.write(data);
		} 
		
		out.close();  // in - out 순이기에 역순 클로즈
		in.close();
	}
}
