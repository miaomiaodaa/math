package org.math.editor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RestDirNum {
    public static void main(String[] args) {
        File dir = new File("E:\\Math\\工作区\\代数\\线性代数");
        extracted(dir);
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

        
        Collections.sort(fileList, (o1, o2) -> {
            try {
                String o1Name = o1.getName();
                Integer i1 = Integer.valueOf(o1Name.substring(0, o1.getName().indexOf(" ")));

                String o2Name = o2.getName();
                Integer i2 = Integer.valueOf(o2Name.substring(0, o2.getName().indexOf(" ")));

                return i1 - i2;
            }catch (Exception e) {
                return -100;
            }
        });

        for (int i=0; i<fileList.size(); i++) {
            File mdFile = fileList.get(i);
            String o2Name = mdFile.getName();
            try {
                Integer i2 = Integer.valueOf(o2Name.substring(0, o2Name.indexOf(" ")));
                String newFileName = (i2<10?"00"+(i2):(i2<100?"0"+(i2):i2)) + " " + mdFile.getName().substring(mdFile.getName().indexOf(" ") + 1);
                Files.move(Paths.get(mdFile.getCanonicalPath()), Paths.get(mdFile.getParentFile().getCanonicalPath()+File.separator+newFileName));
                System.out.println(newFileName);
            } catch (Exception e1) {
                try {
                    System.out.println(mdFile.getCanonicalPath());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
