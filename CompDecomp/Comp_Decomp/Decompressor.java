package Comp_Decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Decompressor {
    public static void method(File file)throws IOException {
        String FileDirectory = file.getParent();

        FileInputStream fi = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fi);
        FileOutputStream fo = new FileOutputStream(FileDirectory + "/DecompressedFile.txt");

        byte[] buffer = new byte[1024];
        int len;

        while ((len = gzip.read(buffer)) != -1){
            fo.write(buffer, 0, len);
        }
        gzip.close();
        fi.close();
        fo.close();
    }

    public static void main(String[] args) throws IOException{
        File path = new File("C:\\Users\\kulbi\\Downloads\\Compressed with my app\\Compressed.gz");
        method(path);
    }
}
