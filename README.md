# PracticumRepo
Insaaf Abdurahman

ST10464098

The purpose for the Running Motivation App is in the name.

The app is there to help motivate people to want to start a healthy lifestyle that includes running.

It is meant to make running fun and to keep track of your progress which in turn keeps one motivated to keep going.

The app was designed to help you keep track of the amount of kilometers you run per day in the morning and in the afternoon.

The app will have a logo of a man running, a very obvious approach to the logo shown below:

![RunningApp Screenshot 1](https://github.com/user-attachments/assets/62a201ef-f09c-4727-badb-f5e1265d20f3)

It will then have a splash screen displaying the following:

![RunningApp Screenshot 2](https://github.com/user-attachments/assets/73ca52b0-7891-4eee-97d6-7c989e4b1326)

Then the splash screen will change into the main screen.This is where you will see there will be text boxes that says:

Day:

Morning:

Afternon:

Notes:

and in these text boxes is where you input your details from your run.

the textboxes that state morning and afternoon is where you insert your kilometers.

here is how it looks:

![RunningApp Screenshot 3](https://github.com/user-attachments/assets/1fcf8978-0a3c-43ed-80a0-5514162a876a)

And as you can see there is a button that says next once you click that button it generates your  results and displays it on the next page.
this page also has a backbutton that takes you back to the main screen.

As it shows below:

![RunningApp Screenshot 4](https://github.com/user-attachments/assets/890758b7-5daa-4145-8ce7-56ae30048302)

the app is meant to look fun and fresh and to be interactive where it motivates you to want to run and track your progress.

Psuedocode for the app:

Start

//Define arrays

days=arrayOf("monday".. "sunday")

//Define an empty array to store log entries

array= runningLog

for each day in days:

day:(string)name of the day

morningKilometers:(float)kilometers ran in the morning

afternoonKilometers:(float)kilometers ran in the afternoon

notes:(string)additional notes

output print "enter morning kilometers for", day

input morningKilometers

output print "enter afternoon kilometers for",day

input afternoonKilometers

output print "enter notes for",day

input notes

runningEntry.day=day

runningEntry.morningKilometers=morningKilometers

runningEntry.afternoonKilometers=afternoonKilometers

runningEntry.notes=notes

add runningEntry to runningLog

output print "Running Log:"

for each entry in runningLog:

print"day:", entry.day

print"morning kilometers:",entry.morningKilometers

print"afteroon kilometers:", entry.afternoonKilometers

print"notes:", entry.notes

Stop

link to GitHub:https://github.com/saafbart/PracticumRepo.git

