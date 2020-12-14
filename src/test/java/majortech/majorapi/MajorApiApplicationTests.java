package majortech.majorapi;

import majortech.majorapi.controller.MajorApiController;
import majortech.majorapi.model.MajorApiModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootTest
class MajorApiApplicationTests {
	@Autowired
	private MajorApiModel major;

	@Test
	void registrationWorksThroughAllLayers() throws Exception {
		MajorApiModel major = new MajorApiModel("Zaphod");
		MajorApiController controller = new MajorApiController();
		controller.saveMajor(major);
		int id = 1;
		controller.checkId(1);
	}
}
