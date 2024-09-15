# Project Design Pattern

This repository aims to compare two widely used design patterns for test automation: Page Objects and Screenplay. Both are popular approaches to structuring and organizing automated tests, but each has its own advantages and disadvantages. Here, you will find examples of how these patterns can be implemented in web interface tests, allowing for comparison between the two.

## Design Patterns:

* **Page Objects**: The Page Objects pattern is a way of organizing UI tests where each page or component of the user interface is represented by a class. This class encapsulates the page elements and the interactions that can be made with them.
* **Screenplay**: Screenplay is a more recent approach that follows the Actor-Oriented Design pattern. Instead of representing pages or components, it focuses on the actions that can be performed by actors in the system, allowing for greater reusability and flexibility in creating tests.


## Repository Structure:

Below is the basic project structure, with a focus on UI tests:

    .
    │ 
    ├── src                     
    │   ├── PageObjectWebTest.java   #  Tests using the Page Objects pattern          
    │   └── sScreenPlayWebTest.java  #  Tests using the Screenplay pattern
    │ 
    └── tests                        # It includes all test-related source code for the project
    │   ├── PageObjectWebTest        # Includes all tests Page Object
    │   └── ScreenPlayWebTest        # Includes all tests ScreenPlay 

## Running the Tests:

### Prerequisites:
- Java 8 or higher
- Gradle installed

### Steps to run:

- Clone the repository:
```bash
git clone https://github.com/rgutierressouza/java-project-design-pattern.git
```

- Navigate to the project directory:
```bash
cd java-project-design-pattern
```

- Run the tests with Gradle:
```bash
gradle test
```

###  To run specific tests for each pattern:

  * Page Objects:
```bash
gradle test --tests "PageObjectWebTest"
```

  * Screenplay:
```bash
gradle test --tests "ScreenPlayWebTest"
```

### Contribution:
Feel free to open issues or submit pull requests with improvements, corrections, or suggestions for new approaches.

### License:
This project is licensed under the terms of the MIT License.

