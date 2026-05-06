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
                pathData = parseSvgPathData("M11.27 12.216 15 6l8 15h-21L9 8l2.27 4.216ZM12.39 14.238 14.987 19h4.679L14.898 10.058l-2.508 4.18ZM5.348 19h7.303L9 12.219 5.348 19ZM5.5 8C4.119 8 3 6.881 3 5.5 3 4.119 4.119 3 5.5 3 6.881 3 8 4.119 8 5.5 8 6.881 6.881 8 5.5 8Z"),
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
