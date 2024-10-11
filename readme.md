# 1.Multiple inheritance 

- One class extends to more than one class
- Imagine three classes A, B and C , C is inheriting the properties from A, B, and suppose there is a variable inside
  class A, named n = 10, and Another variable with the same name in class B, now when we will create an object using
  C class

  C object = new C();
  c.n // what value it will print, from A class or from B class, it arises ambiguity,

- This is why, Java does not support multiple inheritance

- Note : The question arises if this is not possible in java, then how the multiple inheritance can be implemented in java
  it can be implemented using interfaces

# 2. Hierarchical inheritance
- One class is inherited by many classes
  
  class A {}

  class B extends A {}

  class C extends A {}

  class D extends A {}

# 3. Hybrid inheritance 
- A combination of single and multiple inheritance, since we do not have multiple inheritance so also we do not have Hybrid inheritance

# 4. Polymorphism
- Polymorphism is a combination of two words Poly which means many and Morphism which means ways to represent, This means multiple forms of a single thing or many ways to represent.


