package com.cgi.de.masterdatav2.data.entity

import javax.persistence.*

@Entity
data class Project(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,

        val functionalId: String = "",

        val description: String = "",

        @ManyToOne @JoinColumn(name = "customer_fk") val customer: Customer
) {
    override fun toString(): String {
        return "{id: ${this.id}, functionalId: ${this.functionalId}, customers: ${this.customer} }"
    }
}