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

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Spring Data repository interface to manage {@link Customer} instances.
 *
 * @author Oliver Gierke
 * @author Mark Paluch
 * @soundtrack The Intersphere - Out of phase (Live at Alte Feuerwache Mannheim)
 */
@CrossOrigin(origins = {"http://localhost", "http://localhost:1234"})
@RepositoryRestResource(path="customer")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @RestResource(path = "conditions", rel = "conditions")
    Customer findByFirstnameAndLastname(@Param("firstname") String firstname, @Param("lastname") String lastname);
}
