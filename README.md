## Variables in Scala

Variables are simply storage locations. Every variable is known by its name and stores some known and unknown piece of
information known as value.

In Scala there are two types of variable:

- **Mutable Variables**: These variables are those variables which allow us to change a value after the declaration of a
  variable. Mutable variables are defined by using the "var" keyword.
- **Immutable Variables**: These variables are those variables which do not allow you to change a value after the
  declaration of a variable. Immutable variables are defined by using the "val" keyword.

Syntax:

```
var Variable_name: Data_type = "value";
val Variable_name: Data_type = "value";

// another way of defining variable
var Variable_name = value;
val Variable_name = "value"
```

Example:

```
// Mutable Variable
var name: String = "darvintutorial";

// Immutable Variable
val name: String = "darvintutorial";
```

**Variable Type Inference In Scala**: Scala supports variable type inference. In variable type inference values are
directly assigned to the variable without defining its data type, the Scala compiler automatically resolves which value
belongs to which data type.

For Example:

```
var name1 = 40;
val name2 = "darvintutorial";
```

**Rules for naming variable in Scala:**

- Variable name should be in lower case.
- Variable name can contain letter, digit and two special characters(Underscore(_) and Dollar($) sign)
- Variable name must not contain the keyword or reserved word.
- Starting letter of the variable name should be an alphabet.
- White space is not allowed in variable name.

### Scope of Variables In Scala

Variable declaration specifies the name of the variable that would be stored in the memory and memory can be accessed
further with this name of variable. There are three types of scope for Scala variable.

- **Fields**: We can access these kind of variables from every method in the object & from outside the object if we
  declared them with the right access modifiers.A field may be _mutable_ or _immutable_, they can define them using **'
  var'** or **'val'**.
- **Method Parameters**: We use these variables when we want to pass a value inside the method when we call it. They can
  be accessed inside the method and outside method if there is a reference to the object from outside the method. these
  variables are _alway mutable_ Using with **'val'** keyword.
- **Local Variables**: These type of variables are declared inside a method and are accessible within it only.Using **'
  var'** & **'val'** keywords, these variables can be both _mutable & immutable_.

### Technologies

- Java 17
- Sbt 1.10.17
- Scala 3.3.4
