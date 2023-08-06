package wk5_Coding_assignment;

public class Main {

    public static void main(String[] args){

        /**
         * This is my tester class where I tested all my methods to be sure
         * they were working
         */

        AsteriskLogger ast = new AsteriskLogger();
        ast.log("Hello");
        ast.error("Hello");
        SpacedLogger sp = new SpacedLogger();
        sp.log("word");
        sp.error("Hello");
    }
}
