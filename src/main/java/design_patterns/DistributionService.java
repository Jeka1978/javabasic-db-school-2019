package design_patterns;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class DistributionService {
    private Map<Integer, MailGenerator> map = new HashMap<>();

    @Autowired
    private MailDao mailDao;

    public void register(int mailCode, MailGenerator mailGenerator) {
        if (map.containsKey(mailCode)) {
            throw new IllegalStateException(mailCode + " already in use");
        }
        map.put(mailCode, mailGenerator);
    }

    @Scheduled(fixedDelay = 500)
    public void sendMail() {
        int mailCode = mailDao.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generateMail();
        send(html);
    }



    private void send(String html) {
        System.out.println("html was sent: " + html);
    }
}



