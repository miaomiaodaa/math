package org.math.editor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class CreateDirByArray {
    public static void main(String[] args) {
        try {
            boolean isDir = false;
            File parent = new File("E:\\Math\\work_space\\algebra\\003-入门课程-数学分析\\003 函数极限(6种)\\008 例题\\002 极限四则运算");
            String[] names = new String[]{"多项式函数的极限", "有理函数的极限1", "有理函数的极限2", "有理函数的极限3", "有理函数的极限4", "无理函数极限", "其他1", "其他2"};
            int ser = 1;
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
