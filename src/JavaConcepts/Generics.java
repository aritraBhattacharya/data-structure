package JavaConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Generics {

    private void checkInvariance() {
        List<Object> objectList = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        //generic types in Java are invariant, meaning that List<String> is not a subtype of List<Object>

        objectList = strings; // Not allowed
        strings = objectList; // Not allowed

        // but java uses wild card ?
        /*
        * interface Collection<E> ... {
        * void addAll(Collection<? extends E> items)
        * }
        * */
        objectList.addAll(strings); // allowed as ? :Extends E, string extends Object

        class A{}
        class B extends A{}
        class C extends A{}
        class D extends A{}

        class MyGenericClass<T extends A>{}

        MyGenericClass<A> aMyGenericClass = new MyGenericClass<>();
        aMyGenericClass = new MyGenericClass<B>();




    }

}
