package com.up.exam;

import com.up.exam.dao.CourseDao;
import com.up.exam.dao.dataobject.Course;
import com.up.exam.util.MD5Util;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ExamApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(MD5Util.getMD5("123456"));
		/**admin: b671494da02bfd3369e170dc372c6139
		 * 123456:239e105df1c8b7831ac3c89655580f14*/
	}
	@Autowired
	CourseDao courseDao;

	@Test
	void db(){
		List<Course> courses;
		courses = courseDao.selectAll();
		System.out.println();
	}

}
