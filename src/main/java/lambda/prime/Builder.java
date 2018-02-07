/*
 * Copyright (c) 2018 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package lambda.prime;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * 
 * @author 212626994
 */
public class Builder {
	public static String readJsonFile(String filename) throws IOException {
		ClassLoader classLoader = Builder.class.getClassLoader();
		File file = new File(classLoader.getResource(filename).getFile());
		String content = new String(Files.readAllBytes(file.toPath()));
		return content;
	}

}
