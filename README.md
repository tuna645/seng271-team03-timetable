# seng271-team03-timetable
# Department Course Timetable Management System
*SENG 271 — Team 03*

A Java-based course scheduling system developed for the Software Engineering Department to automatically generate weekly timetables while detecting and managing constraints.

---

## Team Members
| Role | Name | GitHub Username |
| :--- | :--- | :--- |
| Member A | Tuna Eser | tuna645 |
| Member B | Levent Gürel | LeventG08 |

---

## Project Structure
* src/ — Java source code
* data/ — Input files (courses.csv, rooms.csv, etc.)
* output/ — Generated schedules and classroom request drafts
* docs/ — SRS, SDD, team agreement, and test reports

---

## How to Compile and Run

### Prerequisites
* Java JDK 21 or 25

### Terminal Commands
Run the following commands from the root directory of the project:

```bash
# 1. Compile all Java files to the out folder
javac -d out src/*.java

# 2. Run the application
java -cp out Main