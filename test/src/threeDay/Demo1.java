package threeDay;

import java.io.File;

public class Demo1 {
	
	public static void main(String[] args) {
		
		getFile("D:\\workspace");
	}
	
	public static void getFile(String path) {
		File file = new File(path);
		File[] files = file.listFiles();
		for(File item : files) {
			if(item.isDirectory()) {
				System.out.println("文件夹：" + item.getName());
				getFile(item.getAbsolutePath());
			} else {
				if(file.isDirectory()) {
					System.out.println("    文件：" + item.getName());
				} else {
					System.out.println("文件：" + item.getName());
				}
				
			}
		}
	}
}
