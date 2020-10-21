package com.cgi.de.masterdatav2.service

import com.cgi.de.masterdatav2.data.CustomerRepo
import com.cgi.de.masterdatav2.data.entity.Customer
import com.cgi.de.masterdatav2.data.to.CustomerTO
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class CustomerService(private val customerRepo: CustomerRepo) {


    fun findAllCustomers():List<CustomerTO>{
        return customerRepo.findAll().toMutableList().stream().map { e -> e.toCustomerTO() }.collect(Collectors.toList())
    }

    // Mapper
    fun Customer.toCustomerTO() = CustomerTO(functionalId = "$functionalId", name = "$name")
}