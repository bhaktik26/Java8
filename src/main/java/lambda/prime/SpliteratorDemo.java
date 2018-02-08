
package lambda.prime;


import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

@SuppressWarnings("javadoc")
public class SpliteratorDemo {

    @SuppressWarnings("nls")
	public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ram", "Sheila", "Mukesh", "Rani", "Nick", "Amy", "Desi", "Margo");
        Spliterator<String> splitStr = nameList.spliterator();
        Spliterator<String> splitStr2 = splitStr.trySplit();
        // Check if splitting actually happened, then use it
        if(splitStr2 != null){
            System.out.println("Spliterator-2");
            while(splitStr2.tryAdvance((n) -> System.out.println("name - " + n)));
        }
        // Original spliterator
        System.out.println("Original Spliterator");
        while(splitStr.tryAdvance((n) -> System.out.println("name - " + n)));
    }
        
}