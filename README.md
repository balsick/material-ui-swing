# material-ui-swing [![](https://jitpack.io/v/balsick/material-ui-swing.svg)](https://jitpack.io/#balsick/material-ui-swing)

A modern, Material Design UI for Java Swing

Skins JComponents to have a Material Design Look and Feel. Most components are responsive, with hover effects, and click effects (no ripple unfortunately). Fonts included.

This repo offers an additional Dark Material theme over the Material Look&Feel of the original repo.

# Usage

Just install the Look&Feel to the UIManager and it's done. 

## Example

````java
import it.balsick.swing.material.dark.DarkMaterialLookAndFeel;
import mdlaf.animation.*;
import javax.swing.*;
import java.awt.*;

public class MaterialUISwingDemo {

	public static void main (String[] args) {
		try {
			UIManager.setLookAndFeel (new DarkMaterialLookAndFeel ());
		}
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace ();
		}

		JFrame frame = new JFrame ("Dark Material Design UI for Swing by atharva washimkar");
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

Check `src/main/java/DarkMaterialUISwingDemo.java` for a slightly longer example of how to use this library (and an explanation of what everything means/does).
For a real-world example of usage, see [here](https://github.com/atarw/washer-chess).

# Install [![](https://jitpack.io/v/balsick/material-ui-swing.svg)](https://jitpack.io/#balsick/material-ui-swing)
Change `LATEST_TAG` with the latest release from Jitpack.io.

**Maven**:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<dependency>
    <groupId>it.balsick</groupId>
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
    compile 'it.balsick:material-ui-swing:LATEST_TAG'
}
```
**Gradle Kotlin DSL**:
```kotlin
repositories {
    maven(url="https://jitpack.io")
}

dependencies {
    compile("it.balsick","material-ui-swing", "LATEST_TAG")
}
```
