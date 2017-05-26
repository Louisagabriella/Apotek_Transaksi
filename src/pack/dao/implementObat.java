/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.dao;
import java.util.List;
import pack.model.m_obat;
/**
 *
 * @author Louisa
 */
public interface implementObat {
    public void TampilData(m_obat a);
    public void UbahData(m_obat a);
    public void SimpanData(m_obat a);
    public void HapusData(String kode);
    public List<m_obat> getCariKategori(String kategori);
    public List<m_obat> getAll();
    public String user = "";
}
