package org.math.editor;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CreateDir {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Math\\工作区\\代数\\线性代数\\12 特征值-特征向量-V2\\1 目录.md");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            
            int ser=1;
            String line = null;
            while ((line=bufferedReader.readLine())!=null) {
                if (line.startsWith("**")&&line.endsWith("**")) {
                    File newFile = new File(file.getParentFile(),ser+" "+line.substring(2,line.length()-2));
                    newFile.mkdirs();
                    ser++;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
