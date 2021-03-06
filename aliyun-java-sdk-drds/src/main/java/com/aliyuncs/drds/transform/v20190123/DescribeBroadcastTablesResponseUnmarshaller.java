/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeBroadcastTablesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeBroadcastTablesResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBroadcastTablesResponseUnmarshaller {

	public static DescribeBroadcastTablesResponse unmarshall(DescribeBroadcastTablesResponse describeBroadcastTablesResponse, UnmarshallerContext context) {
		
		describeBroadcastTablesResponse.setRequestId(context.stringValue("DescribeBroadcastTablesResponse.RequestId"));
		describeBroadcastTablesResponse.setSuccess(context.booleanValue("DescribeBroadcastTablesResponse.Success"));
		describeBroadcastTablesResponse.setIsShard(context.booleanValue("DescribeBroadcastTablesResponse.IsShard"));
		describeBroadcastTablesResponse.setPageNumber(context.integerValue("DescribeBroadcastTablesResponse.PageNumber"));
		describeBroadcastTablesResponse.setPageSize(context.integerValue("DescribeBroadcastTablesResponse.PageSize"));
		describeBroadcastTablesResponse.setTotal(context.integerValue("DescribeBroadcastTablesResponse.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < context.lengthValue("DescribeBroadcastTablesResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTable(context.stringValue("DescribeBroadcastTablesResponse.List["+ i +"].Table"));
			listItem.setBroadcastType(context.stringValue("DescribeBroadcastTablesResponse.List["+ i +"].BroadcastType"));
			listItem.setIsShard(context.booleanValue("DescribeBroadcastTablesResponse.List["+ i +"].IsShard"));
			listItem.setDbInstType(context.integerValue("DescribeBroadcastTablesResponse.List["+ i +"].DbInstType"));
			listItem.setBroadcast(context.booleanValue("DescribeBroadcastTablesResponse.List["+ i +"].Broadcast"));
			listItem.setStatus(context.integerValue("DescribeBroadcastTablesResponse.List["+ i +"].Status"));

			list.add(listItem);
		}
		describeBroadcastTablesResponse.setList(list);
	 
	 	return describeBroadcastTablesResponse;
	}
}