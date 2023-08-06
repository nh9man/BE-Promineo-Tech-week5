package wk5_Coding_assignment;

public class SpacedLogger implements Logger {
    /**
     * This is SpacedLogger Class and I have the two methods implemented Logger
     * Interface. In both method I implemented a for loop and added the space and the
     * associated Strings
     *
     */
    @Override
    public void log(String input) {
       String rest = "";
        for(int i = 0; i < input.length();i++){
            rest += input.charAt(i)+ " ";

        }

        System.out.println(rest);
    }

    @Override
    public void error(String str) {
        String rest = "";
        for(int i = 0; i < str.length();i++){
            rest += str.charAt(i)+ " ";

        }
        String error = "Error "+rest;

        System.out.println(error);

    }
}
