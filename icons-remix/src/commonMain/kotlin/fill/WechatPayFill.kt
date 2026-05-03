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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.271 14.669 C 8.953 14.831 8.564 14.712 8.391 14.400 L 8.348 14.305 L 6.530 10.307 C 6.523 10.259 6.523 10.210 6.530 10.161 C 6.530 10.073 6.566 9.989 6.629 9.928 C 6.692 9.866 6.777 9.832 6.865 9.834 C 6.936 9.833 7.005 9.856 7.061 9.900 L 9.242 11.427 C 9.403 11.535 9.593 11.593 9.787 11.594 C 9.904 11.594 10.020 11.572 10.129 11.528 L 20.176 7.028 C 18.091 4.725 15.110 3.439 12.005 3.502 C 6.479 3.502 2.001 7.232 2.001 11.870 C 2.067 14.405 3.356 16.751 5.462 18.166 C 5.688 18.333 5.784 18.624 5.701 18.893 L 5.251 20.594 C 5.223 20.671 5.206 20.752 5.200 20.834 C 5.198 20.923 5.232 21.009 5.296 21.073 C 5.359 21.136 5.445 21.170 5.534 21.168 C 5.601 21.164 5.666 21.145 5.723 21.110 L 7.904 19.845 C 8.064 19.747 8.247 19.694 8.435 19.692 C 8.534 19.692 8.632 19.707 8.726 19.736 C 9.788 20.036 10.886 20.188 11.990 20.187 C 17.515 20.187 22.001 16.457 22.001 11.855 C 22.011 10.483 21.630 9.137 20.903 7.973 L 9.351 14.625 L 9.271 14.669 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _wechatPayFill!!
    }

private var _wechatPayFill: ImageVector? = null
