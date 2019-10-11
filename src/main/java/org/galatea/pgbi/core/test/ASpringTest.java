package org.galatea.pgbi.core.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring testing helper class
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class ASpringTest {

  @Autowired
  ApplicationContext applicationContext;
}
