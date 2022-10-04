import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main
 *
 * @author hexiaogou
 * @desc Main
 * @date 2022-10-04 19:00
 */
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("start...");
        log.warn("end.");
        log.error("error");
    }
}
