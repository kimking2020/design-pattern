package com.kimking.pattern.create.sigleton;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class PersonLazy {
    private static PersonLazy instance;

    private PersonLazy() {

    }

    /**
     * 线程不安全
     * @return
     */
    public static PersonLazy getInstance() {
        if (instance == null) {
            instance = new PersonLazy();
        }
        return instance;
    }

    /**
     * 线程安全
     * @return
     */
    public static synchronized PersonLazy getSecInstance() {
        if (instance == null) {
            instance = new PersonLazy();
        }
        return instance;
    }

}
