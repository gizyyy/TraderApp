package com.example.business.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventListenerBean {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Value("${active-mq.companyAddedTopic}")
	private String companyAddedTopic;

	@Value("${active-mq.contractAddedTopic}")
	private String contractAddedTopic;

	/**
	 * If you have an amq, then you can activate, please read readme file.
	 * 
	 */

	@Async
	@EventListener
	public void handlerCompanyCreatedEvent(final CompanyAddedEvent companyAddedEvent) {
		// jmsTemplate.convertAndSend(companyAddedTopic, companyAddedEvent);
	}

	@Async
	@EventListener
	public void handlerContractCreatedEvent(final ContractAddedEvent contractAddedEvent) {
		// jmsTemplate.convertAndSend(contractAddedTopic, contractAddedEvent);
	}
}
