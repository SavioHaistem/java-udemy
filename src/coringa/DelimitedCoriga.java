package coringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DelimitedCoriga {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3);
        List<Double> doubles = Arrays.asList(3.5,4.0,4.5);
        List<String> strings = Arrays.asList("six","seven","eight");
        List<Object> objects = new ArrayList<>();

        copy(integers,objects);
        copy(doubles,objects);
        copy(strings,objects);
        System.out.println(objects);
    }

    //Delimited wildcard allows to programmer create a multiple types array object Object
    //<? extends Type> says the List type extends this Type
    //<? super Type> says the List to add is derived of Type
    public static void copy(List<?> source, List<? super Object> path) {
        path.addAll(source);
    }

    public static void mixNumbers(List<? extends Number> numbers, List<? super Object> destiny) {
        destiny.addAll(numbers);
        //List<? extends Number> allows to algorithm get all Numbers of any numbersList, but this
        //not allows to algorithm add this <? extends Number> to List<Object>, for this you will:
        //create the prop: List<? super Object> because this allow the algorithm to place any object
        //derived of Object type
    }
}
