SELECT O.product_name, C.name
FROM ORDERS O
         INNER JOIN CUSTOMERS C
                    ON O.customer_id = C.id
WHERE C.name LIKE :name;