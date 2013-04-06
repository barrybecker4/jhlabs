JHLABS project

Some modifications to the jhlabs source to be used with some barrybecker4 applets.
The original source was developed by Jerry Huxtable. The original code is available at http://www.jhlabs.com/
Only minor modifications were made to the original, like adding enums and a few other things.

This jhlabs package was split out from the rest of barrybecker4 code, so that that code will only have a dependency
on the jhlabs.jar file. The jar file version is in the name (like jhlabs-1.0.1.jar).

To build, go into the root (jhlabs) directory and type gradle.
This will build everything and put the jar file in jhlabs/build/libs/jhlabs-1.0.x.jar
You can then copy that to the applet libs directory if you need a new version.