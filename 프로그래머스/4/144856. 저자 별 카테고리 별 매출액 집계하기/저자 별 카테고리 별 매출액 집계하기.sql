-- 코드를 입력하세요
SELECT b.AUTHOR_ID, AUTHOR_NAME, CATEGORY, SUM(PRICE * SALES) AS TOTAL_SALES
FROM BOOK b JOIN BOOK_SALES s ON b.BOOK_ID = s.BOOK_ID JOIN AUTHOR a ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE SALES_DATE LIKE '2022-01%'
GROUP BY AUTHOR_NAME, CATEGORY
ORDER BY b.AUTHOR_ID, CATEGORY DESC;