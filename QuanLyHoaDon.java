/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoadon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QM
 */
class QuanLyHoaDon {
    private List<HoaDon> danhSachHoaDon;

    public QuanLyHoaDon() {
        danhSachHoaDon = new ArrayList<>();
    }

    public void themHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }

    public void xuatDanhSachHoaDon() {
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.xuatThongTin();
        }
    }

    public int demSoLuongKhachHangVietNam() {
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangVietNam) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienKhachHangNuocNgoai() {
        double tongThanhTien = 0;
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                tongThanhTien += hoaDon.tinhThanhTien();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return tongThanhTien / count;
    }

    public void xuatHoaDonThang9Nam2013() {
        System.out.println("Hoa đon trong thang 05 năm 2023:");
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.ngayRaHoaDon.contains("05/2023")) {
                hoaDon.xuatThongTin();
            }
        }
    }

 public static void main(String[] args) {
        QuanLyHoaDon qlhd = new QuanLyHoaDon();

        KhachHangVietNam khachHang1 = new KhachHangVietNam("KH001","Nguyen Quang Minh", "20/05/2023", "sinh hoat",
                100, 5000, 50);
        KhachHangVietNam khachHang2 = new KhachHangVietNam("KH002", "Bui Đuc Trong", "21/05/2023", "kinh doanh",
                150, 6000, 80);
        KhachHangNuocNgoai khachHang3 = new KhachHangNuocNgoai("KH003", "Mount", "22/05/2023", "USA",
                200, 7000);

        qlhd.themHoaDon(khachHang1);
        qlhd.themHoaDon(khachHang2);
        qlhd.themHoaDon(khachHang3);

        qlhd.xuatDanhSachHoaDon();

        int soLuongKhachHangVietNam = qlhd.demSoLuongKhachHangVietNam();
        System.out.println("Tong so luong khach hang Viet Nam: " + soLuongKhachHangVietNam);

        double trungBinhThanhTienKhachHangNuocNgoai = qlhd.tinhTrungBinhThanhTienKhachHangNuocNgoai();
        System.out.println("Trung binh thanh tien khach hang nuoc ngoai: " + trungBinhThanhTienKhachHangNuocNgoai);

        qlhd.xuatHoaDonThang9Nam2013();
    }
}
