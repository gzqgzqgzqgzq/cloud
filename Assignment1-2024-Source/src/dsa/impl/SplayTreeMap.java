package dsa.impl;

import dsa.iface.ISortedMap;

public class SplayTreeMap<K extends Comparable<K>,V> extends BinarySearchTreeMap<K,V> implements ISortedMap<K,V> {

    public SplayTreeMap() {
        super();
    }

    @Override
    public V get(K k) {
        return null; // <-- REMOVE: this is here just so that the class will compile.
    }

    @Override
    public V put(K k, V v) {
        return null; // <-- REMOVE: this is here just so that the class will compile.
    }

    @Override
    public V remove(K k) {
        return null; // <-- REMOVE: this is here just so that the class will compile.
    }
}
