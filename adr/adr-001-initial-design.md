## Context
I want to create a service that is responsible to create and handle with shorter urls

It expected that the service handle with two cases:
1. Given a long URL, it should return a shorter URL / ex: github.com/garri-codes/garri.ly -> garry.ly/FDAYI
2. Given a shorter URL, it should redirect to long URL 

## Decision

At first moment, some rules should be followed 
- Domain URL is static -> garri.ly/{HASH}
- The service must be scalable, fault tolerant and high avaiable
- The URL can be created but not updated or deleted
- The service can handle with a traffic volume of 25 millions URLs generated per day
- The service that handle with a traffic volume of 250 million redirect per day. (rule 70/30)
- Should apply a rate limit 

### Which database use?
- A ADR will be created to made a decision of which database should be used. ( key/value? / document? )

### Which language use?
- Kotlin (no reasons for this choice, only to practice) 

### What about diagrams?
[![Screen-Shot-2020-11-30-at-23-06-47.png](https://i.postimg.cc/C5kFhLdZ/Screen-Shot-2020-11-30-at-23-06-47.png)](https://postimg.cc/RJCrGm79)
