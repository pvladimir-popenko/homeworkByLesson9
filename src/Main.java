import java.util.*;

public class Main {

    public static void main(String[] args) {
        Comparator<String> comparator= (o1, o2) -> o1.length() - o2.length();
        int a = 0;
        int b = 0;
        Scanner s = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC;
        System.out.println("OK, lets fill in ListA");
        do {

            System.out.println("Enter word for ListA - " + a);
            String wordA = s.nextLine();
            listA.add(wordA);
            a++;
        } while (a != 5);
        print(listA);
        System.out.println("-------------------");
        System.out.println("And now fill in ListB");
        do {
            System.out.println("Enter word for ListB - " + b);
            String wordB = s.nextLine();
            listB.add(wordB);
            b++;
        } while (b != 5);
        print(listB);
        System.out.println("+++++++++++++++++++");
        listC = fillingOut(listA, listB);
        System.out.println("+++++++++++++++++++");
        print(listC);
        System.out.println("+++++++++++++++++++");
        Collections.sort(listC, comparator);
        System.out.println("После сортировки");
        print(listC);
    }

    public static void print(ArrayList<String> list) {
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = (String) iter.next();
            System.out.println(s);
        }
    }

    public static ArrayList<String> fillingOut(ArrayList<String> listA, ArrayList<String> listB) {
        ArrayList<String> finalList = new ArrayList<>();
        String a1 = listA.get(0);
        String a2 = listA.get(1);
        String a3 = listA.get(2);
        String a4 = listA.get(3);
        String a5 = listA.get(4);
        String b1 = listB.get(0);
        String b2 = listB.get(1);
        String b3 = listB.get(2);
        String b4 = listB.get(3);
        String b5 = listB.get(4);
        finalList.add(a1);
        finalList.add(b5);
        finalList.add(a2);
        finalList.add(b4);
        finalList.add(a3);
        finalList.add(b3);
        finalList.add(a4);
        finalList.add(b2);
        finalList.add(a5);
        finalList.add(b1);
        return finalList;

    }


}
