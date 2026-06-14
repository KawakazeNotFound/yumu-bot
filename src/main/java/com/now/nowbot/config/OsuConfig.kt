package com.now.nowbot.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Primary
import org.springframework.validation.annotation.Validated

@Primary @Validated @ConfigurationProperties(prefix = "yumu.osu", ignoreInvalidFields = true)
class OsuConfig {
    /**
     * 接口路径, 一般不用改
     */
    var url: String = "https://osu.ppy.sh/api/v2/"

    /** osu! 网站、OAuth 和 .osu 文件的基础地址。 */
    var webUrl: String = "https://osu.ppy.sh/"

    /** 谱面封面、用户背景、队伍素材等静态资源的基础地址。 */
    var assetsUrl: String = "https://assets.ppy.sh/"

    /** 玩家头像的基础地址。 */
    var avatarUrl: String = "https://a.ppy.sh/"

    /** 谱面试听音频的基础地址。 */
    var previewUrl: String = "https://b.ppy.sh/preview/"

    /** 谱面上架时间辅助 API。 */
    var mapRankTimesUrl: String = "https://mapranktimes.vercel.app/api/"

    /** Eliteronix duel rating API。 */
    var duelRatingUrl: String = "https://www.eliteronix.de/elitebotix/api/"

    /** QQ 到 osu! 账号的第三方绑定查询 API。 */
    var bindingApiUrl: String = "https://api.bleatingsheep.org/api/"

    /**
     * 回调链接, 需要与 osu oauth 应用的callback url 完全一致
     * 默认不需要配置, 自动构造 publicDomain+callBackUrl
     * 也可以自行配置, 强制覆盖
     */
    var callbackUrl: String = ""

    /**
     * 回调的api端口
     */
    var callbackPath: String = "/bind"

    var id: Int = 0

    var token: String = "*"
}
