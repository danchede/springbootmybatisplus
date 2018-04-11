package com.ifox.springbootmybatisplus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SpringbootmybatisplusApplication {
	protected final static Logger logger = LoggerFactory.getLogger(SpringbootmybatisplusApplication.class);

	/**
	 * <p>
	 * 测试 RUN<br>
	 * 查看 mysql 数据库控制台：http://localhost:8080/console<br>
	 * <br>
	 * 1、http://localhost:8080/user/test<br>
	 * 2、http://localhost:8080/user/test1<br>
	 * 3、http://localhost:8080/user/test2<br>
	 * 4、http://localhost:8080/user/test3<br>
	 * 5、http://localhost:8080/user/add<br>
	 * 6、http://localhost:8080/user/selectsql<br>
	 * 7、分页 size 一页显示数量  current 当前页码
	 * 方式一：http://localhost:8080/user/page?size=1&current=1<br>
	 * 方式二：http://localhost:8080/user/pagehelper?size=1&current=1<br>
	 * </p>
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootmybatisplusApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
		logger.info("PortalApplication is success!");
		System.err.println("sample started. http://localhost:8080/user/test");
	}
}
