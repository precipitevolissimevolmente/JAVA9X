open module Controller {
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
}

//Notes: open keyword is mandatory due to reflection requirements by Spring Framework and Hibernate JPA