package cc.lostyouth.spring.highlight_spring4.ch01.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by endless on 10/17/2017.
 */
@Service
public class DemoMethodService {
    private static final Logger LOG = LoggerFactory.getLogger(DemoMethodService.class);

    public void add() {
        LOG.info(this.getClass().getName());
    }
}
