# sel-mav

RUN TEST USING MAVEN & GROUPING.

This includes parallel execution, but multithreading needs to be added for driver.

To run test in groups:
Group Execution

        <groups>
            <run>
                <include name="Regression"></include>
            </run>
        </groups>
        <classes>
            <class name="testScript.verifyBing"></class>
            <class name="testScript.verifyGoogle"></class>
        </classes>
