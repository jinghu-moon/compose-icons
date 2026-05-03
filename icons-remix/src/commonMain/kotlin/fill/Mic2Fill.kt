package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Mic2Fill: ImageVector
    get() {
        if (_mic2Fill != null) return _mic2Fill!!
        _mic2Fill = remixIcon(
            name = "Mic2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 C 14.762 1.000 17.000 3.239 17.000 6.000 L 17.000 12.000 C 17.000 14.761 14.762 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 L 7.000 6.000 C 7.000 3.239 9.239 1.000 12.000 1.000 ZM 2.192 13.962 L 4.154 13.569 C 4.883 17.236 8.119 20.000 12.000 20.000 C 15.881 20.000 19.117 17.236 19.846 13.569 L 21.808 13.962 C 20.896 18.545 16.852 22.000 12.000 22.000 C 7.149 22.000 3.104 18.545 2.192 13.962 Z"),
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
        return _mic2Fill!!
    }

private var _mic2Fill: ImageVector? = null
