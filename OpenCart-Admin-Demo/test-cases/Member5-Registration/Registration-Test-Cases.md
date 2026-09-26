# Member 5 - Registration Test Cases

## TC_REGISTER_001 - New User Registration

**Objective:** Verify new user registration.

**Steps:**
1. Open OpenCart.
2. Open My Account.
3. Click Register.
4. Enter valid user information.
5. Click Continue.

**Expected Result:**
New account should be created successfully.

---

## TC_REGISTER_002 - Required Field Validation

**Objective:** Verify required field validation.

**Steps:**
1. Open registration page.
2. Leave required fields empty.
3. Click Continue.

**Expected Result:**
Validation messages should be displayed.

---

## TC_REGISTER_003 - Duplicate Registration

**Objective:** Verify registration with an existing email.

**Steps:**
1. Open registration page.
2. Enter an already registered email.
3. Enter other required information.
4. Click Continue.

**Expected Result:**
An appropriate error message should be displayed.