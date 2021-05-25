package com.vsnpew.FileUploadDemo.Controllers;

import com.vsnpew.FileUploadDemo.Services.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileUploadController {

    @Autowired
    FileUploadService fileUploadService;

    @PostMapping("/up")
    public String fileUpload(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
String bText = fileUploadService.fileUpload(file);

        return "saved into Mongo: " + bText;
    }

    @GetMapping("/new")
    public String addBook() {
//        fileUploadService.saveTest();
        return "videos";
    }
}
