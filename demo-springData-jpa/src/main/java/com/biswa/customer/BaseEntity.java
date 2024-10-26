package com.biswa.customer;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {

	@CreatedDate
	private LocalDateTime createdDate;

	@CreatedBy
	private String createdBy;

	@LastModifiedDate
	private LocalDateTime updatedDate;

	@LastModifiedBy
	private String updatedBy;

}
