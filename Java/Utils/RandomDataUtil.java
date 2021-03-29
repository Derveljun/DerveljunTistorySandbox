import java.util.Random;

public class RandomDataUtil {
	
	private final static Random random = new Random();
	
	public final static String ALL_KOREAN_LAST_NAME = "���̹����������������ѿ����ű�Ȳ�ȼ۷���ȫ����չ���������������ϰ������ֿ챸�������ä��õ������Ժ������ߵ��Ҽ��������濬��ǥ���ݿձݿ����θ�����Ź��������뿹�����ΰ����¸������ǵΰ����󵿿�ȣ�����ؽ°���ð��ܰߴ�ȭâ";
	public final static String ALL_KOREAN_NAMABLE_KOR = "�����������������������Űǰɰ˰̰԰ݰ߰����������������������������������������ñǱȱ˱ͱԱձֱرٱ۱ݱޱ����賣���������������������������������������ɴϴдҴٴܴ޴�����������������εеѵ������������������"
            +"�������·÷ķŷƷɷʷηϷзշڷ�������������������������������������ŸƸ͸���������������������̹ιйڹݹ߹�����������������������������κϺкҺغ���������������������������������ҼӼռּۼ������������������½�"
            +"�ĽŽǽɽʽ־��ƾǾȾ˾ϾоӾ־׾޾߾����������������������������������¿ÿ˿ͿϿпտֿܿ������������������������������������������������������������������������������������������������������������������������������¡����"
            +"������âäåóôõö÷øûü������������������������������ġĢģĥħĨĪ��ŸŹźŻŽž����������������������Ưƴ������������������������ǥǰǳ����������������������������������������������������ȣȤȥȦȫȭȮȯȰȲȸȹȾȿ��������������������������������������";
	public final static String ALPABET_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public final static String ALPABET_LOWER = "abcdefghijklmnopqrstuvwxyz";
	public final static String ALPABET = ALPABET_UPPER + ALPABET_LOWER;
	public final static String NUMRIC = "0123456789";
	public final static String ALPABET_NUMRIC = ALPABET + NUMRIC;
	
	/**
	 * �����ڵ� �� ���� �ѱ� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomKoreanUnicode(int size) throws Exception {
		
		if (size < 1) {
			throw new Exception();  
		}
		
		char[] rtn = new char[size];
		for(int i = 0; i < size; i++) {
			rtn[i] = (char) ((Math.random() * 11172) + 0xAC00);
		}
		
		return String.valueOf(rtn);
		
	}
	
	/**
	 * �θ������ �� �����ѱ��� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomKoreanFirstName(int size) throws Exception {
		return randomChoice(ALL_KOREAN_NAMABLE_KOR, size);
	}
	
	/**
	 * ���� ���� ��� �� ������ �� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomKoreanLastName(int size) throws Exception { 
		return randomChoice(ALL_KOREAN_LAST_NAME, size);
	}
	
	/**
	 * ������ ���� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomNumber(int size) throws Exception {
		return randomChoice(NUMRIC, size);
	}
	
	/**
	 * ������ �빮�� ���ĺ� �������� 
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomUpperAlpabet(int size) throws Exception {
		return randomChoice(ALPABET_UPPER, size);
	}
	
	/**
	 * ������ �ҹ��� ���ĺ� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomLowerAlpabet(int size) throws Exception {
		return randomChoice(ALPABET_LOWER, size);
	}
	
	/**
	 * ������ ��ҹ��� ���ĺ� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomAlpabet(int size) throws Exception {
		return randomChoice(ALPABET, size);
	}
	
	/**
	 * ������ ��ҹ��� ���ĺ��� ���� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomAlpaNumric(int size) throws Exception {
		return randomChoice(ALPABET_NUMRIC, size);
	}

	/**
	 * ������ CI������ �� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomCi() throws Exception {
		final String CI_ABLE_CHARS = ALPABET_NUMRIC + "^_=+\\/";
		return randomChoice(CI_ABLE_CHARS, 88);
	}
	
	/**
	 * ������ �޴��� �� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomCellPhone() throws Exception {
		return "010" + randomNumber(8);
	}
	
	/**
	 * ������ �̸��� �� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomEmail() throws Exception {
		return randomChoice(ALPABET_NUMRIC, 10) + "@test.com";
	}
	
	/**
	 * ���� �ε��� ������ ������ �� ��������
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public static String randomChoice(String strIdxs, int size) throws Exception {
		
		if (size < 1) {
			throw new Exception();  
		}
		
		StringBuilder rtnStr = new StringBuilder(); 
		
		int i=0;
		while(i++ < size) {
			int random_idx = random.nextInt(strIdxs.length());
			rtnStr.append(strIdxs.substring(random_idx, random_idx+1));
		}
		
		return rtnStr.toString();
	}
		
	public static void main(String[] args) throws Exception {
		System.out.println(randomKoreanFirstName(2));
		System.out.println(randomKoreanLastName(2));
		System.out.println(randomNumber(10));
		System.out.println(randomKoreanUnicode(4));
		System.out.println(randomCellPhone());
		System.out.println(randomCi());
		System.out.println(randomEmail());
	}

}
