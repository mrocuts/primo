/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Usuario
 */
@Configuration
@EnableTransactionManagement
@ComponentScans(value = {@ComponentScan("co.com.primo.dao"),@ComponentScan("co.com.primo.service")})
public class AppConfig {
    
     @Bean
     public LocalEntityManagerFactoryBean getEntityManagerFactoryBean(){
         LocalEntityManagerFactoryBean myEMFB = new LocalEntityManagerFactoryBean();
         myEMFB.setPersistenceUnitName("co.com.primo_Primo_war_1.0-SNAPSHOTPU");
         return myEMFB;
     }
    
     @Bean
     public JpaTransactionManager getJpaTransactionManager(){
         JpaTransactionManager myJTM = new JpaTransactionManager();
         myJTM.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
         return myJTM;
     }
}