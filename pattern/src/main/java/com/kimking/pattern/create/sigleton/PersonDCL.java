package com.kimking.pattern.create.sigleton;

/**
 * <p> 双检锁/双重校验锁（DCL，即 double-checked locking）
 *
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 *
 * @author kim
 * @date 2020/9/9
 */
public class PersonDCL {

    /**
     * volatile修饰的变量不允许线程内部缓存和重排序，即直接修改内存
     */
    private volatile static PersonDCL instance;

    private PersonDCL() {}

    public PersonDCL getInstance() {
        if (instance == null) {
            synchronized (PersonDCL.class) {
                if (instance == null) {
                    instance = new PersonDCL();
                }
            }
        }
        return instance;
    }

}
