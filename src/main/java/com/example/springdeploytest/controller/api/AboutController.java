package com.example.springdeploytest.controller.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/about")
public class AboutController {
    @Value("${application.name}")
    private String applicationName;

    @Value("${build.version}")
    private String buildVersion;

    @GetMapping
    public Map<String, String> getInfo() {
        var result = new HashMap<String, String>();
        result.put("name", applicationName);
        result.put("version", buildVersion);
        return result;
    }
}
