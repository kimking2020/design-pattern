package com.kimking.pattern.structure.proxy;


/**
 * <p>
 *
 * @author kim
 * @date 2020/9/14
 */
public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Filename: " + filename);
    }


}
