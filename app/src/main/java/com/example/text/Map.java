package com.example.text;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends AppCompatActivity implements OnMapReadyCallback { //콜백을 구현

    //구글맵을 사용하기위해  SDK에서 구글맵 서비스를 설치 후
// build.gradle dependencies 에 implementation 'com.google.android.gms:play-services-maps:17.0.0' 추가
// 구글클라우드 서비스에서 API 키를 발급하고 API를 Mainfest에 넣어줘야된다
// xml 구글맵은 Fragment로 표현된다. fragment를 구성하는 클래스는 "com.google.android.gms.maps.SupportMapFragment" 로 지도가표현됨
    private GoogleMap googleMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);//mapFragement에서 지도 객체얻어오기 지도객체는 콜백으로 받아야됨



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {   //특정위치로 옮기기위해 특정위치에 대한 객체를 만들어야됨 구글 객체를 만듬
        this.googleMap = googleMap;


        LatLng latLng = new LatLng(35.14490547505814, 126.92317514808757);//위도경도를 기반으로한 클래스 LatLng 래티튜드 롱디티듀 광주동구치매안심센터
        LatLng latLng4 = new LatLng(35.15056363068398, 126.8603002822029);//광주서구치매안심센터
        LatLng latLng3 = new LatLng(35.09657826286123, 126.89669249135811);//광주시립제2요양병원
        LatLng latLng2 = new LatLng(35.101223069629626, 126.89600586671169);//광주시 치매예방관리센터
        LatLng latLng1 = new LatLng(35.18827180529724, 126.86626440995836);//광주광역시 북구 치매안심센터
        LatLng latLngShow = new LatLng(35.14490547505814, 126.92317514808757);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLngShow));//구글맵이 보이는 위치지정
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(11));//지도를 확대 줌레벨이 11
        MarkerOptions markerOptions = new MarkerOptions().position(latLng).title("광주동구치매센터");
        MarkerOptions markerOptions1 = new MarkerOptions().position(latLng1).title("광주북구치매안심센터");
        MarkerOptions markerOptions2 = new MarkerOptions().position(latLng2).title("광주시 치매예방관리센터");
        MarkerOptions markerOptions3 = new MarkerOptions().position(latLng3).title("광주시립제2요양병원");
        MarkerOptions markerOptions4 = new MarkerOptions().position(latLng4).title("광주서구치매안심센터");//마크의 위치와 제목지정
        googleMap.addMarker(markerOptions);//구글맵에 마크 표시
        googleMap.addMarker(markerOptions1);
        googleMap.addMarker(markerOptions2);
        googleMap.addMarker(markerOptions3);
        googleMap.addMarker(markerOptions4);
    }
}

