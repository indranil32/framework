/**
 * 
 */
package com.example.test.framework.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test.framework.config.Servers;

/**
 * @author indranilm
 *
 */
@RestController
public class SpringTestController {
	
	@Autowired
	private Servers servers;
	
	@RequestMapping("/")
    public String index() {
		StringBuffer buff = new StringBuffer("my:servers:");
		for (String str: servers.getServers()) {
			buff.append(str);
			buff.append(",");
		}
        return buff.toString();
    }
}
