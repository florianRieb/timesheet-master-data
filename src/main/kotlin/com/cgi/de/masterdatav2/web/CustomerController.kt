package com.cgi.de.masterdatav2.web

import com.cgi.de.masterdatav2.data.to.CustomerTO
import com.cgi.de.masterdatav2.service.CustomerService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors


@RestController
@RequestMapping("/customers")
class CustomerController(@Autowired val customerService: CustomerService) {

    private val log = LoggerFactory.getLogger(CustomerController::class.java)

    @GetMapping
    fun findAllCustomers(): List<CustomerTO> {
        return customerService.findAllCustomers()
    }

}