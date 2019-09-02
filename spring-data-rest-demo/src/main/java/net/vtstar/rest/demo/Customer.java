/*
 * Copyright 2015-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.vtstar.rest.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Aggregate root representing a customer.
 *
 * @author Oliver Gierke
 * @soundtrack The Intersphere - Out of phase (Live at Alte Feuerwache Mannheim)
 */
@Entity
@Data
@RequiredArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Customer {

    @GeneratedValue
    @Id
    private Long id;

    @Version
    private Long version;

    @JsonIgnore
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    private final String firstname;

    private final String lastname;

    private final Gender gender;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)//
    private final Address address;

    Customer() {
        this.firstname = null;
        this.lastname = null;
        this.address = null;
        this.gender = null;
    }

    static enum Gender {
        MALE, FEMALE;
    }
}
