import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        /*
        forEach
Stream has provided a new method ‘forEach’ to iterate each element of the stream.
The following code segment shows how to print 10 random numbers using forEach.
         */
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);




        /*
        sorted

        The ‘sorted’ method is used to sort the stream.
        The following code segment shows how to print 10 random numbers in a sorted order.
         */

        Random random2 = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);




    }






}
