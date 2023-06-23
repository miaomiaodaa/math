package org.math.editor.transfer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class CreateDirByArray {
    public static void main(String[] args) {
        try {
            boolean isDir = false;
            File parent = new File("E:\\Math\\work_space\\algebra\\003-入门课程-数学分析\\005 连续\\001 连续\\004 必要条件\\002 闭区间");
            String[] names = new String[]{"有界性", "最值定理", "零点定理", "(康拖)一致连续性定理"};
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
