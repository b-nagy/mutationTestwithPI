$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/hunb/mutation_pi/systemTest/groupSearchFeature/GroupSearch.feature");
formatter.feature({
  "name": "Csoportban való keresések",
  "description": "",
  "keyword": "Jellemző"
});
formatter.scenario({
  "name": "Sorszám alapú keresés",
  "description": "",
  "keyword": "Forgatókönyv"
});
formatter.step({
  "name": "egy öt fős csoport",
  "keyword": "Adott "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSearchFeature.GroupSearchSteps.newGroupWithThreePerson()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a csoport második tagját keresem",
  "keyword": "Amennyiben "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSearchFeature.GroupSearchSteps.searchId_2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visszakapom a nevét és életkorát",
  "keyword": "Akkor "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSearchFeature.GroupSearchSteps.getNameAndAge()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Név és kor alapú azonosítás",
  "description": "",
  "keyword": "Forgatókönyv"
});
formatter.step({
  "name": "egy öt fős csoport",
  "keyword": "Adott "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSearchFeature.GroupSearchSteps.newGroupWithThreePerson()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "név és kor alapján eltávolítok egy főt: \"Adam\"-14",
  "keyword": "Amennyiben "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSearchFeature.GroupSearchSteps.removeGetNameAndAge(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kiírja, hogy: \"Adam:14 removed from group\"",
  "keyword": "Akkor "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSearchFeature.GroupSearchSteps.removeReturnMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Név és kor alapú azonosítás",
  "description": "",
  "keyword": "Forgatókönyv"
});
formatter.step({
  "name": "egy öt fős csoport",
  "keyword": "Adott "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSearchFeature.GroupSearchSteps.newGroupWithThreePerson()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "név és kor alapján eltávolítok egy főt: \"Adam\"-16",
  "keyword": "Amennyiben "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSearchFeature.GroupSearchSteps.removeGetNameAndAge(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kiírja, hogy: \"Adam:16 is not in the group\"",
  "keyword": "Akkor "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSearchFeature.GroupSearchSteps.removeReturnMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/hunb/mutation_pi/systemTest/groupSizeManagementFeature/GroupSizeManagement.feature");
formatter.feature({
  "name": "Csoport létszám kezelése",
  "description": "",
  "keyword": "Jellemző"
});
formatter.scenario({
  "name": "Csoporthoz hozzáadás",
  "description": "",
  "keyword": "Forgatókönyv"
});
formatter.step({
  "name": "egy üres csoport",
  "keyword": "Adott "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.newEmptyGroup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hozzáadok egy főt",
  "keyword": "Amennyiben "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.addOnePersonToTheGroup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a csoport létszáma: 1",
  "keyword": "Akkor "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.groupSize(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Csoportból eltávolítás",
  "description": "",
  "keyword": "Forgatókönyv"
});
formatter.step({
  "name": "egy három fős csoport",
  "keyword": "Adott "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.newGroupWithThreePerson()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "egy főt elveszek belőle",
  "keyword": "Amennyiben "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.onePersonLeavesTheGroup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a csoport létszáma: 2",
  "keyword": "Akkor "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.groupSize(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Csoport kiürítése",
  "description": "",
  "keyword": "Forgatókönyv"
});
formatter.step({
  "name": "egy három fős csoport",
  "keyword": "Adott "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.newGroupWithThreePerson()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a csoportot kiürítem",
  "keyword": "Amennyiben "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.removeAllPersonFromTheGroup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a csoport létszáma: 0",
  "keyword": "Akkor "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.groupSize(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Csoport maximum létszáma öt fő",
  "description": "",
  "keyword": "Forgatókönyv"
});
formatter.step({
  "name": "egy üres csoport",
  "keyword": "Adott "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.newEmptyGroup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hozzáadok öt főt",
  "keyword": "Amennyiben "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.addFivePersonToTheGroup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a hatodik fő hozzáadásánál hibaüzenetet kapok",
  "keyword": "Akkor "
});
formatter.match({
  "location": "hunb.mutation_pi.systemTest.groupSizeManagementFeature.GroupSizeManagementSteps.maximumLimitValidation()"
});
formatter.result({
  "status": "passed"
});
});