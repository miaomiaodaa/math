package org.math.editor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class LatexCompatibilityReformat {
    public static void main(String[] args) {
        File dir = new File("E:\\Math\\work_space\\algebra\\线性代数");
        extracted(dir);
    }

    private static void extracted1(File md) {
        try {
            FileInputStream fileInputStream = new FileInputStream(md);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            while (null != (line=bufferedReader.readLine())) {
                stringBuffer.append(line).append("  \n");
            }
            int begin = 0;
            int odd = 0;
            while (-1 != (begin=stringBuffer.indexOf("$",begin))) {
                if (odd%2==0){
                    stringBuffer.insert(begin," ");
                }else {
                    stringBuffer.insert(begin+1," ");
                }
                begin+=2;
                odd++;
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            
            System.out.println(stringBuffer);
            
            FileOutputStream fileOutputStream = new FileOutputStream(md);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void extracted(File dir) {
        File[] dirs = dir.listFiles();

        List<File> fileList = new ArrayList<>();
        for (int j=0; j<dirs.length; j++) {
            if (dirs[j].isDirectory())
                extracted(dirs[j]);
            else
                fileList.add(dirs[j]);
        }

        for (int i=0; i<fileList.size(); i++) {
            File mdFile = fileList.get(i);
            extracted1(mdFile);
        }
    }
    
    public static void main1(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("ab$cd$aa");
        System.out.println(stringBuffer.indexOf("$"));
        System.out.println(stringBuffer.insert(2," ")); // 插入是在前面
        System.out.println(stringBuffer.indexOf("$",4));
        System.out.println(stringBuffer.insert(7," "));
    }
}
