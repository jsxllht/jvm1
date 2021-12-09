package com.jsxl.jvm.gc;


public class T_GCModel {
    public static void main(String[] args) {
        GcObject obj1 = new GcObject();
        GcObject obj2 = new GcObject();
        obj1.instance = obj2;
        obj2.instance = obj1;
        obj1 = null;
        obj2 = null;
        //System.gc();//通知，进行一次 Full GC
    }

}
class GcObject {
    public Object instance = null;
}