## Thoughts

#Initial view of the tasks

Looking at the tasks, there are some initial things that stand out.

* We need to decide how to add up the totals
* We need to decide where to calculate GiftAid
* We need to decide how to expose the totalising functionality
* Task 2 looks like a straight "Create" operation.  Thinking JPA is a good choice here.

# Think about the key tests

What are the key scenarios for Task 1?  What would the output be for a new charity?
Can I create some standard scenarios?  Charity with no GiftAid; Charity with some GiftAid; Charity with all donations eligible for GiftAid.

Check all reasons for ineligibility.

Think (as mentioned in class) about when the donation calculation should be done.

# State Assumptions

Assumption 1: the data and the rules are stable so can consider doing work in the database.
This is fair given the schema is locked down.

# What is the easiest task?

Task 2 is CRUD.  Do with JPA.  Reuse code from sample application.
Add Bank Account relationship.

Do without validation first, then add validations.
Validation 1: valid registration number
Validation 2: valid account number and sort code

Tasks

* Build a HTML form
* Build a form class to receive the data from the form
* Build a controller to handle the POST request
* Build a service class to handle the "new charity" event
* * Create Charity and Bank Account entities from event
* Build repositories to save entities
* Build a confirmation page for return

What's the right order?

No such thing, but I like to work from the domain model, so build the entities and repositories in JPA
Write some tests to make sure the save works.

Service is now just a conversion from event (the form) to the entities.

Test that.

Controller just passes through the (unvalidated) form object

Test that

Write a HTML form

Could test that (but haven't shown you how yet)

Set return page as confirmation.

Test that.

What's been learnt from this?  JPA makes creating and saving object graphs
straightforward.  

Let's look at Tasks 1 & 3.  Both require aggregation across donations.

Task 1 also requires filtering of donations based on the 
GiftAid rules.  This includes the address of the donor.

In truth, the rules of GiftAid vary over time, so there should be
a way of having different GiftAid algorithms that applied
based on the date of the donation.  This all depends on the 
batch size that is being applied.  The longer the time between
batch processing, the more the chance of the GiftAid algorithm
changing.

My original choice here is to retrieve the sum of the donations 
with and without GiftAid, and then apply the GiftAid rate
in Java.  This means that I can simulate getting the current
GiftAid rate from a service.  I'm doing this in Java 
because I would prefer to calculate the GiftAid immediately, 
rather than in a batch.  If I were to do this in a batch
process, I would do this all in the database and have
a GiftAid rate table with dates.

My query will return the sum of donations tagged by GiftAid
qualification.  It will return 2 rows; one for eligible
and one for ineligible.  A new class (ClassifiedDonationTotal)
will be the return type.

This requirement has a number of aspects to consider.

1. The GiftAid rate may change.  Any batching of processes would 
have to consider this.
2. GiftAid will be rounded (down).  If the rate became 33%, then
the GiftAid on 3 x £10 donations would be £9.99.
The GiftAid on 1 x £30 donation would be £10.

Therefore, the current implementation will provide an
indicative answer.  This could be handled in the DB or in Java,
but both would have to round each individual calculation
rather than the sum.  If this system was responsible for
paying the GiftAid (remember that's HMRC's responsibility),
then I would implement it in Java purely from the ease of 
unit testing and the ability to consider using 
BigDecimal if accuracy was required.

## Task 3

For task 3, the same thinking as task 1 is applied.
I'd really like to do this in JPA against a pre-aggregated table.
However, the constraints push me towards SQL.
The sum and count query returns all charity data, plus the total (in pence)
and the count.  I could include a service layer, create a charity DTO and
format the amount.  In this case, I'll do it in Thymeleaf.  This
gives me the chance to compare with task 1 and contrast the 
separation of concerns.

Given that the repo is a JDBC repository, I could do some formatting
in the class.  However, it feels better to do that in a separate service class.
I'll add that as a TODO.

For pagination, SQL offers the LIMIT and OFFSET options which work well here
as I'm using SQL with JDBC.  JPA offers Paging support out of the box.

The Thymeleaf page (at the moment) just shows what it's given by the
parameterised URL.  Adding a paging UI is relatively straightforward 
with Bootstrap.  Just need to calculate what the links should be and 
pass them back as another model element.  Putting this calculation in
Java feels right, but it does tie the controller to the UI.  I think
an extra optional parameter (say, pageRange - and maybe a prev/next flag) 
would be useful.  The UI can then dictate the number of pages
and the style it wants returned.  This is a good example of 
thinking about the separation of concerns and the contract that needs to exist
between the components.

Clearly need to add some tests here, especially around paging. 





