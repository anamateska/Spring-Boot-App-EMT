package mk.ukim.finki.emt.homework2.web;

import mk.ukim.finki.emt.homework2.model.enumerations.BookCategory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "https://react-anamateska.herokuapp.com/")
@RequestMapping("/api/categories")
public class BookCategoryRestController {

    @GetMapping
    public List<BookCategory> findAll(){
        return Arrays.asList(BookCategory.values());
    }

}
