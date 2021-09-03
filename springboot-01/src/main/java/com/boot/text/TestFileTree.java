package com.boot.text;

import java.io.File;

public class TestFileTree {

    public static void main(String[] args) {
        File file = new File("D:\\Notepad++");
        printFile(file,0);
    }

    /**
     * @param file 文件名
     * @param level 文件层次
     */
    static void printFile(File file,int level){
        //输出层次
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        //输出文件名
        if (file.isFile()) {
            System.out.println(file.getName());
        }
        //如果file是目录,则获取子文件列表,并对每个子文件进行相同的操作
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp : files) {
                //递归调用该方法,+1
                printFile(temp,level+1);
            }
        }
    }
}
