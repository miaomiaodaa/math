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
import java.util.Iterator;
import java.util.List;

/**
 * TODO
 * <p>
 * 这样就能自动生成目录了
 * 按空格数，空格数相同的是同一级目录
 */
public class ReformatByLine3 {
    public static final String parent = "E:\\Math\\work_space\\algebra\\003-入门课程-数学分析\\999 transfer";
    public static final String fileName = "draft";
    private static boolean write = true;

    public static void main(String[] args) {
        File md = new File(parent, fileName + (fileName.endsWith(".txt") ? "" : ".txt"));
        formatByLine(md);
    }

    private static void formatByLine(File md) {
        try {
            FileInputStream fileInputStream = new FileInputStream(md);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            List<String> lines = new ArrayList<>();
            while (null != (line = bufferedReader.readLine())) {
                if (line.replaceAll("\\\\", "").trim().equals("") || line.trim().equals(""))
                    continue;

                line = line.replaceAll("\\\\lim_", "\\\\lim\\\\limits_")
                        .replaceAll("\\\\prod_", "\\\\prod\\\\limits_")
                        .replaceAll("\\\\frac", "\\\\dfrac")
                        .replaceAll("\\\\liminf_", "\\\\liminf\\\\limits_")
                        .replaceAll("\\\\limsup_", "\\\\limsup\\\\limits_")
                        .replaceAll("\\\\sum_", "\\\\sum\\\\limits_")
                        .replaceAll("\\\\sup_", "\\\\sup\\\\limits_");
                //.replaceAll("\\\\int_", "\\\\int\\\\limits_");

                lines.add(line);
            }

            int step = 1;
            List<String> result = new ArrayList<>();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < lines.size(); i++) {
                String str = lines.get(i);
                if (FormatUtils.containsChinese(str)) {
                    if (stringBuffer.length() > 0) {
                        result.add(formatByLine(stringBuffer).toString());
                        stringBuffer = new StringBuffer();
                    }
                    int i1 = FormatUtils.countSpace(str);

                    /*if (i1 == 3) {
                        str = "<font color=blue>" + "Step" + step + ": " + str.trim() + "</font>";
                        result.add(str);
                        step++;
                        continue;
                    }

                    if (i1 == 0) {
                        continue;
                    }*/

                    result.add(str);
                } else
                    stringBuffer.append(str);
            }

            if (stringBuffer.length() > 0) {
                result.add(formatByLine(stringBuffer).toString());
            }

            if (write) {
                File target = new File(parent, fileName + ".md");
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                for (Iterator<String> iterator = result.iterator(); iterator.hasNext(); ) {
                    String next = iterator.next();
                    bufferedWriter.write(next);
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStreamWriter.close();
                fileOutputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static StringBuffer formatByLine(StringBuffer stringBuffer) {
        try {
            int countSpace = FormatUtils.countSpace(stringBuffer.toString());
            stringBuffer.delete(0, countSpace);

            stringBuffer.insert(0, "$");

            int begin = 0;
            while (-1 != (begin = stringBuffer.indexOf("\\\\", begin))) {
                stringBuffer.replace(begin, begin + 2, "$\r\n\r\n$");
                begin += "$\r\n\r\n$".length();
            }

            //stringBuffer.append("$\r\n\r\n");
            stringBuffer.append("$");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stringBuffer;
    }
}
