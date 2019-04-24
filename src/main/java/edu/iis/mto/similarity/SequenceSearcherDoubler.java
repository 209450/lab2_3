package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

public class SequenceSearcherDoubler implements SequenceSearcher {

    public int counter;

    @Override public SearchResult search(int key, int[] seq) {
        counter++;
        return SearchResult.builder().build();
    }
}
