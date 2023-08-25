package org.math.editor.formate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InitCache {
    public static Map<String,Long> cache = new HashMap<>();
    
    public static void main(String[] args) {
        String[] dirs = new String[]{
                "E:\\Math\\work_space\\math\\004-入门课程-线性代数",
                "E:\\Math\\work_space\\math\\003-入门课程-数学分析",
                "E:\\Math\\work_space\\math\\005-入门课程-解析几何",
                "E:\\Math\\work_space\\math\\002-初等数学\\004 关于三角函数"
        };

        for (int i = 0; i < dirs.length; i++) {
            File dir = new File(dirs[i]);
            InitCache.loadLastModified(dir);
        }
        
        try {
            File cacheFile = new File("cache.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(cacheFile);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            Iterator<Map.Entry<String, Long>> iterator = cache.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Long> next = iterator.next();
                bufferedWriter.write(next.getKey()+"#"+next.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

            System.out.println(InitCache.readCache().size());
        }catch(Exception e) {
          e.printStackTrace();
        }
    }

    private static void loadLastModified(File dir) {
        File[] dirs = dir.listFiles();

        List<File> fileList = new ArrayList<>();
        for (int j = 0; j < dirs.length; j++) {
            if (dirs[j].isDirectory()) {
                InitCache.loadLastModified(dirs[j]);
            } else
                fileList.add(dirs[j]);
        }

        for (int i = 0; i < fileList.size(); i++) {
            File mdFile = fileList.get(i);
            try {
                cache.put(mdFile.getCanonicalPath(),mdFile.lastModified());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static Map<String,Long> readCache() {
        Map<String,Long> cache = new HashMap<>();
        try {
            File cacheFile = new File("cache.txt");
            FileInputStream fileInputStream = new FileInputStream(cacheFile);
            InputStreamReader reader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null) {
                String[] split = line.split("#");
                cache.put(split[0],Long.valueOf(split[1]));
            }
            bufferedReader.close();
            reader.close();
            fileInputStream.close();
        }catch(Exception e) {
          e.printStackTrace();
        }
        return cache;
    }
    
    public static void updateCache(Map<String,Long> cache) {
        try {
            File cacheFile = new File("cache.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(cacheFile);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            Iterator<Map.Entry<String, Long>> iterator = cache.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Long> next = iterator.next();
                bufferedWriter.write(next.getKey()+"#"+next.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
