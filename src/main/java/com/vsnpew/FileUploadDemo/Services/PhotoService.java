//package com.vsnpew.FileUploadDemo.Services;
//
//import com.vsnpew.FileUploadDemo.Repos.PhotoRepository;
//import org.bson.BsonBinarySubType;
//import org.bson.types.Binary;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//@Service
//public class PhotoService {
//    @Autowired
//    private PhotoRepository photoRepository;
//
//
//    public String addPhoto(String title, MultipartFile file) throws IOException {
//        Photo photo = new Photo(title);
//        photo.setImage(
//                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
//        photo = photoRepository.insert(photo);
//        return photo.getId();
//
//    }
//
//    public Photo getPhoto(String id) {
//        return photoRepository.findById(id).get();
//    }
//}
