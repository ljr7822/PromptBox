package com.example.promptbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 消息框
    public void Message(View view) {
        AlertDialog.Builder builder  = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("确认" ) ;
        builder.setMessage("这是一个简单消息框" ) ;
        builder.setPositiveButton("是" , null );
        builder.show();
    }

    // 输入框
    public void Input(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("请输入");
        builder.setIcon(R.drawable.send);
        builder.setView(new EditText(MainActivity.this));
        builder.setPositiveButton("是" ,  null );
        builder.setNegativeButton("否", null);
        builder.show();
    }

    // 确认框
    public void Confirm(View view) {
        AlertDialog.Builder builder  = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("确认" ) ;
        builder.setMessage("是否确认？" ) ;
        builder.setPositiveButton("是",null );
        builder.setNegativeButton("否", null);
        builder.show();
    }

    // 单选框
    public void Radio(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("请选择");
        builder.setIcon(R.drawable.send);
        builder.setSingleChoiceItems(new String[]{"选项1", "选项2", "选项3", "选项4","选项5", "选项6", "选项7", "选项8"}, 0, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Cancel",null);
        builder.show();
    }

    // 列表框
    public void list(View view) {
        AlertDialog.Builder builder =  new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("提示框");
        builder.setItems(new String[]{"选项1", "选项2", "选项3", "选项4","选项5", "选项6", "选项7", "选项8"}, null);
        builder.setPositiveButton("确定", null);
        builder.setNegativeButton("取消",null);
        builder.show();
    }

    // 多选框
    public void MaxSelect(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("这是多选框");
        builder.setIcon(R.drawable.send);
        builder.setMultiChoiceItems(new String[]{"选项1", "选项2", "选项3", "选项4","选项5", "选项6", "选项7", "选项8"}, null, null);
        builder.setPositiveButton("sure",null);
        builder.setNegativeButton("cancel",null);
        builder.show();
    }
}
