package com.lpf.demo.xml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"springxml.xml"})
public class XmlConfig {
}
