package com.ssdigital.collaboration.cobrowsing.socketapis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class DomMessageController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@MessageMapping("/dommessage/{bridgenumber}")
	@SendTo("/topic/dommessage/{bridgenumber}")
	public Object publishMessage(Object dommessage, @DestinationVariable String bridgenumber) throws Exception {
		//logger.debug(dommessage);
		return dommessage;
	}
	
	
}
