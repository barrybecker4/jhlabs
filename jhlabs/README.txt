JHLABS project

I made some modifications to the jhlabs source so I can use it with one or two of the applets I developed.
The source was developed by Jerry Huxtable. The original code is available at http://www.jhlabs.com/
I only made some minor tweaks like adding enums and a few other things.

I split the jhlabs package out from the rest of my code, so that my code will only have a dependency on the jhlabs.jar file.
I gave the jar file a version in the name like jhlab-1.0.1.jar so I know explicitly which version I am dealing with.

To build, go into the root jhlabs directory and type gradle.
This will build everything and put the jar file in jhlabs/jhlabs/build/libs/jhlabs-1.0.x.jar
You can then copy that to the applet libs directory if you need a new version.