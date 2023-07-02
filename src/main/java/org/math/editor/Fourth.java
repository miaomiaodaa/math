package org.math.editor;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * 将多个文件夹中的文件合并到一个文件夹中，并依次重新变号
 */
public class Fourth {
    public static void main(String[] args) {
        File dir = new File("E:\\重新梳理-矩阵\\9 分块矩阵\\1 定义");
        File[] files = dir.listFiles(pathname -> pathname.isDirectory());
        Arrays.sort(files, (o1, o2) -> {
            String o1Name = o1.getName();
            Integer i1 = Integer.valueOf(o1Name.substring(0, o1.getName().indexOf(" ")));

            String o2Name = o2.getName();
            Integer i2 = Integer.valueOf(o2Name.substring(0, o2.getName().indexOf(" ")));

            return i1 - i2;
        });

        List<File> fileList = Arrays.asList(files);
        int step = 0;
        for(File file : fileList) {
            if (file.isDirectory()) {
                List<File> subFileList = Arrays.asList(file.listFiles());
                int each = 0;
                for (File mdFile : subFileList) {
                    try {
                        String fileName = mdFile.getName();
                        Integer i1 = Integer.valueOf(fileName.substring(0, file.getName().indexOf(" ")));
                        String newFileName = (each=i1+step) + " " + mdFile.getName().substring(mdFile.getName().indexOf(" ") + 1);
                        Files.move(Paths.get(mdFile.getCanonicalPath()), Paths.get(dir+File.separator+newFileName));
                        System.out.println(newFileName);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
                step=each;
            }
        }
    }
}
