import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest
{
    public static void main(String[] args) {
        /*
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        //COMPLETE ME: print each name using an index based for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        //COMPLETE ME: print each name (again!) using enhanced for loop
        for (String str : names) {
            System.out.println(str);
        }
        //COMPLETE ME: print each name (a third time!) using a while loop
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }

        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // COMPLETE ME: print each Cat’s name using a
        // standard for loop
        for (int j = 0; j < catList.size(); j++) {
            System.out.println(catList.get(j).getName());
        }
        // COMPLETE ME: print each Cat’s name using an
        // enhanced for loop
        for (Cat cat : catList) {
            System.out.println(cat.getName());
        }
        */

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        //COMPLETE ME!
        for (int k = 1; k < numList.size() - 1; k++)
        {
            numList.set(k - 1, numList.get(k) + numList.get(k + 1));
        }

        System.out.println(numList);



    }
}

