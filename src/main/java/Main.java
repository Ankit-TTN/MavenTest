
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(Main.class.getName());
        log.info("hello");

    }
}
