package com.ll.exam;

import com.ll.exam.article.controller.ArticleController;
import com.sun.tools.javac.code.TypeAnnotationPosition;

import java.beans.Introspector;
import java.lang.reflect.InvocationTargetException;

public class Ut {
    public static class cls {

        public static Object newObj(Class cls, Object defalutValue) {
            try {
                cls.getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }

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
