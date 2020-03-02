$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/hunb/mutation_pi/systemTest/feature/SystemTest.feature");
formatter.feature({
  "name": "Csoport kezelés",
  "description": "",
  "keyword": "Jellemző"
});
formatter.scenario({
  "name": "Csoport létszám kezelése",
  "description": "",
  "keyword": "Forgatókönyv"
});
formatter.step({
  "name": "egy üres csoport",
  "keyword": "Adott "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.feature.SystemTest.newEmptyGroup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hozzáadok egy főt",
  "keyword": "Amennyiben "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.feature.SystemTest.addOnePersonToTheGroup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a csoport létszáma egy",
  "keyword": "Akkor "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.feature.SystemTest.groupSize1()"
});
formatter.result({
  "status": "passed"
});
});