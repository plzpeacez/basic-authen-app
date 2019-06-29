package com.homse.hombackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@DynamicUpdate
@SelectBeforeUpdate
@Getter @Setter
public abstract class AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1745066067685704533L;

    @CreatedBy
    @Column(name = "created_by_user", updatable = false, length = 50)
    @JsonIgnore
    private String createdByUser;

    @Column(name = "created_by_program", updatable = false, length = 50)
    @JsonIgnore
    private String createdByProgram;

    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    @JsonIgnore
    private Instant createdDate;

    @LastModifiedBy
    @Column(name = "updated_by_user", length = 50)
    @JsonIgnore
    private String updatedByUser;

    @Column(name = "updated_by_program", length = 50)
    @JsonIgnore
    private String updatedByProgram;

    @LastModifiedDate
    @Column(name = "updated_date")
    @JsonIgnore
    private Instant updatedDate;
}
