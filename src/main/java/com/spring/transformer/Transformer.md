# Transformer (Still to idntify, whats the pattern name)

We have CustomUSerService, which basically searches the user.
It has 2 implementations, one is internal and other is external.
Both implementation returns its own response objects which are not recognized by our system.

So we created an interface "Transformer", which has two implementations
One is Internal and other is external. Both implementations accepts respective response objects
and converts/transforms it to system acceptable form i.e. UserDTO.

We also used facade, which has single method "SearchUser" and while searching the user in controller,
we will invoke the facade method which has the logic whether to call internal or external user service.


