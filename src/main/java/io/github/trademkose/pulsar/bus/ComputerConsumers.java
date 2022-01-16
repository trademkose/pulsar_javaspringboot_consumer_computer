package io.github.trademkose.pulsar.bus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.github.trademkose.pulsar.annotation.PulsarConsumer;
import io.github.trademkose.pulsar.bus.msg.Computer;
import io.github.trademkose.pulsar.bus.msg.Smartphone;
import io.github.trademkose.pulsar.constant.Serialization;

@Service
public class ComputerConsumers {

	private static final Logger LOGGER = LoggerFactory.getLogger(ComputerConsumers.class);	

	@PulsarConsumer(topic = "${my.topic.consumer_topic}", clazz = Computer.class, serialization = Serialization.JSON)
	public void computerListener(Computer computer) {
		LOGGER.info("@PulsarConsumer:computerListener  Consumed data : " + computer.toString());
		
	}
}
