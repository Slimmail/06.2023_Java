import java.util.*;

public class Task1 {
    static void sortedPrint(Map<String, ArrayList> map) {
        Set<String> keySet = map.keySet();

        int maxCount = 0;
        int minCount = 1_000;

        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();

        }

        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {

            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }
            }
            num += 1;
        }

        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : map.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Map<String, ArrayList> abon = new HashMap<>() {

        };
        System.out.println();
        System.out.println("Contact details: ");
        sortedPrint(abon);

        Scanner scan = new Scanner(System.in, "cp866");
        Boolean getOut = false;
        String st;
        while (!getOut) {
            System.out.println("Choose an action: (1 - Add new contact, 0 - Exit program):");
            st = scan.nextLine();
            String name = "";
            String phString;
            switch (st) {
                case "1": {
                    System.out.println("Enter the name of the new contact:");
                    name = scan.nextLine();
                    if (abon.containsKey(name)) {
                        System.out.println("Such a contact already exists!");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Enter phone numbers separated by commas: ");
                        phString = scan.nextLine();
                        String[] arr = phString.split(",");
                        ArrayList<Integer> arrInt = new ArrayList<>();
                        for (String item : arr) {
                            arrInt.add(Integer.parseInt(item.trim()));
                        }
                        abon.put(name, arrInt);
                        System.out.println();
                        sortedPrint(abon);
                        break;
                    }
                }
                case "0": {
                    getOut = true;
                    System.out.println();
                    System.out.println("Exit program");
                    System.out.println();
                    break;
                }

            }
        }
    }
}