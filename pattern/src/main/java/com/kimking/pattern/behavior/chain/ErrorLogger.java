package com.kimking.pattern.behavior.chain;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/14
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String msg) {
        System.out.println("ErrorLogger: " + msg);
    }
}
