package com.ll.exam;

import java.beans.Introspector;
import java.lang.reflect.InvocationTargetException;

public class Ut {
    public static class cls {

        public static <T> T newObj(Class<T> cls, T defalutValue) {
            try {
                return cls.getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                return defalutValue;
            } catch (IllegalAccessException e) {
                return defalutValue;
            } catch (InvocationTargetException e) {
                return defalutValue;
            } catch (NoSuchMethodException e) {
                return defalutValue;
            }
        }
    };

    public static class str {
        public static String decapitalize(String str) {
            if(str == null || str.length() == 0) {
                return str;
            }

            char c[] = str.toCharArray();
            c[0] = Character.toLowerCase(c[0]);

            return new String(c);
        }
    };
}
