----------------:Problem Description:-------------------
--------------------------------------------------------

Used Cars of PEI is looking for a program that will allow its representatives to calculate the current value of a vehicle based on certain criteria.   Your program must ask the representative for each data element, once it has this information it will calculate the vehicle current value, after which it must ask you if you would like to “Enter another vehicles information?” in order to start the process again without having to restart the program.

Inputs required from user:

Vehicle Price:  ___________

Mileage on Vehicle:  ________

Transmission (A-automatic / M-manual):  ____

Sunroof  (Y/N):  ____

Vehicle Valuation Specifications:

Mileage:                0  to 59,999          -> Lose 30% of original price

                        60,000 to 99,999      -> Lose 35% of original price

                        100,000 to 199,999    -> Lose 40% of original price

                        200,000 to over       -> Lose 50% of original price

Transmission:         Automatic ~ add 5% of original price back on

                      Manual  ~  remove 5% of original price

Sunroof:              Yes  ~  add 10% of original price back on



Expected Ouptut
Your vehicle is now valued at:  $ 999.99 

(Research required to know how to format currency in Java)

 


Sample input and results:

Inputs

Vehicle Price:   30,000

Mileage on Vehicle:   40 000

Transmission (A-automatic / M-manual):  A

Sunroof  (Y/N):   Y

Vehicle Price:   55,000

Mileage on Vehicle:   120 000

Transmission (A-automatic / M-manual):  M

Sunroof  (Y/N):   N

Result

Your vehicle is now valued at:  $ 25500

Your vehicle is now valued at:  $30250