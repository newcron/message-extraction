# Message Extraction Sample
this example is based on a task that we worked on half a year ago for our online message box.
At eBay Kleinanzeigen buyers and sellers used to communicate via E-Mail through our platform.

We introduced a new feature  called *message box* to allow people a quicker and less formal way of communication.
Message box can be used transparently over different channels (a user of messagebox might be communicating with a user that
still uses e-mails).

One of the biggest challenge we had, was to cope with the e-mail format in order to extract the actual contents of a mail
from our template text in the first mail and all the quotation mess that mail clients produce.

## Tasks and considerations
This is a complicated task and we know that you're not going to finish it in time. Also, we have not found a perfect solution.
We want to see your approach and considerations as well as your style of work. (and maybe learn from your ideas ;) )

For this task you can assume that:

* we only cope with plaintext mails (no html content e-mails)
* you will have to handle all weird sorts of quotation styles that mail clients may or may not use.
* users may mix their replies with the quoted parts (meaning they reply individually to each paragraph)
* This project is configured for Java 7 as default - but you may change this to Java 8 if you like. 