package com.kimking.pattern.behavior.chain;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/14
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected AbstractLogger next;

    public void setNext(AbstractLogger logger) {
        next = logger;
    }

    public void logMessage(int level, String msg) {
        if (this.level <= level) {
            write(msg);
        }
        if (next != null) {
            next.logMessage(level, msg);
        }
    }

    protected abstract void write(String message);
}
