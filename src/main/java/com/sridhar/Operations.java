package com.sridhar;

import com.sridhar.modified.CmpClassA;
import com.sridhar.modified.CmpClassType;

import java.util.*;

public class Operations {

    public Set<ClassType> modifiedClassTypes(Set<ClassType> oldClassTypes, Set<ClassType> newClassTypes){
        Set<ClassType> result = new HashSet<>(oldClassTypes);
        result.retainAll(newClassTypes);
        return result;
    }

    public Set<ClassType> modifiedClassTypesWithProperties(Set<ClassType> oldClassTypes, Set<ClassType> newClassTypes){
        Set<ClassType> similarClassTypes = modifiedClassTypes(oldClassTypes, newClassTypes);
        Map<ClassType, ClassType> oldClassTypesMap = new HashMap<>();
        oldClassTypes.forEach(t -> oldClassTypesMap.put(t,t));

        Map<ClassType, ClassType> newClassTypesMap = new HashMap<>();
        newClassTypes.forEach(t -> newClassTypesMap.put(t,t));

        //process all similar types and print only those that differ
        for(ClassType classType: similarClassTypes){
            ClassType oldClassType =  oldClassTypesMap.get(classType);
            ClassType newClassType = newClassTypesMap.get(classType);
            if(!Objects.equals(oldClassType.getA().getProperty1(), newClassType.getA().getProperty1())){
                System.out.println("oldClassType = " + oldClassType + "\n newClassType = "+ newClassType + " property1 differs");
            }
            if(!Objects.equals(oldClassType.getA().isProperty2(), newClassType.getA().isProperty2())){
                System.out.println("oldClassType = " + oldClassType + "\n newClassType = "+ newClassType + " property2 differs");
            }
            if(Objects.equals(oldClassType.getA().getProperty1(), newClassType.getA().getProperty1())){
                System.out.println("SIMILAR CASE");
            }
        }

        return similarClassTypes;
    }

    private Set<CmpClassType> transform(Set<ClassType> classTypes) {
        Set<CmpClassType> cmpClassTypes = new HashSet<>();
        for(ClassType classType: classTypes){
            ClassA a = classType.getA();
            ClassB b = classType.getB();

            CmpClassA cmpClassA = new CmpClassA(a);
            CmpClassType cmpClassType = new CmpClassType(null, cmpClassA, b);
            cmpClassTypes.add(cmpClassType);
        }
        return cmpClassTypes;
    }

    public Set<ClassType> newlyAddedClassTypes(Set<ClassType> oldClassTypes, Set<ClassType> newClassTypes){
        Set<ClassType> result = new HashSet<>(newClassTypes);
        result.removeAll(oldClassTypes);
        return result;
    }

    public Set<ClassType> removedClassTypes(Set<ClassType> oldClassTypes, Set<ClassType> newClassTypes){
        Set<ClassType> result = new HashSet<>(oldClassTypes);
        result.removeAll(newClassTypes);
        return result;
    }

}
