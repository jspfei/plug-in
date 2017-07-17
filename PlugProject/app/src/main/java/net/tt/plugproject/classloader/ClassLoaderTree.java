package net.tt.plugproject.classloader;

/**
 * Created by admin on 2017/7/17.
 */

public class ClassLoaderTree {
    public static void main(String[] args) {
        ClassLoader loader = ClassLoaderTree.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();

         /*   sun.misc.Launcher$AppClassLoader@70dea4e  系统类加载器
            sun.misc.Launcher$ExtClassLoader@4aa298b7   扩展类加载器

            */
        }
    }
}
