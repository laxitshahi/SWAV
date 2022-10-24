package project.analysis;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The base class of all analysis types.
 * Maintains both a list of years and viewers for which this analysis is valid.
 */
abstract public class AnalysisBase {
    // Stores the years for which analysis cannot be performed, loaded in at initialization time
    protected ArrayList<Integer> invalidYears = new ArrayList<Integer>();

    // Stores the string representation of the valid possible viewers for the analysis type, specified at
    // initialization time.
    protected ArrayList<String> validViewers = new ArrayList<String>();

    /**
     * @return A hashmap containing String/Hashmap pairs where each string is the data type and the
     * hashmap contains the year/data pairs for that data type.
     * @note The String portion of the outer hashmap always contains the title of the data series. The inner
     * hashmap contains the year/value pair for each data point. Year is simply left at -1 if the
     */
    abstract public HashMap<String, HashMap<Integer, Float>> getAnalyzedData();
}
