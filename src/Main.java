public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "192.168.1.108", ip2 = "192.168.0.154";
		int content1 = -1, content2 =-1, content3 = -1, content4 = -1;
		int dian1, dian2, dian3;
		dian1 = ip.indexOf(".", 0);
		dian2 = ip.indexOf(".", dian1 + 1);
		dian3 = ip.indexOf(".", dian2 + 1);
		// ip.indexOf(".", 3); �����ڴ��ַ����е�һ�γ���ָ���ַ�������������ָ����������ʼ������
		// ע�������Ǵ��㿪ʼ�ġ�
		System.out.println("���ǵ�һ��.��λ��" + (dian1 + 1));
		System.out.println("���ǵڶ���.��λ��" + (dian2 + 1));
		System.out.println("���ǵ�����.��λ��" + (dian3 + 1));
		// �ӵڿ�ʼ���������ڽ���������ȡ��ʼ������ǰһ�����Ӵ�;
		try {
			content1 = Integer.parseInt(ip.substring(0, dian1));
			content2 = Integer.parseInt(ip.substring(dian1 + 1, dian2));
			content3 = Integer.parseInt(ip.substring(dian2 + 1, dian3));
			content4 = Integer.parseInt(ip.substring(dian3 + 1, ip.length()));
		} catch (Exception e) {
			System.out.println("�������ip�����Ϲ淶");
			return;
		}

		if (panduan(content1, content2, content3, content4)) {
			System.out.println("ip����ͨ��");
		}
		else {
			System.out.println("�������ip��������������");
		}
		

	}

	private static boolean panduan(int content1, int content2, int content3,
			int content4) {
		if (content1 > 254 || content1 < 0 || content2 > 254 || content2 < 0
				|| content3 > 254 || content3 < 0 || content4 > 254
				|| content4 < 0) {
			return false;
		} else {
			return true;
		}

	}

}
