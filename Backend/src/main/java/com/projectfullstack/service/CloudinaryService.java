package com.projectfullstack.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryService {

    private final Cloudinary cloudinary;

    public CloudinaryService() {
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dpioamvfm",
                "api_key", "223282517378366",
                "api_secret", "d6PoHUllzcElg3YVnCBOZC2wuHU"));
    }

    @SuppressWarnings("unchecked")
    public String uploadImage(MultipartFile file) throws IOException {
        if (file == null || file.isEmpty()) {
            throw new IllegalArgumentException("El archivo está vacío o es nulo");
        }
        System.out.println("Nombre del archivo: " + file.getOriginalFilename());
        System.out.println("Tamaño del archivo: " + file.getSize());
        Map<String, Object> uploadResult = (Map<String, Object>) cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
        return uploadResult.get("secure_url").toString();
    }
}