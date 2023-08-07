
package com.proyecto.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

    @Service
public interface FirebaseStorageService {
   public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
   
   //El BucketName es el <id_del_proyecto>+ ".appspot.com#
   final String BucketName= "carnerotuning.appspot.com";
   
   //Esta es la ruta básica de este proyecto Techshop
   final String rutaSuperiorStorage= "carnerotuning";
   
   //Ubicacion donde se encuentra el archivo de configuracion Json
   final String rutaJsonFile= "firebase";
   
   //El nombre del archivo Json
   final String archivoJsonFile= "carnerotuning-firebase-adminsdk-hwbes-f531a45aac";
    
}
