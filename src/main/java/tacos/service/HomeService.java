package tacos.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String home(){
        return "home";
    }
}
