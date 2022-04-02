package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("JAP")
public class I18nJapaneseGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Konichiwa tomodachi!!!";
    }
}
