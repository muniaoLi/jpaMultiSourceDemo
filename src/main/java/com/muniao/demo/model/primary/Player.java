package com.muniao.demo.model.primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Player {
	@Id
	@GeneratedValue
	private Long id;

	@NotEmpty(message = "名字不能为空")
	@Size(min = 1, max = 20)
	@Column(nullable = false, length = 20, unique = true)
	private String name;
}
