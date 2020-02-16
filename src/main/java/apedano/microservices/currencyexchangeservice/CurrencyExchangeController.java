/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apedano.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alessandro
 */
@RestController
public class CurrencyExchangeController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyExchangeController.class);
    
    @Autowired
    private ExchangeValueRepository exchangeValueRepository;
    
    @Value("${server.port}")
    int port;
    
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
        exchangeValue.setPort(port);
        LOGGER.info("[Currency exchange service] exchangeValue -> {}", exchangeValue);
        return exchangeValue;
    }
    
}
