package by.java.main.myabstr.model;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class NewEquipment implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "Check new sports equipment.";
    }
}
