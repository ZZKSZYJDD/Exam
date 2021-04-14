package com.up.exam;

import com.up.exam.util.MD5Util;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExamApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(MD5Util.getMD5("123456"));
		/**admin: b671494da02bfd3369e170dc372c6139
		 * 123456:239e105df1c8b7831ac3c89655580f14*/
	}

}
