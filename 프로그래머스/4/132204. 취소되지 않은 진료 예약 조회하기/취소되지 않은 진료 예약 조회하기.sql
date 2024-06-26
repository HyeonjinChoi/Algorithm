-- 코드를 입력하세요
SELECT APNT_NO, PT_NAME, a.PT_NO, a.MCDP_CD, DR_NAME, APNT_YMD
FROM PATIENT p JOIN  APPOINTMENT a ON p.PT_NO = a.PT_NO JOIN DOCTOR d ON MDDR_ID = DR_ID
WHERE DATE_FORMAT(APNT_YMD, '%Y-%m-%d') = '2022-04-13' AND APNT_CNCL_YN = 'N' AND a.MCDP_CD = 'CS'
ORDER BY APNT_YMD;