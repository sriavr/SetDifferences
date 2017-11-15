package com.sridhar.modified;

import com.sridhar.ClassA;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class CmpClassA extends ClassA {

    public CmpClassA(Long id, String label, String property1, boolean property2) {
        super(id, label, property1, property2);
    }

    public CmpClassA(ClassA classA){
        super(classA.getId(), classA.getLabel(), classA.getProperty1(), classA.isProperty2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLabel(), getProperty1(), isProperty2());
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        CmpClassA cmpClassA = (CmpClassA) o;
        // field comparison
        return Objects.equals(getLabel(), cmpClassA.getLabel()) &&
                Objects.equals(getProperty1(), cmpClassA.getProperty1()) &&
                Objects.equals(isProperty2(), cmpClassA.isProperty2());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
