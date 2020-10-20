package com.cgi.de.masterdatav2.data.to

import com.cgi.de.masterdatav2.data.entity.Project
import javax.persistence.CascadeType
import javax.persistence.OneToMany

data class CustomerTO(
        val functionalId:String,
        val name:String
) {
}