package ge.edu.btu;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;
public class Payment {
    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Water water = new Water("asdfg55", 6.65);
        pay(water);

        Electricity electricity = new Electricity("15_2577", 135.88);
        pay(electricity);
    }

    public static <E> void pay(E t) {
        logger.info("კომუნალური გადახდილია: " + t.toString());
    }
}
