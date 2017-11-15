package com.sridhar;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class ClassB {

    private Long id;

    private String label;

    public Long getId() {
        return id;
    }

    public ClassB(Long id, String label) {
        this.id = id;
        this.label = label;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append(id).append(label).toString();
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
        ClassB classB = (ClassB) o;
        // field comparison
        return Objects.equals(label, classB.getLabel());
    }
}
