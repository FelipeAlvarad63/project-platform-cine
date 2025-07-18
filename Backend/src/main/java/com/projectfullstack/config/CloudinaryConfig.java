package com.projectfullstack.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "Root",
            "api_key", "223282517378366",
            "api_secret", "d6PoHUllzcElg3YVnCBOZC2wuHU"
        ));
    }
}