package com.cgi.de.masterdatav2.data.entity


import javax.persistence.*

@Entity
data class Customer (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id:Long,

        val functionalId:String,

        val name:String,

        @OneToMany(mappedBy = "customer", cascade = [CascadeType.PERSIST])
        val  projects:Collection<Project> = emptyList()

){

        override fun toString(): String {
                return "{id: ${this.id}, name: ${this.name}, projects: ${this.projects.map { project -> project.id}} }"
        }



}