/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader_vs_scanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author defendi.andrea
 */
public interface generaFile {

    public static void file() throws IOException {
        String path = "C:\\Users\\defendi.andrea\\Desktop\\file.txt";
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < 10; i++) {
                double num = Math.random() * 256;
                String str = String.valueOf(num);
                bw.write(str);
                bw.flush();
                bw.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
