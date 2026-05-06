package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Robot3Line: ImageVector
    get() {
        if (_robot3Line != null) return _robot3Line!!
        _robot3Line = remixIcon(
            name = "Robot3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 1v1h-4C5.343 2 4 3.343 4 5v3c0 2.761 2.239 5 5 5h6c2.761 0 5-2.239 5-5v-3C20 3.343 18.657 2 17 2h-4v-1h-2ZM6 5C6 4.448 6.448 4 7 4h10c.552 0 1 .448 1 1v3c0 1.657-1.343 3-3 3h-6C7.343 11 6 9.657 6 8v-3ZM9.5 9C10.328 9 11 8.328 11 7.5 11 6.672 10.328 6 9.5 6 8.672 6 8 6.672 8 7.5 8 8.328 8.672 9 9.5 9ZM14.5 9C15.328 9 16 8.328 16 7.5 16 6.672 15.328 6 14.5 6 13.672 6 13 6.672 13 7.5 13 8.328 13.672 9 14.5 9ZM6 22c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6h2c0-4.418-3.582-8-8-8C7.582 14 4 17.582 4 22h2Z"),
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
        return _robot3Line!!
    }

private var _robot3Line: ImageVector? = null
