package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiscussLine: ImageVector
    get() {
        if (_discussLine != null) return _discussLine!!
        _discussLine = remixIcon(
            name = "DiscussLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 22.500 L 11.200 19.000 L 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 L 5.000 7.103 C 5.000 6.550 5.448 6.103 6.000 6.103 L 22.000 6.103 C 22.552 6.103 23.000 6.550 23.000 7.103 L 23.000 18.000 C 23.000 18.552 22.552 19.000 22.000 19.000 L 16.800 19.000 L 14.000 22.500 ZM 15.839 17.000 L 21.000 17.000 L 21.000 8.103 L 7.000 8.103 L 7.000 17.000 L 11.200 17.000 L 12.161 17.000 L 14.000 19.298 L 15.839 17.000 ZM 2.000 2.000 L 19.000 2.000 L 19.000 4.000 L 3.000 4.000 L 3.000 15.000 L 1.000 15.000 L 1.000 3.000 C 1.000 2.448 1.448 2.000 2.000 2.000 Z"),
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
        return _discussLine!!
    }

private var _discussLine: ImageVector? = null
