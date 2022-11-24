import java.util.*;

class SListSet extends LinkedList implements SortedSet {
    private Comparator comparator;
    SListSet(){
        comparator = null;
    }
    SListSet(Comparator comparator){
        this.comparator = comparator;
    }

    @Override
    public boolean add(Object o){
        if(this.contains(o))
            return false;
        super.add(o);
        Collections.sort(this, comparator());
        return true;
    }

    @Override
    public Comparator comparator() {
        return comparator;
    }

    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        SortedSet set = new SListSet(comparator);
        for(Object o : this) {
            if(((String)o).compareTo(((String)fromElement)) >= 0 &&
                    ((String)o).compareTo(((String)toElement)) < 0 ){
                set.add(o);
            }
        }
        return set;
    }

    @Override
    public SortedSet headSet(Object toElement) {
        SortedSet set = new SListSet(comparator);
        for(Object o : this) {
            if(((String)o).compareTo(((String)toElement)) < 0 ){
                set.add(o);
            }
        }
        return set;
    }

    @Override
    public SortedSet tailSet(Object fromElement) {
        SortedSet set = new SListSet(comparator);
        for(Object o : this) {
            if(((String)o).compareTo(((String)fromElement)) >= 0){
                set.add(o);
            }
        }
        return set;
    }

    @Override
    public Object first() {
        return super.getFirst();
    }

    @Override
    public Object last() {
        return super.getLast();
    }
}

public class Problema_03 {
    public static void main(String[] args){
        SListSet set = new SListSet();
        SListSet reverseSet = new SListSet(new descendingComparator());
        set.add("Rares");
        set.add("Petrut");
        set.add("Adi");
        set.add("Ana");
        set.add("Cris");
        set.add("Ramona");

        System.out.println(set);
        System.out.println(set.subSet("Cris", "Petrut"));
        System.out.println(set.tailSet("Ramona"));
        System.out.println(set.headSet("Petrut"));
        System.out.println(set.first());
        System.out.println(set.last());

        reverseSet.add("Rares");
        reverseSet.add("Petrut");
        reverseSet.add("Adi");
        reverseSet.add("Ana");
        reverseSet.add("Cris");
        reverseSet.add("Ramona");

        System.out.println("");
        System.out.println(reverseSet);
        System.out.println(reverseSet.subSet("Cris", "Petrut"));
        System.out.println(reverseSet.tailSet("Ramona"));
        System.out.println(reverseSet.headSet("Petrut"));
        System.out.println(reverseSet.first());
        System.out.println(reverseSet.last());


    }
}
