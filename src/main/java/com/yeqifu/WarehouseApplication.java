package com.yeqifu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

/**
 * @author luoyi-
 *
 *
 * UPDATE sys_permission SET title = '仓库管理'    WHERE id = 8;
 *
 * UPDATE bus_customer  SET customername  = "天津仓库" WHERE id =3 ;
 *
 * UPDATE bus_provider  SET zip  = "天津仓库" WHERE id =1 ;
 * UPDATE bus_provider  SET zip  = "武汉仓库" WHERE id =2 ;
 * UPDATE bus_provider  SET zip  = "杭州仓库" WHERE id =3 ;
 * UPDATE bus_provider  SET zip  = "新疆仓库" WHERE id =4 ;
 * UPDATE bus_provider  SET zip  = "内蒙仓库" WHERE id =5 ;
 * UPDATE bus_provider  SET zip  = "上海仓库" WHERE id =12 ;
 *
 *
 * UPDATE sys_permission SET title = '订单管理'    WHERE id = 12;
 *
 * UPDATE sys_permission SET title = '分货管理'    WHERE id = 2;
 *
 */
@Configuration
@SpringBootApplication
@MapperScan(basePackages = {"com.yeqifu.*.mapper"})
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}

	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		/**
		 * 单个数据大小
		 */
		factory.setMaxFileSize(DataSize.parse("102400KB"));
		/**
		 * 总上传数据大小6
		 */
		factory.setMaxRequestSize(DataSize.parse("102400KB"));
		return factory.createMultipartConfig();
	}

}
