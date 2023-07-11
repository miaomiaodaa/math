package org.math.editor;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

@Deprecated
// replaced by InsertFileOrDir
public class ReplaceFilePrefix {
    public static void main(String[] args) {
        File dir = new File("E:\\Math\\工作区\\代数\\线性代数\\2 矩阵\\V2\\16 伴随矩阵\\2 引理-A乘A伴随");
        File[] files = dir.listFiles(pathname -> pathname.getName().endsWith(".md"));
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            String fileName = files[i].getName();
            try {
                String canonicalPath = file.getParentFile().getCanonicalPath();
                fileName = fileName.replace("伴随矩阵的性质-", "");
                Files.move(Paths.get(file.getCanonicalPath()), Paths.get(canonicalPath + File.separator + fileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
