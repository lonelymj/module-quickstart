#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@NacosPropertySource(dataId = "${rootArtifactId}Provider", autoRefreshed = true)
public class ${rootArtifactId}ProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(${rootArtifactId}ProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
