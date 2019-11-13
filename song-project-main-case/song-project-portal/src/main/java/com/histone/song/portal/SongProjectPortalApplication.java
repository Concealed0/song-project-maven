package com.histone.song.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.histone.song.demo.api"})
public class SongProjectPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SongProjectPortalApplication.class, args);
    }

}
