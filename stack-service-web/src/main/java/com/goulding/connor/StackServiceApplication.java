package com.goulding.connor;

import com.goulding.connor.config.StackConfig;
import com.goulding.connor.rest.LineRestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StackServiceApplication {

    public static void main(String[] args) {
        //SpringApplication.run(StackServiceApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(StackConfig.class, LineRestController.class);
        context.refresh();
    }
}
