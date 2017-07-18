package net.tt.reflection.example;

/**
 * Created by admin on 2017/7/18.
 */

public class JarPath {
    public static void main(String[] arr){
        System.getProperty("sun.boot.class.path");
        System.getProperty("java.ext.dirs");
        System.getProperty("java.class.path");
    }
}
