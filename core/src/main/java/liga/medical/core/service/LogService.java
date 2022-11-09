package liga.medical.core.service;

import liga.medical.core.model.Debug;
import liga.medical.core.model.Exception;
import liga.medical.core.repository.DebugRepository;
import liga.medical.core.repository.ExceptionRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class LogService {
    DebugRepository debugRepository;
    ExceptionRepository exceptionRepository;

    public void writeInDebug(Debug debug) {
        debugRepository.save(debug);
        log.info("DEBUG: Запись в базу логов произведена");
    }

    public void writeInException(Exception exception) {
        exceptionRepository.save(exception);
        log.info("EXCEPTION: Запись в базу логов произведена");
    }
}
