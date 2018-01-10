package cn.lb.wxr.platform.dto;

import java.util.List;

import org.wisteria.web.APIResult;
import org.wisteria.web.mvc.model.PageResult;


/**
 * 调用接口的执行结果类，适用于分页查询结果
 * @author Lei.Liu
 *
 * @param <T>	输出数据的类型
 */
public class APIPageResult<T> extends APIResult<T> {

	private static final long serialVersionUID = 1129030693928504220L;
	private long total;		// 总记录数
	
	public APIPageResult() {
		super();
	}
	
	public APIPageResult(boolean success, long total, T data) {
		super(success, null, null, data);
		this.total = total;
	}
	
	/**
	 * 创建成功的执行结果，并输出数据
	 * @param data	输出的数据
	 * @return		返回接口调用的执行结果类
	 */
	public static <T> APIPageResult<T> success(long total, T data) {
		return new APIPageResult<T>(true, total, data);
	}
	
	/**
	 * 创建成功的执行结果，并输出数据
	 * @param data	输出的数据
	 * @return		返回接口调用的执行结果类
	 */
	public static <T> APIPageResult<List<T>> success(PageResult<T> result) {
		APIPageResult<List<T>> apiResult = new APIPageResult<List<T>>();
		apiResult.setSuccess(true);
		apiResult.setCode("200");
		apiResult.setTotal(result.getTotal());
		apiResult.setData(result.getItems());
		return apiResult;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
}
