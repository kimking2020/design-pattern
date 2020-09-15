package com.kimking.pattern.behavior.iterator;

/**
 * <p>
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 *
 * 迭代器模式属于行为型模式。
 *
 * @author kim
 * @date 2020/9/14
 */
public class NameRepo implements Container {

    public String names[] = {"cat", "dog", "mouse", "duck", "sheep"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
