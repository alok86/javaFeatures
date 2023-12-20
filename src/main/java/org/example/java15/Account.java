package org.example.java15;

/*
*
* final classes vs sealed classes
The classes declared as final can be considered another form of sealing which restricts all classes to be extend the target class.
Sealed classes can be considered more flexible form of final classes which provide a more declarative way than access modifiers to restrict the use of a superclass.

Constraints on Permitted Subclasses (SavingsAccount and CheckingAccount in above example) must have exactly one of the following modifiers to describe how it continues the sealing initiated by its superclass:

final: Cannot be extended further (in above example both permitted subclasses use final modifier).
sealed: Can only be extended by its permitted subclasses. That way we can further restrict subclassing.
non-sealed: Can be extended by unknown subclasses; a sealed class cannot prevent its permitted subclasses from doing this.
Other than above restrictions, the permitted classes must be in the same module as the sealed class (if the sealed class
* is in a named module) or in the same package (if the sealed class is in the unnamed module, as in the Account.java example).
* See tutorials on module here

Why do we need it?
In Java, a class hierarchy allows us to reuse of code via inheritance.
* However, the purpose of a class hierarchy is not always to reuse code.
* Sometimes, its purpose is to model the various possibilities that exist in a domain,
* such as the kinds of Accounts supported by a financial application (as shown in above example).
* When the class hierarchy is used in this way, the intended model of restricting subclass can be achieved via sealed/permits keywords.
*/

public sealed class Account permits SavingAccount , CheckingAccount {
}
