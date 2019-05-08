package com.wengjianfeng.wdesignpatterns.builder;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.wengjianfeng.wdesignpatterns.R;

public class MemberInputDialog extends Dialog {

    private EditText mEtInput;
    private TextView mTvSure;
    public OnSureListener mSureListener;

    private MemberInputDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_member_code);
        setCanceledOnTouchOutside(true);
        setCancelable(true);

        mEtInput = findViewById(R.id.et_dialog_member_code);
        mTvSure = findViewById(R.id.tv_dialog_member_ensure);
        mTvSure.setOnClickListener(v -> {
            if (mSureListener != null){
                String inputString = mEtInput.getText().toString().trim();
                if (TextUtils.isEmpty(inputString)){
                    Toast.makeText(MemberInputDialog.this.getContext(),"请输入推荐码",Toast.LENGTH_SHORT).show();
                    return;
                }
                mSureListener.sure(inputString);
            }
        });
    }

    public interface OnSureListener{
        void sure(String memberCode);
    }

    public static class Builder{

        private MemberInputDialog mMemberInputDialog;

        public Builder(Context context){
            mMemberInputDialog = new MemberInputDialog(context);
        }

        public Builder setOnSureListener(OnSureListener sureListener){
            mMemberInputDialog.mSureListener = sureListener;
            return this;
        }

        public Builder show(){
            mMemberInputDialog.show();
            return this;
        }

        public Builder cancel(){
            mMemberInputDialog.cancel();
            return this;
        }
    }
}