package com.ivoronline.springboot_rabbitmq_consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "Queue1")
public class Consumer {

  @RabbitHandler
  public void receiver(String message) {
    System.out.println("Received Message: " + message);
  }

}