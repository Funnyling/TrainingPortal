package by.artezio.trainingportal.web.controller;

import by.artezio.trainingportal.utils.SearchParams;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by user on 23.04.2015.
 */
@Controller
@RequestMapping(value = "/files")
public class FileStoreController {

    @RequestMapping(value = "/file/download", method = RequestMethod.GET)
    public String downloadFilePage() {
        return "file";
    }

    //it doen't workwith ajax post
    @Deprecated
    @RequestMapping(value = "/file/download", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> buildFileToDownload(@RequestBody SearchParams searchParams) {
        System.out.println(searchParams);
        File fileToSend = new File("D:\\Books\\Java\\Persistence-with-Spring-eBook.pdf");
        ResponseEntity<String> response = new ResponseEntity<String>(fileToSend.getName(), HttpStatus.OK);
        return response;
    }

    //it doen't workwith ajax post
    @Deprecated
    @RequestMapping(value = "/file/download/{fileName}", method = RequestMethod.GET)
    public ResponseEntity<byte[]> downloadFile(@PathVariable("fileName") String fileName) {
        System.out.println(fileName);
        try {
            File fileToSend = new File("D:\\Books\\Java\\Persistence-with-Spring-eBook.pdf");
            FileInputStream fileInputStream = new FileInputStream(fileToSend);
            byte[] contents = IOUtils.toByteArray(fileInputStream);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.parseMediaType("application/pdf"));
            headers.setContentDispositionFormData(fileToSend.getName(), fileToSend.getName());
            headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
            ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(contents, headers, HttpStatus.OK);
            return response;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }

    //IT's WORK!!
    @RequestMapping(value = "/file/download/getMethod", method = RequestMethod.GET)
    public ResponseEntity<byte[]> downloadFileWithParameters(@RequestParam("userGuid") String userGuid, @RequestParam("period") String period, @RequestParam("operator") String operator) {
        System.out.println(userGuid);
        System.out.println(period);
        System.out.println(operator);
        try {
            File fileToSend = new File("D:\\Books\\Java\\Persistence-with-Spring-eBook.pdf");
            FileInputStream fileInputStream = new FileInputStream(fileToSend);
            byte[] contents = IOUtils.toByteArray(fileInputStream);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.parseMediaType("application/pdf"));
            headers.setContentDispositionFormData(fileToSend.getName(), fileToSend.getName());
            headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
            ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(contents, headers, HttpStatus.OK);
            return response;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }
}
