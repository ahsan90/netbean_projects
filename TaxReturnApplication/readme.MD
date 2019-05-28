--------------:Problem Description:------------------
-----------------------------------------------------

TaxReturn Applicaiton:

Create a TaxReturn class with fields that hold a taxpayer’s Social Security number, last name, first name, street address, city, state, zip code, annual income, marital status, and tax liability.
Include a constructor that requires arguments that provide values for all the fields other than the tax liability. The constructor calculates the tax liability based on annual income and the percentages in the following table.

Tax Rate 
Income ($)	Marital Status - Single	Marital Status - Married
0-20,000	15%	14%
20,001-50,000	22%	20%
50,001 and over	30%	28%

In the TaxReturn class, also include a display method that displays all the TaxReturn data (This method can call a toString() method).
Save the file as TaxReturn.java.

PrepareTaxMain

Create an application that prompts a user for the data needed to create a TaxReturn.
Continue to prompt the user for data as long as any of the following are true:

Validation on User Input Required

The Social Security number is not in the correct format, with digits and dashes in the appropriate positions; for example, 999-99-9999.

Suggestions:

->Research validating ssn using regular expressions  with the String matches method
->Use charAt along with Character.isDigit method.
->Find another way of your own.

The zip code is not five digits.
The marital status does not begin with one of the following: S, s, M, or m.
The annual income is negative. 

After all the input data is correct, create a TaxReturn object and then display its values.
Save the file as PrepareTaxMain.java.