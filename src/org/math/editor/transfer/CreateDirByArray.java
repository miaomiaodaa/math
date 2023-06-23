package org.math.editor.transfer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class CreateDirByArray {
    public static void main(String[] args) {
        try {
            boolean isDir = false;
            File parent = new File("E:\\Math\\work_space\\algebra\\003-入门课程-数学分析\\004 函数列极限\\006 必要条件\\003 换序定理-逐项可导");
            String[] names = new String[]{"引问", "定理", "证明", "推论1", "推论2"};
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
