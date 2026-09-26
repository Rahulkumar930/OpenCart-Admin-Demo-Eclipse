# Member 1 - Login Test Cases

## TC_LOGIN_001 - Valid Login

**Objective:** Verify that a registered user can login successfully.

**Steps:**
1. Open OpenCart.
2. Open My Account.
3. Click Login.
4. Enter valid email.
5. Enter valid password.
6. Click Login.

**Expected Result:**
User should login successfully.

---

## TC_LOGIN_002 - Invalid Login

**Objective:** Verify login with invalid credentials.

**Steps:**
1. Open Login page.
2. Enter invalid email.
3. Enter invalid password.
4. Click Login.

**Expected Result:**
An appropriate error message should be displayed.

---

## TC_LOGIN_003 - Logout

**Objective:** Verify that the user can logout.

**Steps:**
1. Login successfully.
2. Open My Account.
3. Click Logout.

**Expected Result:**
User should be logged out successfully.