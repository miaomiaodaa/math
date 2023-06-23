package org.math.editor.transfer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReformatByLine2 {
    private static boolean write = true;

    public static void main(String[] args) {
        File md = new File("E:\\Math\\temp_space\\for_latex_formate.md");
        formatByLine(md);
    }

    private static void formatByLine(File md) {
        try {
            FileInputStream fileInputStream = new FileInputStream(md);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("$");
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

                stringBuffer.append(line);
            }

            int begin = 0;
            int back = -1;
            while (-1 != (begin = stringBuffer.indexOf("\\\\", begin))) {
                stringBuffer.replace(begin, begin + 2, "$\r\n\r\n$");
                /*back = begin - 1;
                while (back != -1) {
                    char charAt = stringBuffer.charAt(back);
                    if (charAt == '$')
                        break;

                    if (FormatUtils.isChinese(charAt) || charAt == '*') {
                        stringBuffer.insert(back + 1, "$");
                        begin++;
                        break;
                    }
                    back--;
                }*/
                begin += "$\r\n\r\n$".length();
            }

            stringBuffer.append("$");

            //System.out.println(stringBuffer);

            if (write) {
                FileOutputStream fileOutputStream = new FileOutputStream(md);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                //bufferedWriter.write("****");
                //bufferedWriter.newLine();
                bufferedWriter.write(stringBuffer.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStreamWriter.close();
                fileOutputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
