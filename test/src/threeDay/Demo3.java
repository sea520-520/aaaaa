package threeDay;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
	
	public static void main(String[] args) {
		
		FileWriter fileWriter = null;
		try {
			//把数据写入文件
			fileWriter = new FileWriter(new File("D:\\test\\abc.txt"),true);
			String str = "\r\n哈哈哈";
			char[] write = str.toCharArray();
			fileWriter.write(write);
			//关闭输出流
			fileWriter.close();
			//把数据读取出来
			FileReader fileReader = new FileReader(new File("D:\\test\\abc.txt"));
			char[] readBuf = new char[1024];
			int len = 0;
			while((len = fileReader.read(readBuf)) > 0) {
				System.out.println(new String(readBuf,0,len));
			}
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
