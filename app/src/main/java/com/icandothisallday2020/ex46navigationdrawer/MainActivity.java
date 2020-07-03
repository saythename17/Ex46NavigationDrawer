package com.icandothisallday2020.ex46navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView nv;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nv=findViewById(R.id.nv);
        drawerLayout=findViewById(R.id.layout_drawer);
        //item 에 아이콘 색조 적용해제(default :gray tint)   //nv.setItemIconTintList(null);
        //네비뷰의 메뉴항목을 클릭했을 때 반응
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id=  menuItem.getItemId();
                switch (id){
                    case R.id.menu_gallery:
                        Toast.makeText(MainActivity.this, "Gallery", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_send:
                        Toast.makeText(MainActivity.this, "Send", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.address:
                        Toast.makeText(MainActivity.this, "Address", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.number:
                        Toast.makeText(MainActivity.this, "Number", Toast.LENGTH_SHORT).show();
                        break;
                }
                //Drawer 닫기
                drawerLayout.closeDrawer(nv);       return false; }        });
    }//onCreate...
    public void clickHeaderIcon(View v){
        Toast.makeText(this, "Header Icon", Toast.LENGTH_SHORT).show();
    }
}
