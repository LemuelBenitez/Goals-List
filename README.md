## Todo / Goals - List: Web App

Purpose: Create a todo/ goals list web application that has **CRUD** and **Security** capabilities.

## Specifications

1. Architecture: This web application followed the **MVC** (model 2 - front controller (dispatcher servlet) was handled by spring in the backend) which was implemented via the **Spring Framework:** **spring boot**.

            - Spring modules Used:
                               * Spring Data
                               * Spring Security
                               * Spring MVC
                               * Spring DevTools
3. Technology Used :

            - IDE:
                               * Eclipse (STS)
            - Front-End:
                               * Html, JSP, JSPF
                               * Bootstrap, Javascript, CSS

            - Back-End:
                               * Spring
                               * Java
                               * Docker
            - Database:
                               * H2
                               * MYSQL

# Run Docker using below script

docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env
MYSQL_USER=goals-user --env MYSQL_PASSWORD=dummygoals --env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 mysql:8-oracle

   # Version 1 Images

   ![ezcv logo](https://github.com/LemuelBenitez/Goals-List/blob/e7388e6ccbd9dabc1737a75731d2a0bb6e17716c/version1.1/Screenshot%202024-02-06%20at%208.52.01%E2%80%AFPM.png)

    ![ezcv logo](https://github.com/LemuelBenitez/Goals-List/blob/e7388e6ccbd9dabc1737a75731d2a0bb6e17716c/version1.1/Screenshot%202024-02-06%20at%208.51.27%E2%80%AFPM.png)

    ![ezcv logo](https://github.com/LemuelBenitez/Goals-List/blob/e7388e6ccbd9dabc1737a75731d2a0bb6e17716c/version1.1/Screenshot%202024-02-06%20at%208.51.15%E2%80%AFPM.png)

    ![ezcv logo](https://github.com/LemuelBenitez/Goals-List/blob/e7388e6ccbd9dabc1737a75731d2a0bb6e17716c/version1.1/Screenshot%202024-02-06%20at%208.51.02%E2%80%AFPM.png)

    ![ezcv logo](https://github.com/LemuelBenitez/Goals-List/blob/e7388e6ccbd9dabc1737a75731d2a0bb6e17716c/version1.1/Screenshot%202024-02-06%20at%208.50.27%E2%80%AFPM.png)

