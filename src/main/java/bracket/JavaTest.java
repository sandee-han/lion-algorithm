package bracket;

public class JavaTest {

    public static void main(String[] args) {
        String result = "{\"request_cnt\":1,\"valid_cnt\":1,\"status_code\":\"OK\",\"data\":[{\"b_no\":\"2111132374\",\"valid\":\"01\",\"request_param\":{\"b_no\":\"2111132374\",\"start_dt\":\"20210323\",\"p_nm\":\"유한송이\",\"p_nm2\":\"\",\"b_nm\":\"\",\"corp_no\":\"\",\"b_type\":\"\",\"b_sector\":\"\"},\"status\":{\"b_no\":\"2111132374\",\"b_stt\":\"계속사업자\",\"b_stt_cd\":\"01\",\"tax_type\":\"부가가치세 일반과세자\",\"tax_type_cd\":\"01\",\"end_dt\":\"\",\"utcc_yn\":\"N\",\"tax_type_change_dt\":\"\",\"invoice_apply_dt\":\"\"}}]}\n";
        int indexOfValid = result.indexOf("\"valid\"");
        int indexOfBSttCd = result.indexOf("\"b_stt_cd\"");
        String validState = result.substring(indexOfValid + 9, 90);
        String BusinessState = result.substring(indexOfBSttCd + 12, indexOfBSttCd + 14);
        System.out.println(validState + " " + BusinessState);
    }
}
