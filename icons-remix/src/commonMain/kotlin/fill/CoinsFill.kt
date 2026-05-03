package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CoinsFill: ImageVector
    get() {
        if (_coinsFill != null) return _coinsFill!!
        _coinsFill = remixIcon(
            name = "CoinsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.005 2.003 C 18.423 2.003 22.005 5.585 22.005 10.003 C 22.005 13.247 20.073 16.041 17.297 17.296 C 16.042 20.072 13.249 22.003 10.005 22.003 C 5.587 22.003 2.005 18.421 2.005 14.003 C 2.005 10.759 3.936 7.966 6.711 6.710 C 7.967 3.934 10.760 2.003 14.005 2.003 ZM 11.005 9.003 L 9.005 9.003 L 9.005 10.003 C 7.624 10.003 6.505 11.122 6.505 12.503 C 6.505 13.828 7.536 14.913 8.841 14.998 L 9.005 15.003 L 11.005 15.003 L 11.095 15.011 C 11.328 15.053 11.505 15.257 11.505 15.503 C 11.505 15.748 11.328 15.952 11.095 15.995 L 11.005 16.003 L 7.005 16.003 L 7.005 18.003 L 9.005 18.003 L 9.005 19.003 L 11.005 19.003 L 11.005 18.003 C 12.386 18.003 13.505 16.883 13.505 15.503 C 13.505 14.177 12.473 13.093 11.169 13.008 L 11.005 13.003 L 9.005 13.003 L 8.915 12.995 C 8.682 12.952 8.505 12.748 8.505 12.503 C 8.505 12.257 8.682 12.053 8.915 12.011 L 9.005 12.003 L 13.005 12.003 L 13.005 10.003 L 11.005 10.003 L 11.005 9.003 ZM 14.005 4.003 C 12.221 4.003 10.620 4.781 9.521 6.016 C 9.681 6.008 9.843 6.003 10.005 6.003 C 14.423 6.003 18.005 9.585 18.005 14.003 C 18.005 14.165 18.000 14.327 17.990 14.487 C 19.226 13.389 20.005 11.787 20.005 10.003 C 20.005 6.689 17.319 4.003 14.005 4.003 Z"),
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
        return _coinsFill!!
    }

private var _coinsFill: ImageVector? = null
