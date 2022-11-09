package com.example.eksa.lib;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Component
@FeignClient(value="example", url = "k8s-hello-testingr-db50395e52-753162095.ap-northeast-2.elb.amazonaws.com/B")
public interface BClient {
    @GetMapping("/")
    Map<String, String> getB();
}
