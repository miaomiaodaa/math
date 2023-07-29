package org.math.editor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InsertFileOrDir {
    public static void main(String[] args) {
        String name = ""; // 新文件的文件名
        String add_prefix = ""; // 添加统一前缀
        String del_prefix = ""; // 删除统一前缀
        int begin_num = 1; // 从第N个开始
        int end_num = 999;
        int step = -6; // 每次增加或减少step个
        File dir = new File("E:\\Math\\work_space\\math\\005-入门课程-解析几何\\008 三角形\\015 任意角三角函数");


        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            String fileName = files[i].getName();

            if ("098 resources".equals(fileName))
                continue;

            try {
                String fileSeir = fileName.substring(0, file.getName().indexOf(" "));
                char[] charArray = fileSeir.toCharArray();
                int x = 0;
                for (; x < charArray.length; x++)
                    if (charArray[x] != '0')
                        break;
                fileSeir = fileSeir.substring(x);

                Integer i1 = Integer.valueOf(fileSeir);
                if (i1 <= begin_num)
                    continue;
                if (i1 >= end_num)
                    break;

                int ser = i1 + step;
                String ii = (ser < 10 ? "00" + (ser) : (ser < 100 ? "0" + (ser) : (ser + "")));
                String newFileName = file.getParentFile().getCanonicalPath() + File.separator + ii + " " + add_prefix + file.getName().substring(file.getName().indexOf(" ") + 1);
                if (!del_prefix.isEmpty())
                    newFileName = newFileName.replace(del_prefix, "");
                Files.move(Paths.get(file.getCanonicalPath()), Paths.get(newFileName));

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        if (name.isEmpty())
            return;

        try {
            File file = new File(dir, name + ".md");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write("**内容**");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
