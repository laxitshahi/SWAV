package project.util;

public class IndicatorUtils {
    public static String returnIndicator(String dataType) {

        switch (dataType) {
            //population (total)
            case "population":
                return "SP.POP.TOTL";
            //C02 emissions (as metric tons per capita)
            case "co2emissions":
                return "EN.ATM.CO2E.PC";
            //GDP per capita(as current US$)
            case "gdppercapita":
                return "NY.GDP.PCAP.CD";
            //Forest Area(as % of land)
            case "forestarea":
                return "AG.LND.FRST.ZS";
            //Current Health Expenditure (per capita [per person?])
            case "healthexpenditure":
                return "SH.XPD.CHEX.PC.CD";
            //Hospital Beds(per 1000 people)
            case "hospitalbeds":
                return "SH.MED.BEDS.ZS";
            //Agricultural Land(% of land area)
            case "agriculturalland":
                return "AG.LND.AGRI.ZS";
            //Mortality rate, under-5 (per 1,000 live births)
            case "mortalityunder5":
            case "mortalityunderfive":
                return "SH.DYN.MORT";
            //People using safely managed water service (% of population)
            case "usingwatermanaged":
                return "SH.H2O.SMDW.ZS";
            //Income share held by lowest 20%
            case "incomesharelowest20":
            case "incomesharelowesttwenty":
                return "SI.DST.FRST.20";
            //Mortality rate, infant (per 1,000 live births)
            case "mortalityinfant":
                return "SP.DYN.IMRT.IN";
            default:
                return "invalid.key";
        }
    }
}
