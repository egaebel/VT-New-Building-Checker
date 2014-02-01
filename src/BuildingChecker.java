import java.util.ArrayList;
import java.util.List;
import com.vtaccess.BuildingGpsMap;
import com.vtaccess.CourseInfo;
import com.vtaccess.exceptions.BuildingNotFoundException;
import com.vtaccess.schedule.Course;

/**
 * @author Ethan Gaebel (egaebel)
 *
 */
public class BuildingChecker {

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {

        BuildingGpsMap buildings = new BuildingGpsMap();
        List<String> newBuildings = new ArrayList<String>();
        
        for (String curSub : allSubjects) {
            System.out.println("\n\n\n\nChecking the subject....: " + curSub);
            List<Course> courses = CourseInfo.getAllCourses("201401", curSub, true, false);
            for (Course course : courses) {
                String curBuilding = course.getBuilding();
                try {
                    buildings.get(curBuilding);
                }
                catch (BuildingNotFoundException e) {
                    
                   newBuildings.add(curBuilding);
                }
            }
        }
        
        System.out.println("Finished parsing all courses.....");
        Thread.sleep(1000);
        
        if (newBuildings.size() > 0) {
            System.out.println("New Buildings found!\nThey are:");
            for (String newBuilding : newBuildings) {
                System.out.println(newBuilding);
            }
        }
        else {
            System.out.println("NO NEW BUILDINGS! HOW LUCKY!");
        }
        
        Thread.sleep(10000);
    }

    //~Constants----------------------------------------------
    private static String[] allSubjects = {"AAEC", 
                                            "ACIS", 
                                            "AEE", 
                                            "AFST", 
                                            "AHRM", 
                                            "AINS", 
                                            "ALHR", 
                                            "ALS", 
                                            "AOE", 
                                            "APS", 
                                            "APSC", 
                                            "ARBC", 
                                            "ARCH", 
                                            "ART", 
                                            "AS", 
                                            "ASPT", 
                                            "AT", 
                                            "BC", 
                                            "BCHM", 
                                            "BIOL", 
                                            "BIT", 
                                            "BMES", 
                                            "BMSP", 
                                            "BMVS", 
                                            "BSE", 
                                            "BTDM", 
                                            "BUS", 
                                            "C21S", 
                                            "CEE", 
                                            "CHE", 
                                            "CHEM", 
                                            "CHN", 
                                            "CINE", 
                                            "CLA", 
                                            "CMDA", 
                                            "CNST", 
                                            "COMM", 
                                            "COS", 
                                            "CS", 
                                            "CSES", 
                                            "DASC", 
                                            "ECE", 
                                            "ECON", 
                                            "EDCI", 
                                            "EDCO", 
                                            "EDCT", 
                                            "EDEL", 
                                            "EDEP", 
                                            "EDHE", 
                                            "EDIT", 
                                            "EDP", 
                                            "EDRE", 
                                            "EDTE", 
                                            "ENGE", 
                                            "ENGL", 
                                            "ENGR", 
                                            "ENSC", 
                                            "ENT", 
                                            "ESM", 
                                            "FA", 
                                            "FIN", 
                                            "FIW", 
                                            "FL", 
                                            "FOR", 
                                            "FR", 
                                            "FST", 
                                            "GBCB", 
                                            "GEOG", 
                                            "GEOS", 
                                            "GER", 
                                            "GIA", 
                                            "GR", 
                                            "GRAD", 
                                            "HD", 
                                            "HEB", 
                                            "HIST", 
                                            "HNFE", 
                                            "HORT", 
                                            "HTM", 
                                            "HUM", 
                                            "IDS", 
                                            "IS", 
                                            "ISC", 
                                            "ISE", 
                                            "ITAL", 
                                            "ITDS", 
                                            "JPN", 
                                            "JUD", 
                                            "LAHS", 
                                            "LAR", 
                                            "LAT", 
                                            "LDRS", 
                                            "MACR", 
                                            "MASC", 
                                            "MATH", 
                                            "ME", 
                                            "MGT", 
                                            "MINE", 
                                            "MKTG", 
                                            "MN", 
                                            "MS", 
                                            "MSE", 
                                            "MUS", 
                                            "NANO", 
                                            "NEUR", 
                                            "NR", 
                                            "NSEG", 
                                            "PAPA", 
                                            "PHIL", 
                                            "PHS", 
                                            "PHYS", 
                                            "PORT", 
                                            "PPWS", 
                                            "PSCI", 
                                            "PSVP", 
                                            "PSYC", 
                                            "REAL", 
                                            "REL", 
                                            "RLCL", 
                                            "RUS", 
                                            "SBIO", 
                                            "SOC", 
                                            "SPAN", 
                                            "SPIA", 
                                            "STAT", 
                                            "STS", 
                                            "TA", 
                                            "UAP", 
                                            "UH", 
                                            "UNIV", 
                                            "VM", 
                                            "WGS"};

    //~Data Fields--------------------------------------------


    //~Constructors--------------------------------------------


    //~Methods-------------------------------------------------
}
