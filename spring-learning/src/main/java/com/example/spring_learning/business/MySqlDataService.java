package com.example.spring_learning.business;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlDataService implements IDataService{
    @Override
    public int[] retrieveData() {
        return new int[] { 1, 2, 3, 4, 5 };
    }
}
