package com.home;

import java.util.logging.Logger;

/**
 * Hello
 *
 * @author hexiaogou
 * @desc Hello
 * @date 2022-10-04 16:17
 */
public class Hello {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }
}
