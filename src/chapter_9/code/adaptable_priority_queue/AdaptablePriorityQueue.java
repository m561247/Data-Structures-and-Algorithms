package chapter_9.code.adaptable_priority_queue;

import chapter_9.code.PriorityQueue.Entry;

/*
 * Created by jjmacagnan on 03/06/2017.
 */
public interface AdaptablePriorityQueue<K, V> {

    void remove(Entry<K, V> e);

    void replaceKey(Entry<K, V> e, K k);

    void replaceValue(Entry<K, V> e , V v);
}
