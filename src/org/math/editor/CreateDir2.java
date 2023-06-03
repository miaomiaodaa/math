package org.math.editor;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CreateDir2 {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Math\\临时中转区\\newLine\\main.md");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            FileOutputStream fileOutputStream = null;
            OutputStreamWriter outputStreamWriter = null;
            BufferedWriter bufferedWriter = null;
            String line = null;
            while ((line=bufferedReader.readLine())!=null) {
                if (line.startsWith("【")&&line.endsWith("】")) {
                    if (null != bufferedWriter) {
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                    File newFile = new File(line.substring(1,line.length()-1)+".md");
                    fileOutputStream = new FileOutputStream(newFile);
                    outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                    bufferedWriter = new BufferedWriter(outputStreamWriter);
                    continue;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
