import java.util.*;



class ArrayMap<K, V> extends AbstractMap<K, V>{

    class ArrayMapEntry<K, V> implements Map.Entry<K, V>{

        private K key;
        private V value;

        ArrayMapEntry(K key, V value){
            this.key = key;
            this.value = value;
        }


        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V old = this.value;
            this.value = value;
            return old;
        }

        public String toString(){
            String str = "";
            str += "[";
            str += key;
            str += ",";
            str += value;
            str += "]";
            return str;
        }

        public boolean equals(Object o){
            if(o == null)
                return false;
            ArrayMapEntry co = (ArrayMapEntry) o;
            if(key.equals(co.key) && value.equals(co.value))
                return true;
            return false;
        }

        public int hashCode(){
            return key.hashCode() ^ value.hashCode();
        }
    }
    private ArrayList<ArrayMapEntry> list = new ArrayList<ArrayMapEntry>();

    @Override
    public Set entrySet() {
        Set<ArrayMapEntry<K, V>> set = new HashSet<>();
        for(int i = 0; i < list.size(); i++)
            set.add(list.get(i));
        return set;
    }

    public int size(){
        return list.size();
    }

    public V put(K key, V value){
        list.add(new ArrayMapEntry(key, value));
        return value;
    }
}

public class Problema_01 {
    public static void main(String[] main){
        ArrayMap<Integer, String> map = new ArrayMap<>();

        System.out.println("Populam colectia...");
        map.put(7, "Colectii si genericitate");
        map.put(8, "Clase interne");
        map.put(5, "Fluxuri");

        System.out.println("Verificam...");
        System.out.println("Continutul colectiei: " + map);

        if (map.size() != 3) {
            System.err.println("ArrayMap.size() (" + map.size() + ") a fost implementata gresit.");
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        if (entries.size() != 3) {
            System.err.println("ArrayMap.entrySet() a fost implementata gresit.");
        }

        for (Map.Entry<Integer, String> e : entries) {
            map.put(e.getKey(), new StringBuffer(e.getValue()).reverse().toString());
            if (!map.entrySet().contains(e)) {
                System.err.println("ArrayMap.put() nu inlocuieste vechea valoare.");
            }
            if ((!e.toString().contains(e.getKey().toString()) || (!e.toString().contains(e.getValue())))) {
                System.err.println("ArrayMap.ArrayMapEntry.toString() a fost implementata gresit.");
            }
        }

        for (Map.Entry<Integer, String> e1 : entries) {
            for (Map.Entry<Integer, String> e2 : entries) {
                if ((e1 == e2) != (e1.equals(e2))) {
                    System.err.println("ArrayMap.ArrayMapEntry.equals() a fost implementata gresit.");
                }
                if ((e1 == e2) != (e1.hashCode() == e2.hashCode())) {
                    System.err.println("ArrayMap.ArrayMapEntry.hashCode() a fost implementata gresit.");
                }
            }
        }
    }
}
