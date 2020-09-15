package com.kimking.pattern.structure.adapter;

/**
 * <p>适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 *
 * 这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。
 *
 * @author kim
 * @date 2020/9/10
 */
public class MemoryCardReaderAdapter implements UsbReader {

    MemoryCardReader memoryCardReader;

    @Override
    public void readUsb(String type, String content) {
        if (type.equalsIgnoreCase("memoryCard")){
            memoryCardReader.readMemoryCard(content);
        } else {
            System.out.println("Type invalid");
        }
    }
}
