package com.kimking.pattern.structure.proxy;

/**
 * <p>
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 *
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 *
 * @author kim
 * @date 2020/9/14
 */
public class ProxyImage implements Image {

    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
