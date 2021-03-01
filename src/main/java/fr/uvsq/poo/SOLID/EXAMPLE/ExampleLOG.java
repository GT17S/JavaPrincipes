package fr.uvsq.poo.SOLID.EXAMPLE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleLOG {

    private static final Logger logger
            = LoggerFactory.getLogger(ExampleLOG.class);

    public static void main(String[] args) {
        logger.info("Example log from {}", ExampleLOG.class.getSimpleName());
    }
}