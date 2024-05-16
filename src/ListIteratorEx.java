import java.util.LinkedList;

public class ListIteratorEx {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("BMW");
        list.add("Mazda");
        list.add("Volvo");

        for(String sr: list)
        System.out.println(sr);
    }
}
