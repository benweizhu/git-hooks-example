package me.zeph.githook.demo;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {
  @Test
  public void shouldFailed() {
    HelloService helloService = new HelloService();
    assertEquals("Hello", helloService.getHello());
  }
}