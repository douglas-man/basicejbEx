package org.myorg.basicejb.ejb;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@Stateless
public class ReservationEJB implements ReservationLocal, ReservationRemote {

    private static final Logger logger = LogManager.getLogger(ReservationEJB.class);


    @PostConstruct
    public void init() {

        logger.debug("*** ReservationEJB.init() ***");

    }

    

    @PreDestroy
    public void destroy() {

        logger.debug("*** ReservationEJB.destroy() ***");

    }

    

    @Override
    public void ping() {

        logger.debug("ping called");

    }

}