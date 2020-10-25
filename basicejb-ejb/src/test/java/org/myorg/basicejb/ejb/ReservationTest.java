package org.myorg.basicejb.ejb;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ReservationTest {

    private static final Logger logger = LogManager.getLogger(ReservationTest.class);

    
    ReservationRemote reservatist;


    @BeforeEach
    public void setUp() {
        reservatist=new ReservationEJB();
    }

    
    @Test
    public void testPing() {
        logger.info("*** testPing ***");

        reservatist.ping();
    }
}