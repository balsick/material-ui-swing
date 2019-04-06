# material-ui-swing [![](https://jitpack.io/v/lamba92/material-ui-swing.svg)](https://jitpack.io/#lamba92/material-ui-swing)

A modern, Material Design UI for Java Swing

Skins JComponents to have a Material Design Look and Feel. Most components are responsive, with hover effects, and click effects (no ripple unfortunately). Fonts included.

Screenshot in action below (chessboard not included 😛):

![Screenshot](http://i.imgur.com/WsprAM6.png?1)

# Usage

Go to the releases (or just the `target/classes` folder in the repo) and download the latest version of `material-ui-swing.jar`. The OSGi version is available under `target`. Add it to your project's build path (e.g. for IntelliJ [this](https://www.jetbrains.com/help/idea/import-project-from-existing-sources-libraries-page.html) might help), and you're all set!

## Example

````java
import mdlaf.*;
import mdlaf.animation.*;
import javax.swing.*;
import java.awt.*;

public class MaterialUISwingDemo {

	public static void main (String[] args) {
		try {
			UIManager.setLookAndFeel (new MaterialLookAndFeel ());
		}
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace ();
		}

		JFrame frame = new JFrame ("Material Design UI for Swing by atharva washimkar");
		frame.setMinimumSize (new Dimension (600, 400));

		JButton button = new JButton ("PRESS ME");
		button.setMaximumSize (new Dimension (200, 200));

		JPanel content = new JPanel ();
		content.add (button);
		frame.add (content, BorderLayout.CENTER);

		// on hover, button will change to a light gray
		MaterialUIMovement.add (button, MaterialColors.GRAY_100);

		frame.pack ();
		frame.setVisible (true);
	}
}
````

Check `src/main/java/MaterialUISwingDemo.java` for a slightly longer example of how to use this library (and an explanation of what everything means/does).
For a real-world example of usage, see [here](https://github.com/atarw/washer-chess).

# Install [![](https://jitpack.io/v/lamba92/material-ui-swing.svg)](https://jitpack.io/#lamba92/material-ui-swing)
Change `LATEST_TAG` with the latest release from Jitpack.io.
**Maven**:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
...
<dependency>
    <groupId>com.github.lamba92</groupId>
    <artifactId>material-ui-swing</artifactId>
    <version>LATEST_TAG</version>
</dependency>
```
**Gradle**:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    compile 'com.github.lamba92:material-ui-swing:LATEST_TAG'
}
```
**Gradle Kotlin DSL**:
```kotlin
repositories {
    maven(url="https://jitpack.io")
}

dependencies {
    compile("com.github.lamba92","material-ui-swing", "LATEST_TAG")
}
```
# Misc

If there's a component that isn't supported, don't hesitate to open an issue! I can usually code something up for you in a couple of days 😀

[A fork of this project exists](https://github.com/vincenzopalazzo/material-ui-swing) and is maintained by [@vincenzopalazzo](https://github.com/vincenzopalazzo), which implements some Android components not found in the traditional Java Swing library.
