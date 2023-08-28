const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "汽车品牌",
                    "menuJump": "列表",
                    "tableName": "qichepinpai"
                }], "menu": "汽车品牌管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除", "查看评论"],
                    "menu": "汽车信息",
                    "menuJump": "列表",
                    "tableName": "qichexinxi"
                }], "menu": "汽车信息管理"
            }, {
                "child": [{"buttons": ["查看", "修改", "回复", "删除"], "menu": "留言板管理", "tableName": "messages"}],
                "menu": "留言板管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "删除", "修改"],
                    "menu": "汽车资讯",
                    "tableName": "news"
                }, {"buttons": ["新增", "查看", "修改", "删除"], "menu": "轮播图管理", "tableName": "config"}], "menu": "系统管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "已取消订单", "tableName": "orders/已取消"}, {
                    "buttons": ["查看"],
                    "menu": "已支付订单",
                    "tableName": "orders/已支付"
                }, {"buttons": ["查看"], "menu": "已退款订单", "tableName": "orders/已退款"}, {
                    "buttons": ["查看"],
                    "menu": "已完成订单",
                    "tableName": "orders/已完成"
                }, {"buttons": ["查看"], "menu": "已发货订单", "tableName": "orders/已发货"}, {
                    "buttons": ["查看", "删除"],
                    "menu": "未支付订单",
                    "tableName": "orders/未支付"
                }], "menu": "订单管理"
            }],
            "frontMenu": [{
                "child": [{
                    "buttons": ["查看", "查看评论", "支付"],
                    "menu": "汽车信息列表",
                    "menuJump": "列表",
                    "tableName": "qichexinxi"
                }], "menu": "汽车信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        },
            {
            "backMenu": [{
                "child": [{
                    "buttons": ["参数", "支付", "查看评论", "查看"],
                    "menu": "汽车信息",
                    "menuJump": "列表",
                    "tableName": "qichexinxi"
                }], "menu": "汽车信息管理"
            }, {
                "child": [{"buttons": ["新增", "查看", "修改", "删除"], "menu": "我的收藏管理", "tableName": "storeup"}],
                "menu": "我的收藏管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "轮播图管理", "tableName": "config"}, {
                    "buttons": ["查看"],
                    "menu": "汽车资讯",
                    "tableName": "news"
                }], "menu": "系统管理"
            }],

            "frontMenu": [{
                "child": [{
                    "buttons": ["查看", "查看评论", "支付"],
                    "menu": "汽车信息列表",
                    "menuJump": "列表",
                    "tableName": "qichexinxi"
                }], "menu": "汽车信息模块"
            }],
            "hasBackLogin": "否",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "用户信息",
            "tableName": "yonghuxinxi"
        }]
    }
}
export default menu;
