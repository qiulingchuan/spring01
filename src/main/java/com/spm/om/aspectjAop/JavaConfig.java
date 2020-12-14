package com.spm.om.aspectjAop;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author skyqlc
 * @name com.spm.om.aspectjAop
 * @create 2020/09/13:16:09
 */
@Configurable
@ComponentScan
@EnableAspectJAutoProxy
public class JavaConfig {
}
