package com.example.wfrphelper;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com/example/wfrphelper/model")
public class SpringConfig {
}
