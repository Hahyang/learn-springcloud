package com.yg.learn.common.core.basic;

import com.yg.learn.common.core.constants.HttpStatusConstants;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回值的结果
 */
@Data
@AllArgsConstructor
public class ResponseResult<T> {

	/** 状态码, 200: 代表成功, 其他值代表失败, -999: 代表未知错误 */
	@ApiModelProperty(value = "状态码")
	private Integer status;

	/** 返回消息说明, sucess: 代表成功, fail: 代表失败 **/
	@ApiModelProperty(value = "返回消息说明")
	private String msg;
	/**
	 * 返回对象
	 */
	@ApiModelProperty(value = "返回对象")
	private T result;

	public ResponseResult() {
		super();
	}

	public ResponseResult(T result) {
		super();
		this.status = HttpStatusConstants.HTTP_RES_CODE_200;
		this.result = result;
	}

	public ResponseResult(T result, String msg) {
		super();
		this.result = result;
		this.msg = msg;
	}

	public ResponseResult(Throwable e) {
		super();
		this.msg = e.getMessage();
		this.status = HttpStatusConstants.HTTP_RES_CODE_500;
	}

	public boolean hasBody() {
		return this.result != null;
	}

}
