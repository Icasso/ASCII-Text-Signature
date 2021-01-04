https://github.com/users/Icasso/projects/3#card-52155477
# ASCII-Text-Signature
# Description
Let's increase the font size and use another font that looks very similar to the real font called "Times New Roman".

The lowercase forms of the first four characters of the Roman alphabet are shown below in this new font:
````
           .o8                       .o8
          "888                      "888
 .oooo.    888oooo.   .ooooo.   .oooo888
`P  )88b   d88' `88b d88' `"Y8 d88' `888
 .oP"888   888   888 888       888   888
d8(  888   888   888 888   .o8 888   888
`Y888""8o  `Y8bod8P' `Y8bod8P' `Y8bod88P"
````
You can download this font, along with the smaller and less fancy font from the previous example.

As you may remember, the width of a space in the Medium font is 4 symbols. In the Roman font, your program should base the width of the space on the width of the “a” symbol; the space should be 10 symbols wide.

It looks very authentic, doesn’t it? Unfortunately, there’s not enough space here to include all lowercase and uppercase letters.

All these fonts have a special description included in their .txt file. The first line of the file contains two numbers. The first number is font size, which indicates how many lines are needed to print one line of text using this font. For example, the Medium font needs 3 lines, and the Roman font needs 10. The second number is the number of characters described in the file. The file for each font contains information about 52 characters: 26 uppercase and 26 lowercase letters.

The next lines contain information about the characters, one after another. The information about each character includes: this character, then the width of the character, and on the next lines, the way the character is represented in ASCII. Note that these fonts contain a column of spaces at the end of every symbol, so you don't need to add any.

Don't worry, reading text from a file is as simple as reading from the console. You can use a scanner to do this, but instead of System.`in`, pass File(pathToFont) when creating a scanner. You should make sure to use an absolute path to avoid problems with checking. For example, use Scanner(File("C:/fonts/roman.txt")) for the Roman font on Windows, or Scanner(File("/home/username/fonts/roman.txt")) on Linux/MacOS systems.

At this stage, you need to create a program that generates a name tag using the Roman font. It should also print the status of this person using the Medium font. The status of the person should be centered. When the length of the status is longer than the length of the full name, then the name and last name should be centered.

## Output examples
The examples are shown below:
````
Enter name and surname: Ian One
Enter person's status: VIP
888888888888888888888888888888888888888888888888888888888888888888888888888888888
88  ooooo                                   .oooooo.                           88
88  `888'                                  d8P'  `Y8b                          88
88   888   .oooo.   ooo. .oo.             888      888 ooo. .oo.    .ooooo.    88
88   888  `P  )88b  `888P"Y88b            888      888 `888P"Y88b  d88' `88b   88
88   888   .oP"888   888   888            888      888  888   888  888ooo888   88
88   888  d8(  888   888   888            `88b    d88'  888   888  888    .o   88
88  o888o `Y888""8o o888o o888o            `Y8bood8P'  o888o o888o `Y8bod8P'   88
88                                                                             88
88                                                                             88
88                                                                             88
88                                _  _ _ ___                                   88
88                                |  | | |__]                                  88
88                                 \/  | |                                     88
888888888888888888888888888888888888888888888888888888888888888888888888888888888
Enter name and surname: A b
Enter person's status: long participant
88888888888888888888888888888888888888888888888888888888888888888888888888888888
88                         .o.                  .o8                           88
88                        .888.                "888                           88
88                       .8"888.                888oooo.                      88
88                      .8' `888.               d88' `88b                     88
88                     .88ooo8888.              888   888                     88
88                    .8'     `888.             888   888                     88
88                   o88o     o8888o            `Y8bod8P'                     88
88                                                                            88
88                                                                            88
88                                                                            88
88  _    ____ _  _ ____      ___  ____ ____ ___ _ ____ _ ___  ____ _  _ ___   88
88  |    |  | |\ | | __      |__] |__| |__/  |  | |    | |__] |__| |\ |  |    88
88  |___ |__| | \| |__]      |    |  | |  \  |  | |___ | |    |  | | \|  |    88
88888888888888888888888888888888888888888888888888888888888888888888888888888888
````
