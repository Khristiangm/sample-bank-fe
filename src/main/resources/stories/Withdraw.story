Narrative:
In order to withdrawl
As an admin
I want to fill the input, submit the form and check the return message

GivenStories: stories/Login.story

Scenario: Open withdraw Page
When User clicks on menu withdraw
And  User clicks on targetAccount
And User clicks on his account <cpfNumber>
And User fills the amount to withdraw <amountValue>
And User clicks on button withdraw
Then The return message for withdraw is <message>
And Show the balance equals to <balance>
Examples:
| cpfNumber		||withdrawValue||balance|| message 	   					             |
|11111111111    ||     100     ||  100  ||INF001 - Operation completed with success  |
|11111111111    ||     100     ||  0    ||ERR008 – Insufficient Balance              |
