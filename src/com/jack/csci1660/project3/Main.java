package com.jack.csci1660.project3;

/*
Project 3 should make use of topics covered during weeks seven though eleven.

Modify your code from Project 2 so that the class representing tasks implements
the appropriate interface allowing tasks to be sorted based first on
their priority then on their name.  If two tasks have different priorities,
the task with the greater priority appears before the other task.  If two
tasks have the same priority, then the task whose name would appear first
alphabetically appears before the other task.  If two tasks have the same
priority and their names are the same, then they are "equal" with regard to
the comparison.

Additionally, modify the code from Project 2 to include a custom class
representing a collection of tasks.  This class should implement the
appropriate interface so that a for-each loop can be used to iterate through
all the tasks.  The order in which the tasks are returned for the for-each loop
is up to you.

Test this new functionality.


Be sure to commit your code and push it to GitHub.  If you would like to
work in teams, use forks and pull requests; individual team members should
submit links to their fork of the repository.
 */

public class Main {

    public static void main(String[] args) {
        (new TaskManager()).main();
    }
}
