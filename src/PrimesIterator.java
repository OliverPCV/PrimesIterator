import java.util.Iterator;
import java.util.ArrayList;


public class PrimesIterator implements Iterator<Integer> {

    private int i = 1;
    private ArrayList<Integer> list = new ArrayList<>();

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        do{
            i++;
        }while(!isPrime(i));
        return i;

    }


    public static void main(String[] args) {
        for (int prime : new PrimesIterable()) {
            if(prime > 100) break;
            System.out.println(prime);
        }
    }

    private boolean isPrime(int i) {
        int sqroot = (int) Math.sqrt(i);
        //for (int j = 2; j < sqroot; j++) {
        for( int j : list) {
            if(j > sqroot) break;
            if (i % j == 0) {
                return false;
            }
        }
        list.add(i);
        return true;
    }

}