package pers.husen.highdsa.service.activemq.mqproducer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Desc 测试文件服务
 *
 * @Author 何明胜
 *
 * @Created at 2018年2月5日 下午1:03:55
 * 
 * @Version 1.0.1
 */
public class RegisterActiveMqProducer {
	public static void main(String[] args) throws IOException {
		String[] configLocations = new String[] {"spring/spring-context.xml", "spring/spring-activemq.xml", "spring/dubbo-service-mq-producer.xml"};
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		context.start();
		
		System.out.println("=============== activemq 生产者服务已经启动... ==================");
		
		System.in.read();
		context.close();
	}
}