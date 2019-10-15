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
        Collections.reverse(listB);
        ArrayList<String> finalList = new ArrayList<>();
        Iterator<String> itrA = listA.iterator();
        Iterator<String> itrB = listB.iterator();
        while (itrA.hasNext() && itrB.hasNext()){
            String a = (String) itrA.next();
            String b = (String) itrB.next();
            finalList.add(a);
            finalList.add(b);
        }
        return finalList;

    }


}
