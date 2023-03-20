package Comp_Decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Compressor {
    public static void method(File file)throws IOException {
        String fileDirectory = file.getParent();

        FileInputStream fi = new FileInputStream(file);
        FileOutputStream fo = new FileOutputStream(fileDirectory + "/Compressed.gz");
        GZIPOutputStream gzip = new GZIPOutputStream(fo);

        byte[] buffer = new byte[1024];
        int len;

        while ((len = fi.read(buffer)) != -1){
            gzip.write(buffer, 0, len);
        }
        fi.close();
        fo.close();
        gzip.close();
    }

    public static void main(String[] args) throws IOException{
        File path = new File("C:\\Users\\kulbi\\Downloads\\Compressed with my app");
        method(path);
    }
}
