package genericsIntro;

public class client {
    public static void main(String[] args) {

        Pair<Integer,String> pair = new Pair<>();
//        pair.first = 100;
//        pair.second = "Hello!!!";
        pair.setFirst(10);
        pair.setSecond("Welcome to Java Programming");

//        Integer i = pair.getFirst();
//        String s = pair.getSecond();

//        Pair<Integer , Integer> pair2 = new Pair<>();
//        pair2.first = 20;
//        pair2.second =30;

        System.out.println(pair.first);
        System.out.println(pair.second);
//        System.out.println(pair2.first);
//        System.out.println(pair2.second);
    }
}
