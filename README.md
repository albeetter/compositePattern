# Lab Assignment 8: New Era University Hierarchy

**New Era University** needs an object-oriented software system to model its organizational structure. The university is composed of various educational units arranged in a hierarchy, and the system must be able to treat individual entities and groups of entities uniformly.

## Entities
* **Colleges:** High-level units that can contain departments, teachers, students, or even other colleges.
* **Departments:** Subdivisions within a college that contain teachers and students.
* **Teachers:** Individuals who have a name, a subject they teach, and a salary.
* **Students:** Individuals who have a name, a unique student ID, and pay a tuition fee.

## System Requirements
1. **Model the Hierarchy:** Implement the **Composite Design Pattern** to accurately represent the "part-whole" relationships between colleges, departments, teachers, and students.
2. **Calculate Student Count:** Dynamically calculate the total number of students within any given educational unit (e.g., a specific department or an entire college).
3. **Calculate Budget:** Compute the net budget for any unit. The budget is defined as the total sum of teacher salaries *minus* the total sum of student tuition fees.
4. **Display Details:** Print a clearly formatted, indented text tree showing the details of any educational unit and all of its sub-components.