package net.tt.plugproject.classloader.example;

/**
 * Created by admin on 2017/7/17.
 */

public class Sample {
    private Sample instance;
    public void setSample(Object instance){
        this.instance = (Sample) instance;
    }
}
