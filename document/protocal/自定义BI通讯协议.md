## 请求协议

```json
{
  "companyId": "jecn",
  "filters(全局筛选条件)": {},
  "dashboardFilters(面板过滤器)": {},
  "exportMode": true,
  "dimensionSearchMode(需要维度计算全集的模式)": true,
  "charts(监控中数据源不同；每个图表的过滤器是不一样的)": [
    {
      "id": "1",
      "projectId": "xpros",
      "analysisId": 10,
      "bookmarkMode": true,
      "filters(组件筛选条件)": {
        "relationship": "and",
        "data": [
          {
            "type(个性筛选器)": "attribute",
            "name": "合同类型",
            "valueList": [
              "标准合同",
              "非标准合同"
            ],
            "category(属性类别，防止同名)": "案例属性|事件属性|自定义属性",
            "unit": ""
          },
          {
            "type(个性筛选器)": "attribute",
            "name": "活动开始时间",
            "valueList(时间填写后端返回的值)": [
              "2022-9|2022-9-28",
              "2022-8|2022-9-27"
            ],
            "category(属性类别，防止同名)": "案例属性|事件属性|自定义属性",
            "unit": "月|天"
          }
        ]
      },
      "chartType": "bar(柱状图)|line(折线图)|histogram(直方图)|area(面积图)|scatter(散点图)|pie(饼图)|olap(OLAP)",
      "ignoreFilter": false,
      "containsNull": true,
      "dataLimit(数据限制)": 20,
      "limit(数据行数限制)": {
        "mode(模式为默认时可以不传limit结构体)": "default(默认)|compress(压缩)|extract(截取)",
        "num(compress时传表示最多几行数据)": 10,
        "start(extract时传表示从第几行开始)": 1,
        "end(extract时传表示从第几行结束)": 1
      },
      "distribution（直方图分布，如有有其他表有其他参数将定义其他的变量）": {
        "distributionType": "default|aequilate|fixed|custom",
        "num": 10,
        "sectionList(custom时配置)": [
          10,
          15,
          25,
          35,
          40,
          60
        ],
        "isShowMax(custom时配置, 在额外列展示下限)": false,
        "isShowMin(custom时配置, 在额外列展示上限)": false,
        "timeType": "无|年|季度|月|周|天"
      },
      "bookmark(书签)": [
        {
          "key(前端名称)": "书签名称1",
          "title(书签名称)": "书签名称",
          "type": "share|personal",
          "reverse(非模式)": false
        }
      ],
      "partition(分区)": {
        "type": "dimension",
        "config": {
          "key": "状态",
          "title": "状态",
          "category(case:案件属性| event: 事件属性|custom: 自定义属性)": "案例属性|事件属性|自定义属性",
          "valueType": "text",
          "unit": "无"
        }
      },
      "dimension(书签模式此处为空即可)": [
        {
          "key": "产品名称",
          "title": "产品名称",
          "category(case:案件属性| event: 事件属性|custom: 自定义属性)": "案例属性|事件属性|自定义属性",
          "valueType": "text|number|time|period",
          "unit": "无"
        },
        {
          "key": "事件开始时间",
          "title": "事件开始时间",
          "category": "案例属性",
          "valueType": "time",
          "unit": "月"
        },
        {
          "key": "状态",
          "title": "状态",
          "category(case:案件属性| event: 事件属性|custom: 自定义属性)": "案例属性|事件属性|自定义属性",
          "valueType": "text",
          "unit": "无"
        }
      ],
      "quota": [
        {
          "id": 1,
          "key": "总和（利润）",
          "title": "利润",
          "category(original: 内置指标|case:案件属性| event: 事件属性|custom: 自定义属性)": "案例属性|事件属性|自定义属性",
          "valueType": "number",
          "unit": "年|季度|月|周|天",
          "aggregate": "计数",
          "positionLine(位置线)": [
            {
              "id": 1,
              "type": "median(中位线)|average(平均线)|custom(自定义，一般无需请求)"
            },
            {
              "id": 2,
              "type": "median"
            }
          ],
          "children(指标对比)": [
            {
              "id": 1,
              "type": "chain(环比)|relative(同比)|custom(自定义)",
              "result": "value(增长值)|ratio(增长率)",
              "column": "案例开始时间",
              "unit(olap且为同比传单位)": "年|季度|月|周",
              "targetTimeStart(单指标时需传、被比较的开始时间戳)": "1682060119912",
              "targetTimeEnd(单指标时需传、被比较的结束时间戳)": "1682060119912",
              "compareTimeStart(单指标时需传、比较的开始时间戳)": "1682060119912",
              "compareTimeEnd(单指标时需传、比较的结束时间戳)": "1682060119912"
            }
          ],
          "percentage(百分比设置，配置时传)": {
            "type": "number(数值)|quota(全局指标聚合)",
            "value(数值时传)": 123,
            "quota(指标时传，指标结构)": {
              "id": 1,
              "key": "总和（利润）",
              "title": "利润",
              "category(original: 内置指标|case:案件属性| event: 事件属性|custom: 自定义属性)": "案例属性|事件属性|自定义属性",
              "valueType": "number",
              "unit": "年|季度|月|周|天"
            }
          }
        },
        {
          "key": "gd8fRY",
          "category": "内置指标",
          "title": "案例占比",
          "valueType": "number",
          "id": "gd8fRY",
          "scale": 2,
          "type": "basic",
          "aggregate": "全局占比|过滤占比",
          "chartType": "line"
        }
      ],
      "extraQuota(需要额外返回的指标)": [
        {
          "key": "gd8fRY",
          "category": "内置指标",
          "title": "案例占比",
          "valueType": "number",
          "id": "gd8fRY",
          "scale": 2,
          "type": "basic",
          "aggregate": "全局占比|过滤占比",
          "noDimension(false: 全局计算结果 true: 维度计算结果)": true
        }
      ],
      "sort": [
        {
          "id": "dimension_name",
          "title": "columName1",
          "category": "案例属性",
          "type": "dimension",
          "valueType": "number",
          "mode": "ascend|descend"
        },
        {
          "id": "bookmark(书签排序时固定值)",
          "title": "共享书签",
          "category": "共享书签",
          "type": "bookmark",
          "valueType": "text",
          "mode": "ascend|descend|(共享书签没有自定义模式)"
        },
        {
          "id": "quota_id_1",
          "title": "columName2",
          "category": "案例属性",
          "type": "dimension",
          "valueType": "number",
          "mode": "ascend|descend"
        },
        {
          "id": "quota_id_2",
          "title": "columName3",
          "category": "案例属性",
          "type": "quota",
          "valueType": "number",
          "mode": "ascend|descend"
        },
        {
          "id": "dimension_name",
          "title": "columName3",
          "category": "案例属性",
          "type": "quota",
          "valueType": "number",
          "mode": "custom（仅维度列可设置，且只能设置一个）",
          "top": [
            "a",
            "b",
            "c"
          ],
          "bottom": [
            "a",
            "b",
            "c"
          ]
        },
        {
          "id": "partition_name",
          "title": "columName3(分区名称)",
          "category": "案例属性",
          "type": "partition(分区场景)",
          "valueType": "number",
          "mode": "custom（仅维度列可设置，且只能设置一个）",
          "top": [
            "a",
            "b",
            "c"
          ],
          "bottom": [
            "a",
            "b",
            "c"
          ]
        }
      ],
      "searches(两层结构，一层或，二层且)": [
        [
          {
            "id": "quota_id_1(指标为id|维度为维度名称)",
            "type(不传为维度)": "quota|partition(分区场景)|dimension",
            "valueType": "number",
            "condition": {
              "method(比较方法)": "belong(属于)|notBelong(不属于)|isNull(是否为空)|equal(等于)|notEqual(不等于)|include(包含)|notInclude(不包含)|startWith(开始是)|notStartWith(开始不是)|endWith(结尾是)|lessThan(小于)|lessOrEqual(小于等于)|greaterThan(大于)|greaterOrEqual(大于)",
              "value(单值)": "选择的值（后端返回值）",
              "values(多值)": [
                "选择的值列表（后端返回值）"
              ]
            }
          }
        ]
      ]
    }
  ]
}
```

## 返回结果

```json
[
  {
    "id": "ID8Raw",
    "dimensionUnit": {
      "活动名称": ""
    },
    "dimensionNames": [
      "活动名称"
    ],
    "quotaUnit": {
      "kNFtwE": ""
    },
    "data": [
      {
        "活动名称": "上诉受理",
        "kNFtwE": 590.7161433854408,
        "kNFtwF(全局的指标)": 590.7161433854408,
        "kNFtwG(额外的指标)": 590.7161433854408
      }
    ],
    "search": {
      "案例周期（3000）": [1, 3, 4],
      "活动名称": ["2", "3", "6"]
    }
  }
]
```

