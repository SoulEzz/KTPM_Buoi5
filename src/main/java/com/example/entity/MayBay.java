package com.example.entity;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class MayBay {
	
	private String MaMB;
	private String Loai;
	private int TamBay;
	
	public MayBay() {
		// TODO Auto-generated constructor stub
	}

	public MayBay(String maMB, String loai, int tamBay) {
		super();
		MaMB = maMB;
		Loai = loai;
		TamBay = tamBay;
	}

	public MayBay(String maMB) {
		super();
		MaMB = maMB;
	}

	public String getMaMB() {
		return MaMB;
	}

	public void setMaMB(String maMB) {
		MaMB = maMB;
	}

	public String getLoai() {
		return Loai;
	}

	public void setLoai(String loai) {
		Loai = loai;
	}

	public int getTamBay() {
		return TamBay;
	}

	public void setTamBay(int tamBay) {
		TamBay = tamBay;
	}

	@Override
	public String toString() {
		return "MayBay [MaMB=" + MaMB + ", Loai=" + Loai + ", TamBay=" + TamBay + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Loai, MaMB, TamBay);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MayBay other = (MayBay) obj;
		return Objects.equals(Loai, other.Loai) && Objects.equals(MaMB, other.MaMB) && TamBay == other.TamBay;
	}
	
	
	
}
