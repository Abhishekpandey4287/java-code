import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class learningStreams {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 5, 4, 1, 8, 9, 6, 3);
        /*Stream<Integer>  data = a.stream();
        Stream<Integer> sort = data.sorted();
        Stream<Integer> filter = sort.filter(n -> n%2 == 0);
        Stream<Integer> map = filter.map(n-> n*2);
        map.forEach(n -> System.out.print(n + " "));*/

        /*a.stream().sorted().filter(n-> n%2==0).map(n-> n*2).forEach(n -> System.out.print(n + " "));*/
        /* int result = a.stream()
                .sorted()
                //.filter(n-> n%2==0)
             *//*   .map(n-> n+1)*//*
                .reduce(0 ,(c,e)-> c+e);
        System.out.println(result);*/
        a.stream()
                .sorted()
                //.filter(n-> n%2==0)
                   .map(n-> n*2)
               /* .reduce(0 ,(c,e)-> c+e);*/
              /*  .forEach(n-> System.out.println(n*2));*/
                /*.forEach(n-> System.out.println(n))*/ .reduce(0 ,(c,e)-> c+e);
        ;
    }
}
