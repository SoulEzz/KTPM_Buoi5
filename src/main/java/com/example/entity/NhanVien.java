package com.example.entity;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class NhanVien {
	
	private String MaNV;
	private String Ten;
	private int Luong;
	
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String maNV) {
		super();
		MaNV = maNV;
	}

	public NhanVien(String maNV, String ten, int luong) {
		super();
		MaNV = maNV;
		Ten = ten;
		Luong = luong;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public int getLuong() {
		return Luong;
	}

	public void setLuong(int luong) {
		Luong = luong;
	}

	@Override
	public String toString() {
		return "NhanVien [MaNV=" + MaNV + ", Ten=" + Ten + ", Luong=" + Luong + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Luong, MaNV, Ten);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Luong == other.Luong && Objects.equals(MaNV, other.MaNV) && Objects.equals(Ten, other.Ten);
	}
	
	
	
	
}
