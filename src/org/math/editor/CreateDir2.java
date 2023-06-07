package org.math.editor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class CreateDir2 {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Math\\temp_space\\newLine\\谢-回顾_20230607_190249.md");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            FileOutputStream fileOutputStream = null;
            OutputStreamWriter outputStreamWriter = null;
            BufferedWriter bufferedWriter = null;
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("【") && line.endsWith("】")) {
                    if (null != bufferedWriter) {
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                    File newFile = new File("E:\\Math\\temp_space\\newLine\\" + line.substring(1, line.length() - 1) + ".md");
                    fileOutputStream = new FileOutputStream(newFile);
                    outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                    bufferedWriter = new BufferedWriter(outputStreamWriter);
                    continue;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
