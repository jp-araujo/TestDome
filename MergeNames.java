import java.util.HashSet;

// https://www.testdome.com/questions/62372
public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        HashSet<String> distinctNames = new HashSet<String>();

        for (String name : names1){
            if(!distinctNames.contains(name))
                distinctNames.add(name);
        }

        for(String name : names2){
            if(!distinctNames.contains(name))
                distinctNames.add(name);
        }

        return distinctNames.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}