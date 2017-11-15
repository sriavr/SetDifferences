package com.sridhar;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class ClassA {

    private Long id;

    private String label;

    private String property1;

    private boolean property2;

    public ClassA(Long id, String label, String property1, boolean property2) {
        this.id = id;
        this.label = label;
        this.property1 = property1;
        this.property2 = property2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public boolean isProperty2() {
        return property2;
    }

    public void setProperty2(boolean property2) {
        this.property2 = property2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append(id).append(label).append(property1).append(property2).toString();
    }


    @Override
    public int hashCode() {
        return Objects.hash(label);
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
        ClassA classA = (ClassA) o;
        // field comparison
        return Objects.equals(label, classA.getLabel());
    }
}
