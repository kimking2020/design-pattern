package com.kimking.pattern.create.absfactory;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }

}
