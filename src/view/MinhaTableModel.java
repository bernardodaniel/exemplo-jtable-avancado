package view;

import javax.swing.table.AbstractTableModel;

public class MinhaTableModel 
	extends AbstractTableModel {

	private String[][] linhas = {
			{"Daniel", "Bernardo", "44 9999-0000"}
	};
	
	@Override
	public String getColumnName(int column) {
		if (column == 0)
			return "Nome";
		
		if (column == 1)
			return "Sobrenome";
		
		if (column == 2)
			return "Telefone";

		return null;
	}
	
	@Override
	public int getRowCount() {
		return linhas.length;
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return linhas[rowIndex][columnIndex];
	}

}
