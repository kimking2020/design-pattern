package com.kimking.pattern.structure.adapter;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class Computer implements UsbReader {

    private MemoryCardReaderAdapter adapter;

    public Computer(MemoryCardReaderAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void readUsb(String type, String content) {
        if (type.equalsIgnoreCase("usb")) {
            System.out.println(content);
        } else if (type.equalsIgnoreCase("memoryCard")) {
            adapter.readUsb(type, content);
        } else {
            System.out.println("Type not support");
        }
    }

}
