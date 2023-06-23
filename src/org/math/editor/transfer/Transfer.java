package org.math.editor.transfer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Transfer {
    public static void main(String[] args) {
        try {
            Node root = new Node();
            File md = new File("E:\\Math\\temp_space\\transfer\\定义.txt");
            FileInputStream fileInputStream = new FileInputStream(md);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            //StringBuffer stringBuffer = new StringBuffer();
            int levelIndex = 0;
            while (null != (line = bufferedReader.readLine())) {
                System.out.println("[" + line + "] space num is " + countSpaceNum(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int countSpaceNum(String line) {
        char[] chars = line.toCharArray();
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ')
                num++;
            else break;
        }
        return num;
    }
}
