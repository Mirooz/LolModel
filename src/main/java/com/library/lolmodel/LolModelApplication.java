package com.library.lolmodel;

import com.library.lolmodel.config.DataSourceConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LolModelApplication {

    public static void main (String[] args){

    }
}
