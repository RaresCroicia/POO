import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {

    Vector<K> keys;
    Vector<V> values;

    public ArrayMap() {
        keys = new Vector<K>();
        values = new Vector<V>();
    }

    public V put(K key, V value) {
        if(keys.contains(key)) {
            int index = keys.indexOf(key);
            V oldValue = values.get(index);
            values.set(index, value);
            return oldValue;
        }
        keys.add(key);
        values.add(value);
        return value;
    }

    public V get(Object o) {
        K ko = (K)o;
        if(!keys.contains(ko)) {
            return null;
        }
        int index = keys.indexOf(ko);
        return values.elementAt(index);
    }

    public Set<K> keySet() {
        Set<K> set = new HashSet<K>(keys);
        return set;
    }

    public Collection<V> values() {
        Collection<V> coll = values;
        return coll;
    }

    class ArrayMapEntry<K, V> implements Map.Entry<K, V> {

        private K key;
        private V value;

        ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            String str = "";
            str += "[";
            str += key;
            str += ",";
            str += value;
            str += "]";
            return str;
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
    }


    @Override
    public Set entrySet() {
        Set<ArrayMapEntry<K, V>> set = new HashSet<>();
        for(int i = 0; i < keys.size(); i++)
            set.add(new ArrayMapEntry<K, V>(keys.elementAt(i), values.elementAt(i)));
        return set;
    }

    public String toString() {
        String ans = "";
        ans += keySet();
        ans += '\n';
        ans += values();
        return ans;
    }

    public static void main(String[] args) {
        ArrayMap<String, Integer> am = new ArrayMap();
        am.put("unu", 1);
        am.put("doi", 2);
        am.put("trei", 3);
        System.out.println(am);
        Set set = am.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
