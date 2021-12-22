package com.example.business.events;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyAddedEvent extends ApplicationEvent {

	public CompanyAddedEvent(String companyName) {
		super(CompanyAddedEvent.class);
		this.companyName = companyName;
	}

	private static final long serialVersionUID = 1L;
	private String companyName;
}