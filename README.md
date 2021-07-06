## Refernces

- Intellij
    - https://www.jetbrains.com/help/idea/configuring-testing-libraries.html
    - https://blog.jetbrains.com/idea/2016/08/using-junit-5-in-intellij-idea/
- Spring & Spring Boot Framework - https://www.youtube.com/watch?v=PSP1-2cN7vM&t=893s
- Introduction to JPA and Hibernate using Spring Boot Data Jpa - http://www.springboottutorial.com/introduction-to-jpa-with-spring-boot-data-jpa
- Functional Programming - https://youtu.be/aFCNPHfvqEU
- JUnit - https://junit.org/junit5/docs/current/user-guide/
- AssertJ - https://joel-costigliola.github.io/assertj/
- Mockito - https://github.com/mockito/mockito/wiki/FAQ
- JsonPath - https://github.com/json-path/JsonPath
- Setting up JUnit 5 with Mockito and Spring Boot 2.0 - https://medium.com/@dSebastien/using-junit-5-with-spring-boot-2-kotlin-and-mockito-d5aea5b0c668
- Good Unit Testing
    - https://github.com/mockito/mockito/wiki/How-to-write-good-tests
    - FIRST. https://pragprog.com/magazines/2012-01/unit-tests-are-first
    - Patterns - http://xunitpatterns.com
    
### Mockito SOW

Easier Static Imports
```
Window > Preferences > Java > Editor > Content Assist > Favorites
org.junit.Assert
org.mockito.BDDMockito
org.mockito.Mockito
org.assertj.core.api.Assertions
org.hamcrest.Matchers
org.hamcrest.CoreMatchers
org.hamcrest.MatcherAssert
```
### Description
- write great Unit and Integration tests using Spring Boot Starter Test
- write unit tests using Mocks and Spys created with Mockito
- write independent unit tests for RESTful web services talking with multiple layers - web, business and data
- write integration tests using an in memory database - H2
- use all the frameworks that are part of Spring Boot Starter Test - JUnit, Spring Test, Spring Boot Test, AssertJ, Hamcrest, Mockito, JSONassert and JsonPath.
- use the most important Unit Testing Annotations - @RunWith(SpringRunner.class), @SpringBootTest, @WebMvcTest, @DataJpaTest and @MockBean.

### Step By Step Details

- Step 01: Setting up the project using Spring Initializr
- Step 02: Writing Unit Test for a Simple Business Service
- Step 03: Setting up a Business Service to call a Data Service
- Step 04: Writing your first unit test with Stub
    - Exercise - Update Tests 2 & 3
- Step 05: Exercise Solution - Updating Tests 2 & 3 to use Stubs - Problem with Stubs.
- Step 06: Writing Unit Tests with Mocking using Mockito
    - Exercise - Updating Tests 2 & 3 to use Mockito
- Step 07: Exercise Solution - Updating Tests 2 & 3 to use Mockito
- Step 08: More Refactoring - @Mock, @InjectMocks and @RunWith(MockitoJUnitRunner.class)
- Step 09: Mockito Tips - Multiple Return Values and Specific Argument Matchers
- Step 10: Mockito Tips - Argument Matchers
- Step 11: Mockito Tips - Verify method calls
- Step 12: Mockito Tips - Argument Capture
- Step 13: Mockito Tips - Argument Capture on Multiple Calls
- Step 14: Introduction to Spy
- Step 15: Mockito FAQ

## Spring Boot & Mockito - Unit Testing

### Step By Step Details

- Step 01: Creating a Hello World Controller
- Step 02: Using Mock Mvc to test Hello World Controller
- Step 03: Using Response Matchers to check status and content
- Step 04: Creating a Basic REST Service in Item Controller
- Step 05: Unit Testing Item Controller and Basic JSON Assertions
- Step 06: Digging deeper into JSON Assert
- Step 07: Writing a REST Service talking to Business Layer
- Step 08: Writing Unit Test for REST Service mocking Business Layer
- Step 09 - 01 - Prepare Data Layers with JPA, Hibernate and H2
- Step 10: Create Item Entity and Populate data with data.sql
- Step 11: Create a RESTful Service talking to the database
- Step 12: Writing Unit Test for Web Layer - Controller - Using Mock MVC
- Step 13: Exercise & Solution - Writing Unit Test for Business Layer - Mocking
- Step 14: Writing Unit Test for Data Layer - Data JPA Test
    - Exercise - Write Unit Test for findById method retrieving item with id 10001
- Step 15: Writing an Integration Test using @SpringBootTest
    - Exercise - Make Asserts Better
- Step 16: Tip : Using @MockBean to mock out dependencies you do not want to talk to!
- Step 17: Tip : Creating Different Test Configuration
- Step 18: Writing Unit Tests for Other Request Methods
- Step 19: Refactor SomeBusinessImpl to use Functional Programming
    - Exercise - Convert the second method to use Functional Approach
- Step 20: Better Assertions with Hamcrest - HamcrestMatcherTest
- Step 21: Better Assertions with AssertJ - AssertJTest
- Step 22: Better Assertions with JSONPath - JSONPathTest
- Step 23: Easier Static Imports
- Step 24: Tip : Measuring Test Coverage with Eclipse
- Step 25: Tip : Keep an eye on performance of unit tests!
- Step 26: Good Unit Tests
