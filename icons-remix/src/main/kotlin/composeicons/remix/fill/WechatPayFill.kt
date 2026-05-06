package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WechatPayFill: ImageVector
    get() {
        if (_wechatPayFill != null) return _wechatPayFill!!
        _wechatPayFill = remixIcon(
            name = "WechatPayFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.271 14.669c-.318 .162-.707 .043-.88-.269l-.044-.095L6.53 10.307c-.008-.048-.008-.097 0-.145-0-.088 .035-.172 .098-.234 .063-.062 .148-.095 .236-.093 .071-.002 .14 .021 .196 .065l2.181 1.527c.161 .108 .351 .166 .545 .167 .117 .001 .233-.021 .342-.065L20.176 7.028C18.091 4.725 15.11 3.439 12.005 3.502 6.479 3.502 2.001 7.232 2.001 11.87c.066 2.535 1.355 4.881 3.461 6.296 .226 .167 .323 .458 .24 .727l-.451 1.701c-.027 .077-.044 .158-.051 .24-.002 .089 .033 .175 .096 .239 .063 .063 .149 .098 .239 .096 .067-.004 .132-.024 .189-.058L7.904 19.845c.16-.098 .343-.151 .531-.153 .099-0 .197 .015 .291 .044 1.062 .3 2.161 .452 3.264 .451 5.525 0 10.011-3.729 10.011-8.331 .01-1.372-.371-2.719-1.098-3.882L9.351 14.625l-.08 .044Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _wechatPayFill!!
    }

private var _wechatPayFill: ImageVector? = null
