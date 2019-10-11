package org.galatea.pgbi.core.domain;

import lombok.NonNull;
import lombok.Value;

/**
 * Object for storing pairs of values
 */
@Value
public class Pair <K, V> {

  @NonNull
  private final K key;
  @NonNull
  private final V value;

}
