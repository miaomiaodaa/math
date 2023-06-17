package org.math.editor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InsertFileOrDir {
    public static void main(String[] args) {
        String name = "076 命题-二次三次整系数多项式不可约判定";
        int begin_num = 75; // 从第N个开始
        int step = 1; // 每次增加或减少step个
        File dir = new File("E:\\Math\\work_space\\algebra\\004-入门课程-线性代数\\13 多项式-V2\\040 因式分解-有理数域");
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            String fileName = files[i].getName();
            try {
                Integer i1 = Integer.valueOf(fileName.substring(0, file.getName().indexOf(" ")));
                if (i1 > begin_num) {
                    int ser = i1 + step;
                    String ii = (ser < 10 ? "00" + (ser) : (ser < 100 ? "0" + (ser) : (ser + "")));
                    String newFileName = file.getParentFile().getCanonicalPath() + File.separator + ii + " " + file.getName().substring(file.getName().indexOf(" ") + 1);
                    Files.move(Paths.get(file.getCanonicalPath()), Paths.get(newFileName));
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        if (name.isBlank())
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
