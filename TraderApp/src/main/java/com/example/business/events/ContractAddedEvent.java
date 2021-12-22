package com.example.business.events;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractAddedEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;
	private String trader;

	public ContractAddedEvent(String trader) {
		super(ContractAddedEvent.class);
		this.trader = trader;
	}
}