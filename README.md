# SWAV: Statistical World Analysis and Visualizer

## 1. Introduction

### 1.1 Purpose

**SWAV is a software analysis tool that allows users to do the following:**

- Register a new user and login
- View data visualizations where users can manipulate the following parameters:
  1. Country
  2. Analysis Type
  3. Start/End Year
  4. View (type of graph)

### 1.3 Tools Used

- [Maven](https://maven.apache.org/)
- [JUnit](https://junit.org/junit5/)
- [Swing](https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html)
- [JFreeChart](https://www.jfree.org/jfreechart/)
- [World Bank API](https://datahelpdesk.worldbank.org/knowledgebase/articles/889392-about-the-indicators-api-documentation)
- [Randoop](https://randoop.github.io/randoop/)

## 2. Major Design Decisions

- A procedural user system was chosen, as this minimizes user errors and time in development
- An abstract class to act as a base for the different types of analysis was chosen, as remove redundancy in the code
- MVC was chosen as the overarching architecture, as it improves workflow, reduces redundancy, and enforces structure and separation of concerns
- Maven was chosen as the dependency and build manager, as it is a relatively opinionated tool that also enforces standards and structure

### Contributors

- [Laxit Shahi](https://www.linkedin.com/in/laxitshahi/) <br/>
- [Alessandro Genovese](https://github.com/alessand10) <br/>
- [Ahmed Khafaji](https://github.com/khafaji-ahmed)
