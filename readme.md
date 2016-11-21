### Problem Set

You have been provided the [legacy code](https://github.com/gSchool/xp_problem_set_srp) for `Item` and `RestaurantBill` in an untested codebase that was shown as the example of a SRP violation.

In pairs, make `RestaurantBill` not violate SRP. Use TDD to drive the support and refactoring of this legacy code.

### Tasks

Working in a TDD fashion, and keeping the SRP in mind, work through the list and make the following things easily changable:

- Tax rate.
- Tip rate.
- The way that an itemized receipt is formatted.
- The way that a total is computed with tax and tip (perhaps tip becomes post-tax, or tax is applied after tip).
- Item is either a misnomer or has shared responsibility. Some people hold pretty extreme views on this subject. Nonetheless, does an Item need to know about a quantity? Or is that a different entity?
- The RestaurantBill takes care of printing itself out to the standard out stream. What if the output target changed and became a file?

### Testing

Since we are working with legacy code with no tests, the first test should simply assert that the existing output does not change during our refactoring. Then, as units are reactored out, unit tests can be written.