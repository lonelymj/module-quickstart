#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.lgmn.common.repository.impl.LgmnRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {
        "com.lgmn.common.repository",//固定必填
        "com.lgmn.${rootArtifactId}.api.repository"//指向模块的api.repository包
},
        repositoryBaseClass = LgmnRepositoryImpl.class //自定义实现代替默认jpa实现
)
public class ApplicationConfig {
}