
package lambda.prime;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@SuppressWarnings("javadoc")
public class Builder {
	public static String readJsonFile(String filename) throws IOException {
		ClassLoader classLoader = Builder.class.getClassLoader();
		File file = new File(classLoader.getResource(filename).getFile());
		String content = new String(Files.readAllBytes(file.toPath()));
		return content;
	}

}
