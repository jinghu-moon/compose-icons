package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Wechat2Fill: ImageVector
    get() {
        if (_wechat2Fill != null) return _wechat2Fill!!
        _wechat2Fill = remixIcon(
            name = "Wechat2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.458 18.185 C 3.359 16.677 2.001 14.400 2.001 11.908 C 2.001 7.323 6.476 3.600 12.001 3.600 C 17.526 3.600 22.001 7.323 22.001 11.908 C 22.001 16.492 17.526 20.215 12.001 20.215 C 10.859 20.215 9.748 20.062 8.729 19.754 C 8.637 19.723 8.513 19.723 8.421 19.723 C 8.236 19.723 8.050 19.785 7.896 19.877 L 5.705 21.139 C 5.643 21.169 5.581 21.200 5.519 21.200 C 5.334 21.200 5.180 21.046 5.180 20.862 C 5.180 20.769 5.211 20.708 5.242 20.615 C 5.273 20.585 5.550 19.569 5.705 18.954 C 5.705 18.892 5.736 18.800 5.736 18.739 C 5.736 18.492 5.643 18.308 5.458 18.185 ZM 8.668 10.512 C 9.385 10.512 9.953 9.943 9.953 9.226 C 9.953 8.508 9.385 7.940 8.668 7.940 C 7.950 7.940 7.383 8.508 7.383 9.226 C 7.383 9.943 7.950 10.512 8.668 10.512 ZM 15.334 10.512 C 16.052 10.512 16.619 9.943 16.619 9.226 C 16.619 8.508 16.052 7.940 15.334 7.940 C 14.617 7.940 14.049 8.508 14.049 9.226 C 14.049 9.943 14.617 10.512 15.334 10.512 Z"),
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
        return _wechat2Fill!!
    }

private var _wechat2Fill: ImageVector? = null
