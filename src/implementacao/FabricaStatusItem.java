package implementacao;

import java.util.HashMap;
import java.util.Map;

public class FabricaStatusItem {
	
	private static FabricaStatusItem instance = new FabricaStatusItem();

	private Map<String, StatusItem> mapa;

	private FabricaStatusItem() {
		mapa = new HashMap<>();
		mapa.put("CARRINHO", StatusItem.criar("CARRINHO", true, false));
		mapa.put("FECHADO", StatusItem.criar("FECHADO", true, false));
		mapa.put("PAGO", StatusItem.criar("PAGO", true, true));
		mapa.put("ENVIADO", StatusItem.criar("ENVIADO", false, true));
		mapa.put("ENTREGUE", StatusItem.criar("ENTREGUE", false, true));
	}
	
	public static FabricaStatusItem getInstance() {
		return instance;
	}

	public StatusItem get(String nome) {
		if (!mapa.containsKey(nome))
			throw new RuntimeException("Status inexistente:" + nome);
		return mapa.get(nome);
	}
}