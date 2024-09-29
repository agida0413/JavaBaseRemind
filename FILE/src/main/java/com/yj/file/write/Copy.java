package com.yj.file.write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public void copy() throws IOException {
		
		File file = new File("C:/Users/user/oneDrive/사진/스크린샷/6번.png");
		File newFile= new File("C:/Tools","새로운이름.png");
	FileInputStream fis = new FileInputStream(file);
	FileOutputStream fos = new FileOutputStream(newFile);
	byte [] bytes = new byte[1024];
	int reading;
	while((reading = fis.read(bytes)) !=-1) {
		 fos.write(bytes, 0, reading); // 읽은 만큼만 쓰기
	}
	
	}
}
