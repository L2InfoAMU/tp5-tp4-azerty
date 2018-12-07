package image;

public interface Map<K,V> {

    boolean containsKey(Object key); //: Returns true if this map contains a mapping for the specified key.

    V get(Object key);// : Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.

    V getOrDefault(Object key, V defaultValue);// : Returns the value to which the specified key is mapped,or defaultValue if this map contains no mapping for the key.

    V put(K key, V value); //: Associates (maps) the specified value with the specified key in this map.

}
}
