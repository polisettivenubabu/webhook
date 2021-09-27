package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/webhook")
public class Book {

    @PostMapping
    public ResponseEntity<String> print(@RequestBody String rbody){
        System.out.println("sample"+ rbody);

        return new ResponseEntity<String> (rbody, HttpStatus.OK);
    }

}
