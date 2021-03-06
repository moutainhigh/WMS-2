package wms.business.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Service;

import wms.business.service.WarningSendTaskOutTimeService;
import its.base.service.BaseServiceImpl;

import com.plat.common.page.PageData;
import com.plat.common.utils.Function;
import com.wms.business.WarningSendTaskOutTime;

@Service("WarningSendTaskOutTimeService")
public class WarningSendTaskOutTimeServiceImpl extends
		BaseServiceImpl<WarningSendTaskOutTime> implements
		WarningSendTaskOutTimeService {
	@SuppressWarnings("unchecked")
	@Override
	public PageData<Map<String, Object>> queryWarningSendTaskOutTime(int page,
			int rows, String listsql, String countsql, List<Serializable> params) {
		return (PageData<Map<String, Object>>) getPageListBySql(listsql,
				countsql, new Function<SQLQuery>() {

					@Override
					public void run(SQLQuery t) {
						t.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
					}
				}, page, rows, params.toArray(new Serializable[params.size()]));
	}

}
