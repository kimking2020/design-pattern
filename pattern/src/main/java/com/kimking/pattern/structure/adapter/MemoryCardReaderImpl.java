package com.kimking.pattern.structure.adapter;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class MemoryCardReaderImpl implements MemoryCardReader{

    @Override
    public void readMemoryCard(String content) {
        System.out.println(content);
    }
}
