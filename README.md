# TraderApp

This project requires a local Apache MQ installation. Please check EventListenerBean. By default those lines are commented.

Application provides a solution for companies want trade with each other. Companies can trade directly or can trade via man-in-middle companies.
TradeResource provides endpoints for adding company, adding connection
between companies, returning the possible paths between companies to trade returning if two company can trade with each other (directly or via man
in middles).

Datas are being persisted to h2 memory database and also a datastructure
calles tradeMap as memory cache, which refers to a forest data structure
model (non-directional and not necesarrily connected nodes in graph.)

Tags:

Graph Data Structure Modelling
Java 11
Spring Boot
OpenAPI
Filter
Domain Events
JMS Events
JUnit5
Spring Boot Test
H2, JPA, Hibernate
Spring Data
