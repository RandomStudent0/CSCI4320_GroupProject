# CSCI4320_GroupProject" 

Progress so far:
Classes: IOTController, Login, Client
Methods: CreateNewIOT(); deleteIOT(); editIOT(); listIOTs(); enableOrDisable(); firstPage(); registar(); loginUser();

Notes: 
enableOrDisable(); method needs to keep track, and display the state later
enterIOT(); method needs to be created to enter IOTs. Idea: Use enterIOT(); method and listIOTs(); method from the first switch case.
Then, once user types the name of the IOT, they will be entered to either classes uses switch cases 1, 2, 3, 4, 5: exit, where 1-4 are the IOT names.
Each class will be a seperate IOT and function seperately. It can also go to the first page, and exit.