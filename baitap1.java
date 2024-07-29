import java.util.ArrayList;
import java.util.Collections;
public class baitap1{
    public static void main(String[] args) {
      ArrayList<Integer> number = new ArrayList<>();
        number.add(11);
        number.add(2);
        number.add(32);
        number.add(4);
        number.add(55);
        number.add(6);
        number.add(71);
        number.add(87);
        number.add(9);
        number.add(102);
        System.out.println("ArrayList: " + Collections.max(number));
    }
  }