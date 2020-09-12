package io.cjf.testdesignpattern.proxy;

import java.lang.reflect.Method;

public class BeanUtil {

    public static Object createProxy(Class targetClazz, Class interfaze) {
        return null;
    }

    public static DynamicProxy createProxy(Object object, Class interfaze, Method method) {
        Class<?> aClass = object.getClass();
        return null;
    }

}
