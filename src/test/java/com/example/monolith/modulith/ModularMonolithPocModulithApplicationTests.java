package com.example.monolith.modulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class ModularMonolithPocModulithApplicationTests {

	@Test
	void contextLoads() {
		// pass
	}

	@Test
	void verifiesModularStructure() {
		final ApplicationModules modules = ApplicationModules.of(ModularMonolithPocModulithApplication.class);
		modules.verify();
	}

	@Test
	void createModuleDocumentation() {
		final ApplicationModules modules = ApplicationModules.of(ModularMonolithPocModulithApplication.class);
		new Documenter(modules)
			.writeDocumentation()
			.writeIndividualModulesAsPlantUml();
		// pass
	}
}
