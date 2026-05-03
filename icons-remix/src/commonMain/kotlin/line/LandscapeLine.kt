package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LandscapeLine: ImageVector
    get() {
        if (_landscapeLine != null) return _landscapeLine!!
        _landscapeLine = remixIcon(
            name = "LandscapeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.270 12.216 L 15.000 6.000 L 23.000 21.000 L 2.000 21.000 L 9.000 8.000 L 11.270 12.216 ZM 12.390 14.238 L 14.987 19.000 L 19.667 19.000 L 14.898 10.058 L 12.390 14.238 ZM 5.348 19.000 L 12.652 19.000 L 9.000 12.219 L 5.348 19.000 ZM 5.500 8.000 C 4.119 8.000 3.000 6.881 3.000 5.500 C 3.000 4.119 4.119 3.000 5.500 3.000 C 6.881 3.000 8.000 4.119 8.000 5.500 C 8.000 6.881 6.881 8.000 5.500 8.000 Z"),
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
        return _landscapeLine!!
    }

private var _landscapeLine: ImageVector? = null
