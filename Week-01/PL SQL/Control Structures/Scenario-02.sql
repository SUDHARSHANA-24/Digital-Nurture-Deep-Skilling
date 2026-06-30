-- Set VIP status for customers having balance greater than 10000.

BEGIN
    FOR cust IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer '
                || cust.CustomerID
                || ' promoted to VIP.'
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/