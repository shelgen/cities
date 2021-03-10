package no.need.to.think.of.creative.packagename;

public class InterviewImpl extends AbstractInterview {

    public InterviewImpl() {
        super(new String[]{"Oslo", "Bergen", "Mysen"});
    }

    @Override
    public void printCommaSeparatedListOfCitiesToConsole() {
        System.out.println(String.join(",", getCities()));
    }

    public static void main(String[] args) {
        new InterviewImpl().printCommaSeparatedListOfCitiesToConsole();
    }

}
