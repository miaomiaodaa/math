package org.math.editor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class CreateDirByArray {
    public static void main(String[] args) {
        try {
            boolean isDir = false;
            File parent = new File("E:\\Math\\work_space\\algebra\\003-入门课程-数学分析\\003 函数极限(6种)\\007 充要条件(6种)\\004 无穷小量定理");
            String[] names = new String[]{"定理", "证明", "举例", "推广1-趋于零负", "推广2-趋于零正", "推广3-趋于无穷", "推广4-趋于正无穷", "推广5-趋于负无穷", "统一标记"};
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
