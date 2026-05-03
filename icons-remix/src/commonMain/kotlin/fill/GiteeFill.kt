package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GiteeFill: ImageVector
    get() {
        if (_giteeFill != null) return _giteeFill!!
        _giteeFill = remixIcon(
            name = "GiteeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 10.148 6.444 C 8.103 6.444 6.444 8.103 6.444 10.148 L 6.444 17.062 C 6.444 17.334 6.666 17.556 6.938 17.556 L 14.223 17.556 C 16.063 17.555 17.555 16.063 17.556 14.223 L 17.556 11.383 C 17.556 11.110 17.334 10.889 17.062 10.889 L 11.383 10.889 C 11.110 10.889 10.889 11.110 10.889 11.383 L 10.889 12.617 C 10.889 12.890 11.109 13.111 11.382 13.111 L 14.840 13.111 C 15.112 13.112 15.333 13.332 15.333 13.604 L 15.333 13.852 C 15.333 14.670 14.670 15.333 13.852 15.333 L 9.160 15.333 C 8.888 15.333 8.666 15.112 8.666 14.840 L 8.666 10.148 C 8.666 9.330 9.329 8.667 10.148 8.667 L 17.060 8.667 C 17.333 8.667 17.554 8.445 17.555 8.173 L 17.555 6.938 C 17.555 6.666 17.334 6.445 17.062 6.444 L 10.148 6.444 Z"),
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
        return _giteeFill!!
    }

private var _giteeFill: ImageVector? = null
