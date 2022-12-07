import java.util.ArrayList;

interface GenericInterface {
    //Sterge duplicatele dintr-o lista si returneaza lista rezultata
    public <E extends Comparable<E>> ArrayList<E> removeDuplicates(ArrayList<E> list);
    //Determina elementul maxim dintr-o lista
    public <E extends Comparable<E>> E max(ArrayList<E> list);
    //Cauta o valoare in lista sortata, folosind algoritmul de cautare binara si returneaza pozitia
    public <E extends Comparable<E>> int binarySearch(ArrayList<E> list, E key, int start, int end);
}

public class GenericListMethods implements GenericInterface{
    @Override
    public <E extends Comparable<E>> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> al = new ArrayList<E>();
        for(int i = 0; i < list.size(); i++) {
            if(!al.contains(list.get(i)))
                al.add(list.get(i));
        }
        return al;
    }

    @Override
    public <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).compareTo(max) > 0)
                max = list.get(i);
        }
        return max;
    }

    @Override
    public <E extends Comparable<E>> int binarySearch(ArrayList<E> list, E key, int start, int end) {
        if(start > end)
            return -1;
        int mid = (start + end) / 2;
        if(list.get(mid).compareTo(key) == 0)
            return mid;
        if(list.get(mid).compareTo(key) > 0)
            return binarySearch(list, key, start, mid-1);
        if(list.get(mid).compareTo(key) < 0)
            return binarySearch(list, key, mid+1, end);
        return -1;
    }
}
