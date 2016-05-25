package com.cert.datastruct.LRU_Cache_RecentAccess;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sridhar on 23/5/16.
 */
//http://java-planet.blogspot.pt/2005/08/how-to-set-up-simple-lru-cache-using.html
public class Cache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;

    public Cache(int capacity){
        //true, keep access order and not insertion order. if A C B D is accessed, return will be A C B D. insertion order you know
        super(capacity+1, 1.1f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry (Map.Entry<K,V> eldest){
        return size() > capacity;
    }

    public static void main(String[] args) {
        //cache size is 4, A B C D
        Cache<Character, String> cache = new Cache<>(4);

        cache.put('a', "a hello");
        cache.put('b', "b hello");
        cache.put('c', "c hello");
        cache.put('d', "d hello");
        cache.put('e', "e hello");//at this point a will disappear from the cache

        System.out.println(cache.get('c'));
        System.out.println(cache.get('a'));

        System.out.println(cache);
    }
}
