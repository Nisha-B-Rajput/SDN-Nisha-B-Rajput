# SDN-Nisha-B-Rajput
# PROJECT DEFINITION
Create a login screen for an Android. This login screen allows user to register with his email id, and allows him to store user meta data (you can assume any structure of metadata.). Also the app login screen supports cross authentication using OAUTH with Google and Facebook accounts apart from registering. After Login, just display that the “<User Name> has logged in using <email | gmail |facebook>”.

An outline of the steps that I need to follow to address the problem definition are listed below.

## Step-1: Set Up the Development Environment

*	Install Android Studio and set up for Android app development.

*	Ensure to have developer accounts with Google and Facebook for OAuth integration.

## Step-2: Create a New Android Project and Design the Login UI

* Start a new Android Studio project with an empty activity.

*	Design the login screen UI using XML layout files. We will need EditText widgets for email and password, buttons for login, registration, Google OAuth, and Facebook OAuth.

## Step-3: Implement User Registration and Login Logic

* In my activity (e.g., ‘LoginActivity.java’), I’ll need to implement the logic for user registration, email login, Google OAuth, and Facebook OAuth.

*	For Google and Facebook OAuth, I’ll need to use their respective SDKs and follow their authentication documentation.

## Step-4: Display User Information After Login

Once the user is logged in, I need to display their information. I’ll need to handle various edge cases, error handling, and the storage of metadata as per the requirement.

## Step 5: Storing User Metadata

User metadata can be stored in database like Firebase Realtime database or Firestore. Create a structure and store the data when the user registers or logs in. 






