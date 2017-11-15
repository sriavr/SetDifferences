package com.sridhar;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class ClassType {

    private Long id;

    private ClassA A;

    private ClassB B;

    public ClassType(Long id, ClassA a, ClassB b) {
        this.id = id;
        A = a;
        B = b;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClassA getA() {
        return A;
    }

    public void setA(ClassA a) {
        A = a;
    }

    public ClassB getB() {
        return B;
    }

    public void setB(ClassB b) {
        B = b;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append(id).append(A).append(B).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, A, B);
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
        ClassType classType = (ClassType) o;
        // field comparison
        return Objects.equals(A, classType.getA())
                && Objects.equals(B, classType.getB());
    }
}
