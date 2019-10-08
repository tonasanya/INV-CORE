package org.galatea.pgbi.core.publisher;

/**
 * Publisher for writing key value pairs to the message bus
 *
 * @param <K> key
 * @param <V> value
 */
public interface Publisher<K, V> {

  void publish(K key, V value);
}
