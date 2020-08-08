import java.util.List;

/**
 * Using OrElse
 * @author ashish
 */
public class OrElse {
    public static void main(String[] args) {
        List<Integer> list=List.of(7,5,9,11);
        int i=list.stream().filter(integer -> integer%2==0).findFirst().orElseThrow();
        System.out.println(i);

    }
}
