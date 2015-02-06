/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Objects;
import org.junit.Test;

public class Tuple9Test {

    @Test
    public void shouldCreateTuple() {
        final Tuple9 tuple = createTuple();
        assertThat(tuple).isNotNull();
    }

    @Test
    public void shouldGetArity() {
        final Tuple9 tuple = createTuple();
        assertThat(tuple.arity()).isEqualTo(9);
    }

    @Test
    public void shouldFlatMap() {
        final Tuple9 tuple = createTuple();
        final Function9 mapper = (t1, t2, t3, t4, t5, t6, t7, t8, t9) -> tuple;
        @SuppressWarnings("unchecked")
        final Tuple9 actual = tuple.flatMap(mapper);
        assertThat(actual).isEqualTo(tuple);
    }

    @Test
    public void shouldMap() {
        final Tuple9 tuple = createTuple();
        final Function9 mapper = (t1, t2, t3, t4, t5, t6, t7, t8, t9) -> tuple;
        @SuppressWarnings("unchecked")
        final Tuple9 actual = tuple.flatMap(mapper);
        assertThat(actual).isEqualTo(tuple);
    }

    @Test
    public void shouldUnapply() {
        final Tuple9 tuple = createTuple();
        assertThat(tuple.unapply()).isEqualTo(tuple);
    }

    @Test
    public void shouldCompareViaEquals() {
        final Tuple9 tuple1 = createTuple();
        final Tuple9 tuple2 = createTuple();
        assertThat(tuple1).isEqualTo(tuple2);
    }

    @Test
    public void shouldComputeCorrectHashCode() {
        final int actual = createTuple().hashCode();
        final int expected = Objects.hash(null, null, null, null, null, null, null, null, null);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldImplementToString() {
        final String actual = createTuple().toString();
        final String expected = "(null, null, null, null, null, null, null, null, null)";
        assertThat(actual).isEqualTo(expected);
    }

    private Tuple9 createTuple() {
        return new Tuple9<>(null, null, null, null, null, null, null, null, null);
    }
}