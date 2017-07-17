package net.tt.plugproject.classloader.example;

import java.lang.reflect.Method;

/**
 * Created by admin on 2017/7/17.
 */

public class TestManager {
    public static void main(String[] args) {
        testClassIdentity();
    }
    public static void testClassIdentity() {
      /*  String classDataRootPath = "C:\\workspace\\Classloader\\classData";
        FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath); // 用file 加载 class文件的类
        FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);
        String className = "com.example.Sample";
        try {
            Class<?> class1 = fscl1.loadClass(className);
            Object obj1 = class1.newInstance();
            Class<?> class2 = fscl2.loadClass(className);
            Object obj2 = class2.newInstance();
            Method setSampleMethod = class1.getMethod("setSample", java.lang.Object.class);
            setSampleMethod.invoke(obj1, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

}
