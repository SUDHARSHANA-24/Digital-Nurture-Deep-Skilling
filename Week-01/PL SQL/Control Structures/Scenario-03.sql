-- Print reminders for loans
-- due within the next 30 days.

BEGIN
    FOR loan_rec IN (
        SELECT
            C.CustomerID,
            C.Name,
            L.LoanID,
            L.EndDate
        FROM Customers C
        JOIN Loans L
        ON C.CustomerID = L.CustomerID
        WHERE L.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear '
            || loan_rec.Name
            || ', your Loan ID '
            || loan_rec.LoanID
            || ' is due on '
            || TO_CHAR(loan_rec.EndDate,'DD-MON-YYYY')
        );
    END LOOP;
END;
/