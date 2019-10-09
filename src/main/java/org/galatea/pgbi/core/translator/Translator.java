package org.galatea.pgbi.core.translator;

/**
 * Translator class for converting an input data type in to an output data type. Should be used for
 * converting external datamodels in to domain objects, domain objects in to message bus format data
 * structures and message bus data structures back in to domain objects
 *
 * @param <I> input
 * @param <O> output
 */
public interface Translator<I, O> {

  O translate(I input);
}
