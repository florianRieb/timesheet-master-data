package com.cgi.de.masterdatav2.data

import com.cgi.de.masterdatav2.data.entity.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepo: CrudRepository<Customer,Long>{
}