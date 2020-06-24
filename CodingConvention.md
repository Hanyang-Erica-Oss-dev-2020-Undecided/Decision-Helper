## Conding Convention ##
### 1.Formating


1.1 Indent 
 + Using Tab
 ```
 We are using Tab 
 ```
 1.2 Brace
 + K&R Style.  The starting brace does not start on a new line, but on the same line as the control statement.
 ```Java
    if (superHero == theTick)
    {
        System.out.println("Spoon!");
    }                                            // NO!     
    if (superHero == theTick) {
        System.out.println("Spoon!");
    }                                            // YES!     
 ```
 + Even if the control statement is one line, braces are not omitted.
 ```Java
     if (superHero == theTick) System.out.println("Spoon!");  // NO!

    if (superHero == theTick)
        System.out.println("Spoon!");  // NO!

    if (superHero == theTick) {
        System.out.println("Spoon!");
    }                                            // YES!          
 ```
1.4 Spacing
+ Use left parenthesis without spaces after the method name
```Java
    foo (i, j); // NO!
    foo(i, j);  // YES!
```
+ Separate spaces between binary operators
```Java
    a=b+c;          // NO!
    a = b+c;        // NO!
    a=b + c;        // NO!
    a = b + c;      // YES!

    z = 2*x + 3*y;         // NO!
    z = 2 * x + 3 * y;     // YES!
    z = (2 * x) + (3 * y); // YES!
```
+ Use spaces after if, while, for, switch, and catch statements
```java
     if(hungry)  // NO!
     if (hungry) // YES!

     while(pancakes < 7)  // NO!
     while (pancakes < 7) // YES!

     for(int i = 0; i < 10; i++)  // NO!
     for (int i = 0; i < 10; i++) // YES!

     catch(TooManyPancakesException e)  // NO!
     catch (TooManyPancakesException e) // YES!
```
1.5 Maximum line length
+ No more than 100 lines.
----
### 2.Naming
All identifiers use only uppercase and lowercase letters and numbers
2.1 Class and interface
+ The first letter of each word is capitalized and the rest is lowercase.
+ The acronym uses the same rules.
```java
XMLHTTPRequest  // NO!
XmlHttpRequest  // YES!

getCustomerID   // NO!
getCustomerId   // YES!

class HTML      // NO!
class Html      // YES!

String URL      // NO!
String url      // YES!

long ID         // NO!
long id         // YES!
```
2.2 Package
+ Use only lowercase letters. Use within 8 characters.
```java
Examples:
    common
    core
    lang
```
+ Do not use compound words.
```java
Examples:
    subwayzone  // NO!
    zone.subway // YES!
```
2.3 All other identifiers
+ Field identifiers, variables, methods, and parameters follow the naming rules below.
+ The first letter except the first word is capitalized and the rest is lowercase. 
+ The acronym uses uppercase letters, but in the first word, all lowercase letters.
---
## 3. Coding
3.1 Do not use 'do..while'
+ 'do..while' statement is a syntax that is not easy to read and unfamiliar to less experienced programmers because the condition is at the bottom of the code.

3.2 Do not use 'continue'

3.3 Break is not used in control statements other than switches.

3.4 Reset
+ Declare a variable close to where it is used.
```java
Examples:
    int totalWide;
    int firstWide = 20;
    int secondWide = 12;
    firstWide = doFoo(firstWide, secondWide);
    doBar(firstWide, secondWide);
    totalWide = firstWide + secondWide;         //  wrong!

    int firstWide = 20;
    int secondWide = 12;
    firstWide = doFoo(firstWide, secondWide);
    doBar(firstWide, secondWide);
    int totalWide = firstWide + secondWide;     //  right!

    int secondWide = 12;
    int firstWide = doFoo(20, secondWide);
    doBar(firstWide, secondWide);
    int totalWide = firstWide + secondWide;     //  even better!
```
3.5 Access
+ All fields except constants must be private.
---







