/*
  This is a part of Angry IP Scanner source.
 */
package teum.luk.config;

import lombok.extern.slf4j.Slf4j;

import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.logging.Level;

/**
 * Class with accessors to version information of the program.
 *
 * @author Anton Keks
 */
@Slf4j
public class Version {
	public static final String NAME = "Arduino Lab";
	
	public static final String COPYLEFT = "© 2024 Lukyanenko Sergey";

	public static final String WEBSITE = "";
	
	private static String version;
	private static String buildDate;
	
	/**
	 * @return version of currently running Angry IP Scanner (retrieved from the jar file)
	 */
	public static String getVersion() {
		if (version == null) {
			loadVersionFromJar();
		}
		return version;
	}
	
	/**
	 * @return build date of currently running Angry IP Scanner  (retrieved from the jar file)
	 */
	public static String getBuildDate() {
		if (buildDate == null) {
			loadVersionFromJar();
		}
		return buildDate;
	}

	private static void loadVersionFromJar() {
		try {
			String path = Version.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
			if (path.endsWith(".jar") || path.endsWith(".exe")) {
				JarFile jarFile = new JarFile(path);
				Attributes attrs = jarFile.getManifest().getMainAttributes();
				version = attrs.getValue("Version");
				buildDate = attrs.getValue("Build-Date");
				return;
			}
		}
		catch (Exception e) {
			log.warn("Cannot obtain version {}",e);
		}
		version = "current";
		buildDate = "today";
	}
	
	public static String getFullName() {
		return NAME + " " + getVersion();
	}
}
