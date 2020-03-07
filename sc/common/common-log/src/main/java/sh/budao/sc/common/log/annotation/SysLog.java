package sh.budao.sc.common.log.annotation;


import java.lang.annotation.*;

/**
 * @author sc
 * @date 2020/3/7
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog
{
    /**
     * description
     *
     * @return{String}
     */
    String value();
}
