package org.math.editor.transfer;

import org.math.editor.FormatUtils;
import org.math.editor.LatexCompatibilityReformat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class ReformatByLine {
    public static void main(String[] args) {
        File md = new File("E:\\Math\\work_space\\algebra\\003-入门课程-数学分析\\002 数列极限\\008 数列收敛判定方法\\004 Stolz定理\\001 定理-Stolz定理-零比零型.md");
        formatByLine(md);
        LatexCompatibilityReformat.readReformatFile(md);
    }

    private static void formatByLine(File md) {
        try {
            FileInputStream fileInputStream = new FileInputStream(md);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            List<String> lines = new ArrayList<>();
            while (null != (line = bufferedReader.readLine())) {
                if (line.replaceAll("\\\\", "").equals("") || line.equals(""))
                    continue;

                line = line.replaceAll("\\\\lim_", "\\\\lim\\\\limits_")
                        .replaceAll("\\\\prod_", "\\\\prod\\\\limits_")
                        .replaceAll("\\\\frac", "\\\\dfrac");

                lines.add(line);
            }

            for (int i = 0; i < lines.size(); i++) {
                String str = lines.get(i);
                if (FormatUtils.containsChinese(str))
                    continue;

                if (str.endsWith("\\\\")) {

                    for (int j = i - 1; j >= 0; j--) {
                        String back = lines.get(j);
                        if (back.endsWith("\\\\") || back.endsWith("$")) {
                            int k = j;
                            String here = lines.get(++k);
                            while (FormatUtils.containsChinese(here)) {
                                here = lines.get(++k);
                            }
                            here = "$" + here;
                            back = back.substring(0, back.length() - 2) + "$";
                            lines.set(j, back);
                            lines.set(k, here);
                            break;
                        }

                        if (j == 0) {
                            str = "$" + str;
                            lines.set(i, str);
                        }
                    }
                }
            }

            for (int i = 0; i < lines.size(); i++) {
                String str = lines.get(i);
                if (str.endsWith("\\\\")) {
                    str = str.substring(0, str.length() - 2) + "$";
                    lines.set(i, str);
                    continue;
                }

                if (!FormatUtils.containsChinese(str) && !str.startsWith("$") && !str.endsWith("$")) {
                    str = ("$" + str + "$");
                    lines.set(i, str);
                    continue;
                }

                /*if (str.endsWith("$")) {
                    str = (str + "  \n");
                    lines.set(i, str);
                }*/
            }

            FileOutputStream fileOutputStream = new FileOutputStream(md);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            for (int i = 0; i < lines.size(); i++) {
                bufferedWriter.write(lines.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
