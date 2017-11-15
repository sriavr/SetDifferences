package com.sridhar;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class OperationsTest {

    @Test
    public void testAddedClassTypes(){
        Set<ClassType> oldSet = new HashSet<>();
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1a", false),
                new ClassB(null, "ClassB1")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1b", true),
                new ClassB(null, "ClassB2")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1c", true),
                new ClassB(null, "ClassB3")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1d", false),
                new ClassB(null, "ClassB4")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA2","ClassA1#prop1a", true),
                new ClassB(null, "ClassB1")));


        Set<ClassType> newSet = new HashSet<>();
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1a", false),
                new ClassB(null, "ClassB1")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1b", true),
                new ClassB(null, "ClassB3")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1c", true),
                new ClassB(null, "ClassB4")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1d", false),
                new ClassB(null, "ClassB5")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA2","ClassA1#prop1a", true),
                new ClassB(null, "ClassB6")));

        Operations operations = new Operations();
        Set<ClassType> resultClassTypes = operations.newlyAddedClassTypes(oldSet, newSet);
        for(ClassType classType:resultClassTypes){
            System.out.println("classType = " + classType);
        }
    }

    @Test
    public void testRemovedClassTypes(){
        Set<ClassType> oldSet = new HashSet<>();
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1a", false),
                new ClassB(null, "ClassB1")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1b", true),
                new ClassB(null, "ClassB2")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1c", true),
                new ClassB(null, "ClassB3")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1d", false),
                new ClassB(null, "ClassB4")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA2","ClassA1#prop1a", true),
                new ClassB(null, "ClassB1")));


        Set<ClassType> newSet = new HashSet<>();
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1a", false),
                new ClassB(null, "ClassB1")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1b", true),
                new ClassB(null, "ClassB3")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1c", true),
                new ClassB(null, "ClassB4")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1d", false),
                new ClassB(null, "ClassB5")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA2","ClassA2#prop1a", true),
                new ClassB(null, "ClassB6")));

        Operations operations = new Operations();
        Set<ClassType> resultClassTypes = operations.removedClassTypes(oldSet, newSet);
        for(ClassType classType:resultClassTypes){
            System.out.println("classType = " + classType);
        }
    }

    @Test
    public void testModifiedClassTypes(){
        Set<ClassType> oldSet = new HashSet<>();
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1a", false),
                new ClassB(null, "ClassB1")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1b", true),
                new ClassB(null, "ClassB2")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1c", true),
                new ClassB(null, "ClassB3")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1d", false),
                new ClassB(null, "ClassB4")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA2","ClassA2#prop1a", true),
                new ClassB(null, "ClassB1")));


        Set<ClassType> newSet = new HashSet<>();
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1a", false),
                new ClassB(null, "ClassB1")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1b", true),
                new ClassB(null, "ClassB3")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1c", true),
                new ClassB(null, "ClassB4")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1d", false),
                new ClassB(null, "ClassB5")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA2","ClassA2#prop1a", true),
                new ClassB(null, "ClassB6")));

        Operations operations = new Operations();
        Set<ClassType> resultClassTypes = operations.modifiedClassTypes(oldSet, newSet);
        for(ClassType classType:resultClassTypes){
            System.out.println("classType = " + classType);
        }
    }

    @Test
    public void testModifiedClassTypesWithProperties(){
        Set<ClassType> oldSet = new HashSet<>();
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1a", false),
                new ClassB(null, "ClassB1")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1b", true),
                new ClassB(null, "ClassB2")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1c", true),
                new ClassB(null, "ClassB3")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1d", false),
                new ClassB(null, "ClassB4")));
        oldSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA2","ClassA2#prop1a", true),
                new ClassB(null, "ClassB1")));


        Set<ClassType> newSet = new HashSet<>();
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1a", false),
                new ClassB(null, "ClassB1")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1b", true),
                new ClassB(null, "ClassB3")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1c", true),
                new ClassB(null, "ClassB4")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA1","ClassA1#prop1d", false),
                new ClassB(null, "ClassB5")));
        newSet.add(new ClassType(
                null,
                new ClassA(null, "ClassA2","ClassA2#prop1a", true),
                new ClassB(null, "ClassB6")));

        Operations operations = new Operations();
        Set<ClassType> resultClassTypes = operations.modifiedClassTypesWithProperties(oldSet, newSet);
    }
}
