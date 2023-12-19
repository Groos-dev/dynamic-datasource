package com.xin.daily;

import org.aspectj.apache.bcel.generic.InstructionConstants.Clinit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTest {
  @Autowired
  private ClientService clientService;

  @Test
  void testDynamic(){

    String clientNameA = clientService.getClientName(ClientDatabase.CLIENT_A);
    System.out.println(clientNameA);

    String clientNameB = clientService.getClientName(ClientDatabase.CLIENT_B);
    System.out.println(clientNameB);

  }
}
