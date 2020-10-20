package com.cgi.de.masterdatav2.web

import com.cgi.de.masterdatav2.data.entity.Customer
import com.cgi.de.masterdatav2.data.CustomerRepo
import com.cgi.de.masterdatav2.data.to.CustomerTO
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors


@RestController
@RequestMapping("/customers")
class CustomerController(@Autowired val customerRepo: CustomerRepo) {

    private val log = LoggerFactory.getLogger(CustomerController::class.java)

    @GetMapping
    fun findAllCustomers(): List<CustomerTO> {
        log.info("Start findAllCustomers")
        val customer = customerRepo.findAll()
        log.info("Customers {}", customer)

        return customerRepo.findAll().toMutableList().stream().map { it.toCustomerTO() }.collect(Collectors.toList())
    }


    // Mapper
    fun Customer.toCustomerTO() = CustomerTO(functionalId = "$functionalId", name = "$name")
}