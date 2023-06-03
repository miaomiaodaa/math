package org.math.editor;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 批量序号增加或减少相同的长度，加前缀
 * 
 * input_num>0 增加
 * input_num<0 减少
 * input_num=0 不变
 * 
 */
public class Third {
    public static void main(String[] args) {
        int input_num = 0;
        File dir = new File("E:\\Math\\重新梳理-线性映射\\3 线性空间的映射");
        String common_prefix = "定义-";
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            String fileName = files[i].getName();
            try {
                Integer i1 = Integer.valueOf(fileName.substring(0, file.getName().indexOf(" ")));
                String newFileName = file.getParentFile().getCanonicalPath() + File.separator + (i1 + input_num) + " " + common_prefix + file.getName().substring(file.getName().indexOf(" ") + 1);
                System.out.println(newFileName);
                Files.move(Paths.get(file.getCanonicalPath()), Paths.get(newFileName));
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
}
