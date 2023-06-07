package org.math.editor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class CreateDir {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Math\\work_space\\algebra\\线性代数\\17 相似标准型-分块对角化-V2\\001 目录.md");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int ser = 2;
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("**") && line.endsWith("**")) {
                    File newFile = new File(file.getParentFile(), (ser < 10 ? "00" + (ser) : (ser < 100 ? "0" + (ser) : ser)) + " " + line.substring(2, line.length() - 2));
                    newFile.mkdirs();
                    ser++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
