package org.math.editor;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AddOrSubFileNumFrom {
    public static void main(String[] args) {
        int begin_num = 18;
        int step = -1;
        File dir = new File("E:\\Math\\重新梳理-线性空间");
        File[] files = dir.listFiles(pathname -> pathname.isDirectory());
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            String fileName = files[i].getName();
            try {
                Integer i1 = Integer.valueOf(fileName.substring(0, file.getName().indexOf(" ")));
                if (i1 > begin_num) {
                    String newFileName = file.getParentFile().getCanonicalPath() + File.separator + (i1 + step) + " " + file.getName().substring(file.getName().indexOf(" ") + 1);
                    Files.move(Paths.get(file.getCanonicalPath()), Paths.get(newFileName));
                }
            } catch (Exception e1) {
            }
        }
    }
}
