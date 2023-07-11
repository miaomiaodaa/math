package org.math.editor.transfer;

import org.math.editor.formate.FormatUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class CreateDirByArray {
    private static int SPACE_NUM = 3;

    public static void main(String[] args) {
        try {
            boolean isDir = false;
            String beginName = "可去间断";
            String endName = "振荡间断";
            String pre = "定义-";
            int ser = 2;

            File parent = new File("E:\\Math\\work_space\\algebra\\003-入门课程-数学分析\\004 函数的连续与间断(特殊的极限)\\002 间断");

            File target = new File(ReformatByLine3.parent, ReformatByLine3.fileName + ".md");
            FileInputStream fileInputStream = new FileInputStream(target);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            boolean add = false;
            List<String> dirsNames = new ArrayList<>();
            while (null != (line = bufferedReader.readLine())) {
                int i1 = FormatUtils.countSpace(line);
                String trim = line.trim();
                if (trim.equals(beginName))
                    add = true;
                if (i1 == SPACE_NUM && add) {
                    dirsNames.add(pre + trim);
                    if (trim.equals(endName))
                        break;
                }
            }

            for (String dirName : dirsNames) {
                System.out.println(dirName);
            }

            for (int i = 0; i < dirsNames.size(); i++) {
                String prefix = String.valueOf((ser < 10 ? "00" + (ser) : (ser < 100 ? "0" + (ser) : ser)));
                String name = prefix + " " + dirsNames.get(i);
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
                    bufferedWriter.write("**证明**");
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
