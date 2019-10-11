package org.galatea.pgbi.core.test;

import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring PowerMock testing helper class
 */
@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
@PowerMockIgnore(
    {"javax.xml.*", "javax.management.*", "com.sun.org.apache.xerces.*", "org.xml.*", "org.w3c.dom.*"})
@SpringBootTest
public abstract class APowerMockSpringTest {

  @Autowired
  ApplicationContext applicationContext;
}
