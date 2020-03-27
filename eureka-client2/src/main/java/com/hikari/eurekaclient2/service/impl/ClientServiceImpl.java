package com.hikari.eurekaclient2.service.impl;

import com.hikari.eurekaclient2.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public List<String> getList(String[] strings) {
        return Arrays.stream(strings).collect(Collectors.toList());
    }

}
