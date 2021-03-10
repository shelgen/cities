package no.need.to.think.of.creative.packagename;

/**
 * The non-abstract version of this class needs to:
 * <p>
 * 1. Be instantiated with "Oslo", "Bergen" and "Mysen".
 * <p>
 * 2. Be able to print the cities as a comma separated string to the console.
 */
public abstract class AbstractInterview {
    private String[] cities;

    public AbstractInterview(String[] cities) {
        this.cities = cities;
    }

    //This needs to be implemented
    public abstract void printCommaSeparatedListOfCitiesToConsole();

    protected String[] getCities() {
        return cities;
    }
}
