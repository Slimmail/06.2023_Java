import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cats note1 = new Cats("Maine Coon", "Male", "White", 1.6f, 1, "Yes");
        Cats note2 = new Cats("Siamskaya", "Male", "Black", 7, 3, "No");
        Cats note3 = new Cats("Abyssinian", "Male", "Ginger", 13, 4, "Yes");
        Cats note4 = new Cats("Bald", "Female", "Grey", 4.4f, 15, "Yes");
        Cats note5 = new Cats("Bald", "Male", "White", 2.8f, 0.5f, "No");

        HashSet<Cats> noteSet = new HashSet<>();
        noteSet.add(note1);
        noteSet.add(note2);
        noteSet.add(note3);
        noteSet.add(note4);
        noteSet.add(note5);

        printInfo(noteSet);

        selectNote(noteSet);
    }

    public static void printInfo(HashSet<Cats> set) {
        for (Cats elem : set) {
            System.out.println(elem.getInfo());
            System.out.println();
        }
    }

    public static void selectNote(HashSet<Cats> setNote) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Criteria for choosing cats:\n" +
                    "1: Breed\n" +
                    "2: Gender\n" +
                    "3: Color\n" +
                    "4: Weight\n" +
                    "5: Age\n" +
                    "6: Sterilized");
            int command = in.nextInt();
            if (command == 1) {
                selectBreed(setNote);
            } else if (command == 2) {
                selectGender(setNote);
            } else if (command == 3) {
                selectColor(setNote);
            } else if (command == 4) {
                selectWeight(setNote);
            } else if (command == 5) {
                selectAge(setNote);
            } else if (command == 6) {
                selectSterilized(setNote);
            }
        }
    }

    public static void selectBreed(HashSet<Cats> setNote) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("choose the right breed:\n" +
                    "1: Maine Coon\n" +
                    "2: Siamskaya\n" +
                    "3: Abyssinian\n" +
                    "4: Bald\n");
            int n = in.nextInt();
            HashMap<Integer, String> bree = new HashMap<Integer, String>();
            bree.put(1, "Maine Coon");
            bree.put(2, "Siamskaya");
            bree.put(3, "Abyssinian");
            bree.put(4, "Bald");
            int i = 1;
            for (Cats elem : setNote) {
                if (elem.getBreed().equals(bree.get(n))) {
                    System.out.println(i++);
                    System.out.println(elem.getInfo());
                    System.out.println();
                }
            }
        }
    }

    public static void selectGender(HashSet<Cats> setNote) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("select the desired Gender:\n" +
                    "1: Male\n" +
                    "2: Female\n");
            int n = in.nextInt();
            HashMap<Integer, String> gend = new HashMap<Integer, String>();
            gend.put(1, "Male");
            gend.put(2, "Female");
            int i = 1;
            for (Cats elem : setNote) {
                if (elem.getBreed().equals(gend.get(n))) {
                    System.out.println(i++);
                    System.out.println(elem.getInfo());
                    System.out.println();
                }
            }
        }
    }

    private static void selectColor(HashSet<Cats> setNote) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("select the desired Color:\n" +
                    "1: White\n" +
                    "2: Black\n" +
                    "3: Ginger\n" +
                    "4: Grey\n");
            int n = in.nextInt();
            HashMap<Integer, String> color = new HashMap<Integer, String>();
            color.put(1, "White");
            color.put(2, "Black");
            color.put(3, "Ginger");
            color.put(4, "Grey");
            int i = 1;
            for (Cats elem : setNote) {
                if (elem.getColor().equals(color.get(n))) {
                    System.out.println(i++);
                    System.out.println(elem.getInfo());
                    System.out.println();
                }
            }
        }
    }

    public static void selectWeight(HashSet<Cats> setNote) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("select weight category:\n" +
                    "1: 0 - 3 kg\n" +
                    "2: 3 - 5 kg\n" +
                    "3: 5 - 15 kg\n");
            int n = in.nextInt();
            HashMap<Integer, float[]> weight = new HashMap<Integer, float[]>();
            weight.put(1, new float[] { 0f, 3.0f });
            weight.put(2, new float[] { 3.0001f, 5.0f });
            weight.put(3, new float[] { 5.0001f, 15.0f });
            int i = 1;
            for (Cats elem : setNote) {
                if (weight.get(n)[0] < elem.getWeight() && elem.getWeight() < weight.get(n)[1]) {
                    System.out.println(i++);
                    System.out.println(elem.getInfo());
                    System.out.println();
                }
            }
        }
    }

    public static void selectAge(HashSet<Cats> setNote) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("select age category:\n" +
                    "1: 0 - 3 years\n" +
                    "2: 3 - 5 years\n" +
                    "3: 5 - 15 years\n");
            int n = in.nextInt();
            HashMap<Integer, float[]> age = new HashMap<Integer, float[]>();
            age.put(1, new float[] { 0f, 3.0f });
            age.put(2, new float[] { 3.0001f, 5.0f });
            age.put(3, new float[] { 5.0001f, 15.0f });
            int i = 1;
            for (Cats elem : setNote) {
                if (age.get(n)[0] < elem.getAge() && elem.getAge() < age.get(n)[1]) {
                    System.out.println(i++);
                    System.out.println(elem.getInfo());
                    System.out.println();
                }
            }
        }
    }

    public static void selectSterilized(HashSet<Cats> setNote) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Is the cat spayed?:\n" +
                    "1 - Yes\n" +
                    "2 - No");
            int n = in.nextInt();
            HashMap<Integer, String> ster = new HashMap<Integer, String>();
            ster.put(1, "Yes");
            ster.put(2, "No");
            int i = 1;
            for (Cats elem : setNote) {
                if (elem.getSterilized() == ster.get(n)) {
                    System.out.println(i++);
                    System.out.println(elem.getInfo());
                    System.out.println();
                }
            }
        }
    }
}