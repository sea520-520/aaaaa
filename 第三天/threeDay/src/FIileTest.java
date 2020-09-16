import java.io.*;

public class FIileTest {

    public static void main(String[] args) throws IOException {

//        2、使用文件流复制myfile.txt文件为myfile_cp.txt
        File in = new File("C:"+File.separator+"Users"+File.separator+"xiaohai"+File.separator+"Desktop"+File.separator+"新建文件夹"+File.separator+"aaa"+File.separator+"myfile.txt");
        File out = new File("C:"+File.separator+"Users"+File.separator+"xiaohai"+File.separator+"Desktop"+File.separator+"新建文件夹"+File.separator+"aaa"+File.separator+"myfile_cp.txt");
        FileInputStream inputStream = new FileInputStream(in);
        FileOutputStream outputStream = new FileOutputStream(out);
        byte[] buffer = new byte[1024];
        int len = 0;
        while((len = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer,0,len);
        }
        outputStream.close();
        inputStream.close();
    }
}
