package com.example.condition;


import com.example.entity.MyService;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Administrator on 2017/8/18.
 *
 * 下面这个简单的条件类只有在Classpath里存在 JdbcTemplate 时才会生效：
 */
public class JdbcTemplateCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        try {
            conditionContext.getClassLoader().loadClass(
                    "org.springframework.jdbc.core.JdbcTemplate");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

//    @Conditional(JdbcTemplateCondition.class)
//    public MyService myService(){
//        return new MyService();
//    }
}
