package com.vergil.ats_system.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/files")
public class FileUploadController {

    private static final String UPLOAD_DIR = "C:/uploads/resumes/";

    @PostMapping("/upload")
    public String uploadResume(@RequestParam("file") MultipartFile file) {

        try {

            File directory = new File(UPLOAD_DIR);

            if (!directory.exists()) {
                directory.mkdirs();
            }

            String filePath = UPLOAD_DIR + file.getOriginalFilename();

            file.transferTo(new File(filePath));

            return "File uploaded successfully: " + filePath;

        } catch (IOException e) {

            e.printStackTrace();
            return "File upload failed";
        }
    }
}