package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * ログイン時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class LoginForm {

	/** メールアドレス */
	// @Email(message="メールアドレスの形式が無効です。")
	@NotBlank(message="メールアドレスを入力してください。")
	@Size(min=1, max=256, message="256文字以内で入力してください。")
	// @Pattern(regexp = "^[ -~]+$", message="全角文字は入力できません。半角文字で入力してください。")
	// @Pattern(regexp = "^[^\\s　]+$", message = "スペースを含めることはできません。")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message="パスワードを入力してください。")
	@Size(min=8, max=20, message="8文字以上20文字以内で入力してください。")
	// @Pattern(regexp = "^[ -~]+$", message="全角文字は入力できません。半角文字で入力してください。")
	// @Pattern(regexp = "^[^\\s　]+$", message = "スペースを含めることはできません。")
	// @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z]).+$", message="大文字、小文字をそれぞれ1文字以上含める必要があります。")
	private String password;

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [mailAddress=" + mailAddress + ", password=" + password + "]";
	}

}
