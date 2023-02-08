# Application workflow

## Create new user
- If user is not currently a registered user they can click the Create User link or Sign Up buttons to create their account
- User is created, successfully added to the database

## Sign in
- If user has an account they can click the sign-in button to sign in
- Sign in success message
- If sign in fails, they will see an error displayed on the page

## Access site features
- Users can navigate the site to: 
  - Access their account informaiton
  - Request a scheduled pickup
  - Request a new compost bin or request a replacement bin
  - View their user contributions to date. Connect to API to create data

## View Account information
- JSP that displays user account informaiton
- Users can edit their profile - stretch goal
- JSP updates with user changes - stretch goal

## Request a scheduled pickup
- JSP that has a form with a date/time picker 
- Form submit calls servlet that stores date/time data in a servlet request attribute and ultimately stores that data in the database
- JSP updates with sucess message

## Request a new compost bin
- User submits a form from the JSP
- Servlet stores the data about the request in the database table 
- Servlet stores the address information for the user 
- Sucess message displayed on JSP

## View Contributions page
- If not signed in, user is redirected to sign in
- Once signed in, user is shown a graph with their contribution amounts by date
- Integrated API for displaying data is consumed and JSP displays the output

## Contact us 
- JSP page where Users can submit a form with questions via a contact us link
- Calls servlet via action in the form to store customer message in database

## View information about accepted materials
- Users can navigate to a JSP with informaiton about accepted materials
- JSP page with information about what can and cannot be composted