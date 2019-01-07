#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.consumer;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "${rootArtifactId}Consumer", autoRefreshed = true)
public class ${rootArtifactId}ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(${rootArtifactId}ConsumerApplication.class, args);
    }
}