package edu.iis.mto.similarity;

import edu.iis.mto.search.SequenceSearcher;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SimilarityFinderTest {

    private SimilarityFinder similarityFinder;
    private SequenceSearcher sequenceSearcher;
    private int[] seq1;
    private int[] seq2;

    @Before public void setUp() throws Exception {
        sequenceSearcher = new SequenceSearcherDoubler();
        similarityFinder = new SimilarityFinder(sequenceSearcher);
    }

    @Test public void bothSequencesAreEmptyReturnOne() {
        seq1 = new int[] {};
        seq2 = new int[] {};

        assertThat(similarityFinder.calculateJackardSimilarity(seq1, seq2), is(1.0d));
    }

    @Test public void oneSequenceIsEmptyReturnZero() {
        seq1 = new int[] {1, 2};
        seq2 = new int[] {};

        assertThat(similarityFinder.calculateJackardSimilarity(seq1, seq2), is(0.0d));
    }

    @Test public void bothSequencesHaveSameNumberReturnZero() {
        seq1 = new int[] {1, 2, 4, 5};
        seq2 = new int[] {1, 2, 4, 5};

        assertThat(similarityFinder.calculateJackardSimilarity(seq1, seq2), is(0.0d));
    }
}
