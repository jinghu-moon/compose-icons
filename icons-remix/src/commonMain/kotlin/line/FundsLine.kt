package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FundsLine: ImageVector
    get() {
        if (_fundsLine != null) return _fundsLine!!
        _fundsLine = remixIcon(
            name = "FundsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.411 14.526 L 7.812 11.124 L 10.641 13.953 L 13.798 10.796 L 12.005 9.003 L 17.005 9.003 L 17.005 14.003 L 15.212 12.210 L 10.641 16.781 L 7.812 13.953 L 5.338 16.427 C 6.772 18.582 9.222 20.003 12.005 20.003 C 16.423 20.003 20.005 16.421 20.005 12.003 C 20.005 7.585 16.423 4.003 12.005 4.003 C 7.587 4.003 4.005 7.585 4.005 12.003 C 4.005 12.884 4.147 13.733 4.411 14.526 ZM 2.873 16.084 L 2.863 16.074 L 2.867 16.070 C 2.313 14.827 2.005 13.451 2.005 12.003 C 2.005 6.480 6.482 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 17.526 17.528 22.003 12.005 22.003 C 7.936 22.003 4.434 19.572 2.873 16.084 Z"),
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
        return _fundsLine!!
    }

private var _fundsLine: ImageVector? = null
