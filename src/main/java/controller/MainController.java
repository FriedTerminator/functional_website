package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.JdbcRepository;

@RestController
@RequestMapping("/api/data")
public class MainController {

    private final JdbcRepository jdbcRepository;

    public MainController(JdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }
}
