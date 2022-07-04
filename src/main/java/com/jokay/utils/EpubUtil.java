package com.jokay.utils;

import java.io.File;

public class EpubUtil {
    public static void main(String[] args) {
        //直接获取文件的路径（相对路径） 对应项目的根路径
        File file = new File("epub/《人类简史：从动物到上帝》[以色列]尤瓦尔-赫拉利 著.epub");
        System.out.println(file.getAbsolutePath());
    }
}
