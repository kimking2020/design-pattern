package com.kimking.pattern.behavior.template;

/**
 * <p>
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
 *
 * @author kim
 * @date 2020/9/15
 */
public abstract class Game {

    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play() {
        initialize();
        start();
        end();
    }
}
