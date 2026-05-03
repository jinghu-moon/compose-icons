package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UmbrellaFill: ImageVector
    get() {
        if (_umbrellaFill != null) return _umbrellaFill!!
        _umbrellaFill = remixIcon(
            name = "UmbrellaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.998 2.049 C 18.051 2.551 21.998 6.815 21.998 12.000 L 21.998 13.000 L 12.998 13.000 L 12.998 19.000 C 12.998 20.105 13.894 21.000 14.998 21.000 C 16.103 21.000 16.998 20.105 16.998 19.000 L 16.998 18.000 L 18.998 18.000 L 18.998 19.000 C 18.998 21.209 17.207 23.000 14.998 23.000 C 12.789 23.000 10.998 21.209 10.998 19.000 L 10.998 13.000 L 1.998 13.000 L 1.998 12.000 C 1.998 6.815 5.945 2.551 10.998 2.049 L 10.998 2.000 C 10.998 1.448 11.446 1.000 11.998 1.000 C 12.550 1.000 12.998 1.448 12.998 2.000 L 12.998 2.049 Z"),
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
        return _umbrellaFill!!
    }

private var _umbrellaFill: ImageVector? = null
