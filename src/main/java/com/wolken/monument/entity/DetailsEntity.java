package com.wolken.monument.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table
@ToString
@NamedQueries({
	@NamedQuery(name = "getAll", query = "from DetailsEntity")
})
public class DetailsEntity {

	@Id
	@GenericGenerator(name = "prasad", strategy = "increment")
	@GeneratedValue(generator = "prasad")
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String location;
	@Column
	private float entryFee;
	@Column
	private String builtFor;
	@Column
	private short yOC;

}
