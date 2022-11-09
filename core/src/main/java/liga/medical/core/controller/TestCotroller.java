package liga.medical.core.controller;

import liga.medical.core.model.Debug;
import liga.medical.core.service.LogService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class TestCotroller {
    private LogService logService;

    @PostMapping("/logging")
    public ResponseEntity saveLog(Debug debug) {
        logService.writeInDebug(debug);
        return ResponseEntity.ok("Залогировано");
    }
}
