package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WeiboLine: ImageVector
    get() {
        if (_weiboLine != null) return _weiboLine!!
        _weiboLine = remixIcon(
            name = "WeiboLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.194 14.197 C 20.194 17.559 15.666 20.621 10.269 20.621 C 5.319 20.621 1.001 18.188 1.001 14.534 C 1.001 12.587 2.181 10.447 4.240 8.446 C 7.073 5.700 10.469 4.413 12.099 5.998 C 12.597 6.480 12.823 7.120 12.818 7.856 C 14.793 7.280 16.469 7.452 17.301 8.608 C 17.750 9.231 17.833 9.987 17.627 10.815 C 19.138 11.426 20.194 12.585 20.194 14.197 ZM 15.755 12.128 C 15.369 11.717 15.355 11.208 15.557 10.717 C 15.766 10.209 15.770 9.905 15.678 9.776 C 15.413 9.409 14.144 9.414 12.483 10.088 C 12.431 10.111 12.361 10.137 12.276 10.162 C 12.179 10.192 12.079 10.215 11.974 10.229 C 11.630 10.274 11.303 10.229 10.991 9.963 C 10.572 9.604 10.517 9.108 10.669 8.647 C 10.884 7.977 10.848 7.571 10.706 7.432 C 10.520 7.251 9.929 7.241 9.047 7.575 C 7.978 7.980 6.749 8.799 5.633 9.881 C 3.926 11.540 3.001 13.218 3.001 14.534 C 3.001 16.775 6.277 18.621 10.269 18.621 C 14.689 18.621 18.194 16.251 18.194 14.197 C 18.194 13.459 17.558 12.858 16.522 12.545 C 16.128 12.432 15.986 12.374 15.755 12.128 ZM 22.809 10.510 C 22.670 11.045 22.125 11.366 21.590 11.227 C 21.056 11.088 20.735 10.542 20.873 10.008 C 20.958 9.682 21.001 9.344 21.001 9.000 C 21.001 6.791 19.210 5.000 17.001 5.000 C 16.722 5.000 16.448 5.028 16.181 5.084 C 15.640 5.197 15.110 4.849 14.998 4.309 C 14.885 3.768 15.232 3.239 15.773 3.126 C 16.174 3.042 16.585 3.000 17.001 3.000 C 20.315 3.000 23.001 5.686 23.001 9.000 C 23.001 9.514 22.936 10.020 22.809 10.510 Z"),
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
        return _weiboLine!!
    }

private var _weiboLine: ImageVector? = null
