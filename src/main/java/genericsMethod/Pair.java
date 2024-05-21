package genericsMethod;

public class Pair<K,V> {

        public K first;
        public V second;

        public void setFirst(K first){
            this.first = first;
        }

        public void setSecond(V second){
            this.second = second;
        }

        public K getFirst(){
            return first;
        }

        public V getSecond(){
            return second;
        }


    public static <T,S> S doSomething(T first , S second){
        System.out.println(first);
        System.out.println(second);

        return second;
    }


    }
