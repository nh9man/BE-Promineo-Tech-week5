package wk5_Coding_assignment;

public class AsteriskLogger implements Logger {

    /**
     * This is Asterisk Class and I have the two methods implemented Logger
     * Interface. I Simply just used simple print statements and added the
     * required Strings
     *
     */
    @Override
    public void log(String input) {

        System.out.println("***"+input+"***");
    }

    @Override
    public void error(String str) {
        System.out.println("*******************");
        System.out.println("***Error:"+str+"***");
        System.out.println("*******************");

    }
}
