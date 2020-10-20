package com.cgi.de.masterdatav2

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan(basePackages = ["com.cgi.de.masterdatav2"] )
class MasterDataV2Application

fun main(args: Array<String>) {
	
	runApplication<MasterDataV2Application>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
