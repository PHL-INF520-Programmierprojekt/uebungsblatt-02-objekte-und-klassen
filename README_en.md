# Exercise Sheet: Foundations of Objects, Classes, and Object Usage
[Link to German Version](./README.md)

In this exercise sheet, you will practice the instantiation and basic usage of objects based on a given API.


## Exercise: Pet Adoption Center

In this exercise, we will use the Pet Adoption Center API to manage different pets and their adopters.

### API Description

The Pet Adoption Center API provides three classes to manage pets, adopters, and adoptions.
You will find the sources in the `de.phl.programmingproject.petadoption` package.

#### Pet Class

The `Pet` class represents a pet in the adoption center. It has the following operations:

- `Pet(final String name, final int age, final String breed)`: A constructor to create a new Pet object with the given name, age, and breed.
- `String getInfo()`: Returns a string with the pet's name, age, and breed.
- `boolean isAdopted()`: Returns a boolean indicating if the pet has been adopted or not.
- `Adoption adopt(final Adopter adopter, final Date date)`: Changes the pet's adoption status to true and creates a new adoption for a given adopter and date.

#### Adopter Class

The `Adopter` class represents a person who adopts a pet. It has the following operations:

- `Adopter(final String name, final String phone, final String email)`: A constructor to create a new Adopter object with the given name, phone, and email.
- `String getInfo()`: Returns a string with the adopter's name, phone, and email.

#### Adoption Class

The `Adoption` class represents a pet adoption. It has the following operations:

- `Adoption(final Pet pet, final Adopter adopter, final Date date)`: A constructor to create a new `Adoption` object with the given `Pet`, `Adopter`, and adoption date.
- `String getInfo()`: Returns a string with the pet's name, the adopter's name, and the adoption date.

### Tasks

Implement the following tasks in the `main` method located in the `Main` class in the `de.phl.programmingproject.petadoption` package.

1. Create a new `Pet` object with the name "Buddy", age 3, and breed "Labrador Retriever".
2. Create a new `Adopter` object with the name "Jane Smith", phone "555-555-5555", and email "janesmith@email.com".
3. Print the pet's info using the `getInfo()` operation.
4. Print the adopter's info using the `getInfo()` operation.
5. Check if the pet has been adopted using the `isAdopted()` operation and print the result.
6. Adopt the pet using the `adopt(final Adopter adopert, final Date date)` operation and store the `Adoption`.
7. Print the adoption info using the `getInfo()` operation.
8. Check if the pet has been adopted using the `isAdopted()` operation again and print the result.


## Exercise: Student Enrollment System

In this exercise, we will create a Student Enrollment System API that will allow us to manage student enrollment in different courses.
You will find the sources in the `de.phl.programmingproject.enrollmentsystem` package.

### Classes

1. `Student`: This class has the following attributes: name (`String`), id (`String`), and a set of enrolled enrollments (`Set<Enrollment>`). It should also have the following operations:

    - `getInfo()`: Returns a string with the student's name and id.
    - `enroll(final Course course)`: Adds a course to the list of enrolled courses.
    - `drop(final Course course)`: Removes a course from the list of enrolled courses.
    - `isEnrolledIn()`: Checks if the student is enrolled in a specific course.
    - `getCourses()`: Returns a list of the student's enrolled courses.

2. `Course`: This class should have the following attributes: name (`String`), and a list of enrolled students (`List<Student>`). It should also have the following operations:

    - `getInfo()`: Returns a string with the course's name.
    - `enroll(final Student student)`: Adds a student to the list of enrolled students.
    - `drop(final Student student)`: Removes a student from the list of enrolled students.
    - `isStudentEnrolled(final Student student)`: Checks if the student is enrolled in this course.
    - `getStudents()`: Returns a list of the course's enrolled students.

3. `Enrollment`: This class should have the following attributes: student (`Student`), course (`Course`), and grade (`double`). It should also have the following operations:

    - `getInfo()`: Returns a string with the student's name, the course's name, and the grade.
    - `setGrade(final double grade)`: Sets the grade for the enrollment.
    - `getStudent()`: Gets the enrolled student.
    - `getCourse()`: Gets the associated course.

### Tasks

Implement the following tasks in the `main` operation located in the `Main` class.

1. Instantiate a new `Student` object with the following information: name: "John Doe", id: "12345".
2. Instantiate a new `Course` object with the following information: name: "Introduction to Computer Science".
3. Print the information of the `Student` and the `Course`.
4. Enroll the student in the course using the `enroll()` operation and save the created `Enrollment`.
5. Print the information of the `Student` and the `Course` again to show that the enrollment was successful.
6. Print the information of the `Enrollment`.
7. Change the grade of the `Enrollment` to 4.0 using the `setGrade()` operation.
8. Print the information of the `Enrollment` again to show the updated grade.
9. Create another `Course` object with the following information: name: "Object-Oriented Programming".# Exercise Sheet: Foundations of Objects, Classes, and Object Usage

In this exercise sheet, you will practice the instantiation and basic usage of objects based on a given API.


## Exercise: Pet Adoption Center

In this exercise, we will use the Pet Adoption Center API to manage different pets and their adopters.

### API Description

The Pet Adoption Center API provides three classes to manage pets, adopters, and adoptions.
You will find the sources in the `de.phl.programmingproject.petadoption` package.

#### Pet Class

The `Pet` class represents a pet in the adoption center. It has the following operations:

- `Pet(final String name, final int age, final String breed)`: A constructor to create a new Pet object with the given name, age, and breed.
- `String getInfo()`: Returns a string with the pet's name, age, and breed.
- `boolean isAdopted()`: Returns a boolean indicating if the pet has been adopted or not.
- `Adoption adopt(final Adopter adopter, final Date date)`: Changes the pet's adoption status to true and creates a new adoption for a given adopter and date.

#### Adopter Class

The `Adopter` class represents a person who adopts a pet. It has the following operations:

- `Adopter(final String name, final String phone, final String email)`: A constructor to create a new Adopter object with the given name, phone, and email.
- `String getInfo()`: Returns a string with the adopter's name, phone, and email.

#### Adoption Class

The `Adoption` class represents a pet adoption. It has the following operations:

- `Adoption(final Pet pet, final Adopter adopter, final Date date)`: A constructor to create a new `Adoption` object with the given `Pet`, `Adopter`, and adoption date.
- `String getInfo()`: Returns a string with the pet's name, the adopter's name, and the adoption date.

### Tasks

Implement the following tasks in the `main` method located in the `Main` class in the `de.phl.programmingproject.petadoption` package.

1. Create a new `Pet` object with the name "Buddy", age 3, and breed "Labrador Retriever".
2. Create a new `Adopter` object with the name "Jane Smith", phone "555-555-5555", and email "janesmith@email.com".
3. Print the pet's info using the `getInfo()` operation.
4. Print the adopter's info using the `getInfo()` operation.
5. Check if the pet has been adopted using the `isAdopted()` operation and print the result.
6. Adopt the pet using the `adopt(final Adopter adopert, final Date date)` operation and store the `Adoption`.
7. Print the adoption info using the `getInfo()` operation.
8. Check if the pet has been adopted using the `isAdopted()` operation again and print the result.


## Exercise: Student Enrollment System

In this exercise, we will create a Student Enrollment System API that will allow us to manage student enrollment in different courses.
You will find the sources in the `de.phl.programmingproject.enrollmentsystem` package.

### Classes

1. `Student`: This class has the following attributes: name (`String`), id (`String`), and a set of enrolled enrollments (`Set<Enrollment>`). It should also have the following operations:

   - `getInfo()`: Returns a string with the student's name and id.
   - `enroll(final Course course)`: Adds a course to the list of enrolled courses.
   - `drop(final Course course)`: Removes a course from the list of enrolled courses.
   - `isEnrolledIn()`: Checks if the student is enrolled in a specific course.
   - `getCourses()`: Returns a list of the student's enrolled courses.

2. `Course`: This class should have the following attributes: name (`String`), and a list of enrolled students (`List<Student>`). It should also have the following operations:

   - `getInfo()`: Returns a string with the course's name.
   - `enroll(final Student student)`: Adds a student to the list of enrolled students.
   - `drop(final Student student)`: Removes a student from the list of enrolled students.
   - `isStudentEnrolled(final Student student)`: Checks if the student is enrolled in this course.
   - `getStudents()`: Returns a list of the course's enrolled students.

3. `Enrollment`: This class should have the following attributes: student (`Student`), course (`Course`), and grade (`double`). It should also have the following operations:

   - `getInfo()`: Returns a string with the student's name, the course's name, and the grade.
   - `setGrade(final double grade)`: Sets the grade for the enrollment.
   - `getStudent()`: Gets the enrolled student.
   - `getCourse()`: Gets the associated course.

### Tasks

Implement the following tasks in the `main` operation located in the `Main` class.

1. Instantiate a new `Student` object with the following information: name: "John Doe", id: "12345".
2. Instantiate a new `Course` object with the following information: name: "Introduction to Computer Science".
3. Print the information of the `Student` and the `Course`.
4. Enroll the student in the course using the `enroll()` operation and save the created `Enrollment`.
5. Print the information of the `Student` and the `Course` again to show that the enrollment was successful.
6. Print the information of the `Enrollment`.
7. Change the grade of the `Enrollment` to 4.0 using the `setGrade()` operation.
8. Print the information of the `Enrollment` again to show the updated grade.
9. Create another `Course` object with the following information: name: "Object-Oriented Programming".
10. Enroll the student in the new course using the `enroll()` operation.
11. Print the list of courses that the student is enrolled in using the `getCourses()` operation.
12. Print the list of students that are enrolled in the first course using the `getStudents()` operation.
13. Drop the student from the first course using the `drop()` operation.
14. Print the list of students that are enrolled in the first course again to show that the student was dropped.
10. Enroll the student in the new course using the `enroll()` operation.
11. Print the list of courses that the student is enrolled in using the `getCourses()` operation.
12. Print the list of students that are enrolled in the first course using the `getStudents()` operation.
13. Drop the student from the first course using the `drop()` operation.
14. Print the list of students that are enrolled in the first course again to show that the student was dropped.