import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Static
 *
 * @author hexiaogou
 * @desc Static
 * @date 2022-10-04 17:15
 */
public class Static {
    static final Log log = LogFactory.getLog(Static.class);

    static void foo() {
        log.info("foo");
    }
}
