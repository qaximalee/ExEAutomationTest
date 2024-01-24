Feature: All Form Submission

  Scenario: Verify All the required message
    Given Launch the browser
    When Open URL for RAQ Form "https://8x8-preview.netlify.app/"
    And Click on Request a Demo button
    And Verify next button status of first steper
    And Verify Required messages for email
    And Verify error message when enter plain text and click on next button
    And Verify that next button status when user enter Business email
    And Verify that next button status when user enter valid Personal email
    And Verify email field with single space and multiple space only
    And Verify email field with Blocked Domains like -@foxmail.com
    And Verify email field with Blocked Domains like -@qq.com
    And Navigate To Second Step for Navigation
    And Verify next button status of second steper for First Name Last Name and Phone Number
    And Verify Required messages for First Name Last Name and Phone Number
    And Verify single space and multiple space for First Name Last Name and Phone fields
    And Verify First Name Last Name Phone fields with Special Characters
    And Verify First Name Last Name phone fields with Numeric Characters
    And Verify First Name Last Name Phone fields with emojis
    And Verify First Name Last Name with emojis and valid phone number
    And Verify First Name Last Name with emojis and Special Characters and valid phone number
    And Navigate to third Steper
    And Verify submit button status of Third steper With All empty Fields
    And Verify single space and multiple space for Company and No: of Employees fields
    And Verify Required messages for Company and No: of Employees
    And Verify Compnay and NOE with Special Characters
    And Verify Compnay and NOE with Numeric Characters
    And Verify Company and NOE fields with emojis
    And Verify Company and NOE with emojis and Special Characters
    
    And Verify Company with Special Characters and Other Form With Valid Data
    
    And Verify submit button status of Third steper For Country and Primary Interest with valid Data in Text Fields
    And Verify Selection of State Dropdown when Selcet Country as United Stated
    And Verify the Count of Country
    And Verify the Count of State
    And Verify the Count of Primary Interest
    And Submit the RAQ Form
    #And Verify the State DropDown should not empty
    #And Verify the Primary Interest DropDowns should not empty
    
    #And Verify Required messages for First Name
    #And Verify Required messages for Last Name
    #And Verify Required messages for Phone number
    #And Enter Data and click on next  button


  #Scenario: Submit RAQ Form
    #Given Launch the browser
    #When Open URL for RAQ Form "https://deploy-preview-2460--legendary-monstera-200afd.netlify.app/"
    #And Click on Request a Demo button
    #And Fillout email and click On Next button
    #And Fillout First Name, Last Name, Phone Fields and click on next button
    #And Fillout Company, Employees, Country, Interest Fields and click on Submit button
    #Then Verify Response of form code


  #Scenario: First Form Submission
    #Given Launch the browser
    #When Open URL "https://deploy-preview-2552--legendary-monstera-200afd.netlify.app/automation-testing"
    #And Fill First Form
    #And Submit Form
    #And Verify message
    #Then Verify Response of form code
    #
    #
     #Scenario: Second Form Submission
      #Given Fill Second Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Third Form Submission
      #Given Fill Third Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fourth Form Submission
      #Given Fill Fourth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Fifth Submission
      #Given Fill Fifth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Sixth Submission
      #Given Fill Sixth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Seventh Submission
      #Given Fill Seventh Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
       #Scenario: Fill Eight Submission
      #Given Fill Eight Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Ninth Submission
      #Given Fill Ninth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Tenth Submission
      #Given Fill Tenth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Eleventh Submission
      #Given Fill Eleventh Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Twelth Submission
      #Given Fill Twelth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Thirteenth Submission
      #Given Fill Thirteenth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Fourteenth Submission
      #Given Fill Fourteenth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Fiftheenth Submission
      #Given Fill Fiftheenth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Sixteenth Submission
      #Given Fill Sixteenth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Seventeenth Submission
      #Given Fill Seventeenth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Eighteenth Submission
      #Given Fill Eighteenth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #
      #Scenario: Fill Ninteenth Submission
      #Given Fill Ninteenth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Twenteenth Submission
      #Given Fill Twenteenth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Twenty one Submission
      #Given Fill Twenty one Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Twenty two Submission
      #Given Fill Twenty two Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Twenty three Submission
      #Given Fill Twenty three Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #Scenario: Fill Twenty fourth Submission
      #Given Fill Twenty four Form
      #And Submit Form
      #And Verify message
      #Then Verify Response of form code
      #
      #
      #Scenario: Fill Twenty fifth Submission
      #Given Fill Twenty fifth Form
      #And Submit Form
      #And Verify message
      #Then Verify Response code
      