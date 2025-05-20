package com.example.spring_learning.business;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@ComponentScan
public class BusinessCalculationService {
    private IDataService dataService;

    public BusinessCalculationService(IDataService dataService) {
        super();

        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
