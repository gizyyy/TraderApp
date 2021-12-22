package com.example.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.data.domain.AbstractAggregateRoot;

import com.example.business.events.CompanyAddedEvent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "company")
public class Company extends AbstractAggregateRoot<Company> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private Integer companyId;

	@Column(nullable = false, name = "company_name")
	private String companyName;

	public void announceRegister() {
		if (ObjectUtils.allNotNull(getCompanyName())) {
			registerEvent(new CompanyAddedEvent(getCompanyName()));
		}
	}

}