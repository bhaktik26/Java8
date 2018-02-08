
package redisservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

public class SpringRedisExample {
	public static void main(String args[]) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRedisConfig.class);
		try {
			RedisTemplate redisTemplate = (RedisTemplate) ctx.getBean("redisTemplate");
			ValueOperations values = redisTemplate.opsForValue();
			values.set("joe", new Employee("01", "Joe"));
			values.set("me", new Employee("02", "Me", 21));
			if (redisTemplate.hasKey("joe"))
				System.out.println("Employee added: " + values.get("joe"));
			System.out.println("Employee added: " + values.get("me"));
			HashOperations<String, String, String> hash = redisTemplate.opsForHash();
			String empJoeKey = "emp:joe";
			String empJohnKey = "emp:john";
			Map<String, String> empJoeMap = new HashMap<>();
			empJoeMap.put("name", "Joe");
			empJoeMap.put("age", "32");
			empJoeMap.put("id", "01");
			Map<String, String> empJohnMap = new HashMap<>();
			empJohnMap.put("name", "John");
			empJohnMap.put("age", "42");
			empJohnMap.put("id", "02");
			hash.putAll(empJohnKey, empJohnMap);
			hash.putAll(empJoeKey, empJoeMap);
			System.out.println(hash.entries(empJohnKey));

		} finally {
			ctx.close();
		}

	}

}
