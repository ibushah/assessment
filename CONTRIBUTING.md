# Instructions

Do not clone or push to this repository.

You must fork it to your own user, then clone it.

## Some points

`CharityApp` - the top-level class contained the main() method.

The project uses a `H2` in-memory database.  
This is initialised at start-up by the `schema.sql` and `data.sql` files.

A simple MVC slice is provided through the `CharityController.java` and `charity.html` files.

A simple test is provided (`TestDirectoryCreator.java`).  
This is just to ensure that the test reports are generated on every build.

Examples of logging are provided as well, so avoid using `System.out.println`.

`.gitignore` and a `.gitlab-ci.yml` files are provided.

The latter will attempt to build the application automatically on every commit to master on Gitlab.

I will see the results of this build.  
I will touch a file in your repositories to start a build in order to test that your application builds
so take care. 


If you wish to provide manual tests, the test plan should be documented in`README.MD`.
This should include

* How to start the application
* The web address of the application
* For each test...
    * The steps to follow
    * The expected outputs and what to check (be precise)
 







