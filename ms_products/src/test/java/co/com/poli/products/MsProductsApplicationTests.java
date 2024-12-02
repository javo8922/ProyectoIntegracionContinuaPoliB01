package co.com.poli.products;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class MsProductsApplicationTests {

	@Test
	void contextLoads() {
		assertDoesNotThrow(() -> MsProductsApplication.main(new String[] {}));
	}

}
