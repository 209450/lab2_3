package edu.iis.mto.similarity;

import edu.iis.mto.search.SequenceSearcher;
import org.junit.Before;

import static org.junit.Assert.*;

public class SimilarityFinderTest {

    private SimilarityFinder similarityFinder;
    private SequenceSearcher sequenceSearcher;

    @Before public void setUp() throws Exception {
        sequenceSearcher = new SequenceSearcherDoubler();
        similarityFinder = new SimilarityFinder(sequenceSearcher);
    }
}
