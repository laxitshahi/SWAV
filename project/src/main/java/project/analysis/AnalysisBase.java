package project.analysis;

import java.util.ArrayList;

abstract public class AnalysisBase {
    // Stores the years for which analysis cannot be performed
    protected ArrayList<Integer> invalidYears = new ArrayList<Integer>();

    // Stores the string representation (for now) of the valid possible viewers for the analysis type
    protected ArrayList<String> validViewers = new ArrayList<String>();

    
}
