package org.math.editor;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RestFileNum {
    public static void main(String[] args) {
        File dir = new File("E:\\Math\\工作区\\代数\\线性代数\\4【解线性方程组】与【线性空间入门】\\14 极大无关组");
        File[] dirs = dir.listFiles(pathname -> pathname.isDirectory());
        Arrays.sort(dirs, (o1, o2) -> {
            String o1Name = o1.getName();
            Integer i1 = Integer.valueOf(o1Name.substring(0, o1.getName().indexOf(" ")));

            String o2Name = o2.getName();
            Integer i2 = Integer.valueOf(o2Name.substring(0, o2.getName().indexOf(" ")));

            return i1 - i2;
        });

        List<File> fileList = Arrays.asList(dirs);
        for(File file : fileList) {
            if (file.isDirectory()) {
                List<File> subFileList = Arrays.asList(file.listFiles());
                for (int i=0; i<subFileList.size(); i++) {
                    try {
                        File mdFile = subFileList.get(i);
                        String newFileName = (i+1) + " " + mdFile.getName().substring(mdFile.getName().indexOf(" ") + 1);
                        Files.move(Paths.get(mdFile.getCanonicalPath()), Paths.get(mdFile.getParentFile().getCanonicalPath()+File.separator+newFileName));
                        System.out.println(newFileName);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }
}
