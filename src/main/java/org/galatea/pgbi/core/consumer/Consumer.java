package org.galatea.pgbi.core.consumer;

import javafx.util.Pair;

/**
 * Consumer interface for pulling key value pairs from the message bus
 *
 * @param <K> key
 * @param <V> value
 */
public interface Consumer<K, V> {

  Pair<K, V> consume();
}
