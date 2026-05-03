package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CoinsLine: ImageVector
    get() {
        if (_coinsLine != null) return _coinsLine!!
        _coinsLine = remixIcon(
            name = "CoinsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.005 2.003 C 18.423 2.003 22.005 5.585 22.005 10.003 C 22.005 13.247 20.073 16.041 17.297 17.296 C 16.042 20.072 13.249 22.003 10.005 22.003 C 5.587 22.003 2.005 18.421 2.005 14.003 C 2.005 10.759 3.936 7.966 6.711 6.710 C 7.967 3.934 10.760 2.003 14.005 2.003 ZM 10.005 8.003 C 6.691 8.003 4.005 10.689 4.005 14.003 C 4.005 17.316 6.691 20.003 10.005 20.003 C 13.319 20.003 16.005 17.316 16.005 14.003 C 16.005 10.689 13.319 8.003 10.005 8.003 ZM 11.005 9.003 L 11.005 10.003 L 13.005 10.003 L 13.005 12.003 L 9.005 12.003 C 8.729 12.003 8.505 12.227 8.505 12.503 C 8.505 12.748 8.682 12.952 8.915 12.995 L 9.005 13.003 L 11.005 13.003 C 12.386 13.003 13.505 14.122 13.505 15.503 C 13.505 16.883 12.386 18.003 11.005 18.003 L 11.005 19.003 L 9.005 19.003 L 9.005 18.003 L 7.005 18.003 L 7.005 16.003 L 11.005 16.003 C 11.281 16.003 11.505 15.779 11.505 15.503 C 11.505 15.257 11.328 15.053 11.095 15.011 L 11.005 15.003 L 9.005 15.003 C 7.624 15.003 6.505 13.884 6.505 12.503 C 6.505 11.122 7.624 10.003 9.005 10.003 L 9.005 9.003 L 11.005 9.003 ZM 14.005 4.003 C 12.221 4.003 10.620 4.781 9.521 6.016 C 9.681 6.008 9.843 6.003 10.005 6.003 C 14.423 6.003 18.005 9.585 18.005 14.003 C 18.005 14.165 18.000 14.327 17.990 14.487 C 19.226 13.389 20.005 11.787 20.005 10.003 C 20.005 6.689 17.319 4.003 14.005 4.003 Z"),
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
        return _coinsLine!!
    }

private var _coinsLine: ImageVector? = null
