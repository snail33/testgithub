package com.ddsy.scan;

import java.io.File;

public class Main {

//	D:\abcde
	
	public static void main(String[] args) {
		String path = args[0];
		if(path == null || "".equals(path))
			return;
		
		File dir=new File(path);
        if(dir.exists() && dir.isDirectory()){ 
        	File[] subDirs = dir.listFiles();
        	for (File subDir : subDirs) {
        		String subPath = subDir.getAbsolutePath();
        		scan(subPath);
			}
        }
	}
	
	
	
	public static void scan(String path) {
		String smallPath = "\\small\\z_1.jpg";
		String[] paths = new String[]{"\\mid\\z_1.jpg","\\mid\\x_1.jpg","\\mid\\c_1.jpg","\\mid\\b_1.jpg","\\mid\\n_1.jpg","\\mid\\h_1.jpg","\\mid\\s_1.jpg"};
		if(!isFileExists(path + smallPath)){
			System.out.println(path + smallPath + "图片不存在");
		}
		
		boolean midExists = false;
		for (String midPath : paths) {
			if(isFileExists(path + midPath)) {
				midExists = true;
				break;
			}
		}
		if(!midExists) {
			System.out.println(path + "\\mid" + "图片不存在");
		}
		
	}
	
	
	public static boolean isFileExists(String path) {
		File file=new File(path);
		return file.exists() && !file.isDirectory();
	} 
	
	
}
