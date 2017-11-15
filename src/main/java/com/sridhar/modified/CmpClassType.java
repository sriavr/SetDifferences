package com.sridhar.modified;

import com.sridhar.ClassB;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class CmpClassType {

    private CmpClassA A;

    private ClassB B;

    public CmpClassType(Long id, CmpClassA a, ClassB b) {
        A = a;
        B = b;
    }

    public CmpClassA getA() {
        return A;
    }

    public void setA(CmpClassA a) {
        A = a;
    }

    public ClassB getB() {
        return B;
    }

    public void setB(ClassB b) {
        B = b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B);
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
        CmpClassType cmpClassType = (CmpClassType) o;
        // field comparison
        return Objects.equals(A, cmpClassType.getA())
                && Objects.equals(B, cmpClassType.getB());
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append(A).append(B).toString();
    }
}
