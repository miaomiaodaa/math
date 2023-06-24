package org.math.editor.transfer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class CreateDirByArray {
    public static void main(String[] args) {
        try {
            boolean isDir = false;
            File parent = new File("E:\\Math\\work_space\\algebra\\005-入门课程-解析几何\\001 基础篇\\002 向量基础运算");
            String[] names = new String[]{"定义-向量减法", "定义-向量数乘", "命题-运算律(合集)", "命题-向量的三角不等式", "定义-单位化"};
            int ser = 2;
            for (int i = 0; i < names.length; i++) {
                String prefix = String.valueOf((ser < 10 ? "00" + (ser) : (ser < 100 ? "0" + (ser) : ser)));
                String name = prefix + " " + names[i];
                if (!isDir) {
                    name = name + ".md";
                }
                File dirOrFile = new File(parent, name);
                if (isDir) {
                    dirOrFile.mkdirs();
                } else {
                    FileOutputStream fileOutputStream = null;
                    OutputStreamWriter outputStreamWriter = null;
                    BufferedWriter bufferedWriter = null;
                    fileOutputStream = new FileOutputStream(dirOrFile);
                    outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                    bufferedWriter = new BufferedWriter(outputStreamWriter);
                    bufferedWriter.write("**内容**");
                    bufferedWriter.newLine();
                    bufferedWriter.write("**解**");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }

                ser++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
