/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apedano.microservices.currencyexchangeservice;

import java.math.BigDecimal;

/**
 *
 * @author Alessandro
 */
public class ExchangeValue {
    
    private Long id;
    private String from;
    private String to;
    private BigDecimal convertionMultiple;
    private int port;

    public ExchangeValue() {
    }    

    public ExchangeValue(Long id, String from, String to, BigDecimal convertionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.convertionMultiple = convertionMultiple;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConvertionMultiple() {
        return convertionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    
    
    
    
    
    
    
    

       
    
}
