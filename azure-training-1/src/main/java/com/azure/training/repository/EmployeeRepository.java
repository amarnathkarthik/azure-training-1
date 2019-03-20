/**
 * 
 */
package com.azure.training.repository;

import org.springframework.data.repository.CrudRepository;

import com.azure.training.model.Employee;

/**
 * @author kamarnat
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
