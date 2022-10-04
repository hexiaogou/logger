import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Main
 *
 * @author hexiaogou
 * @desc Main
 * @date 2022-10-04 17:07
 */
public class Main {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(Main.class);
        log.info("start...");
        log.warn("end.");
    }
}
