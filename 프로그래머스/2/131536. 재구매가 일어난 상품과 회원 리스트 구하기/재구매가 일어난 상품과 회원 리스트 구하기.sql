-- 코드를 입력하세요
SELECT
USER_ID, PRODUCT_ID 
FROM ONLINE_SALE
WHERE (USER_ID, PRODUCT_ID) IN 
(
    SELECT USER_ID, PRODUCT_ID
    FROM ONLINE_SALE
    GROUP BY USER_ID, PRODUCT_ID
    HAVING COUNT(PRODUCT_ID) > 1
)
GROUP BY USER_ID, PRODUCT_ID
ORDER BY 
USER_ID, PRODUCT_ID DESC;