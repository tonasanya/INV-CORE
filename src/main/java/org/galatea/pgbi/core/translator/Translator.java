package org.galatea.pgbi.core.translator;

/**
 * Translator for converting one data type in to another
 *
 * @param <I> input
 * @param <O> output
 */
public interface Translator<I, O> {

  O translate(I input);
}
