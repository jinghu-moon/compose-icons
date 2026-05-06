package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ToggleLine: ImageVector
    get() {
        if (_toggleLine != null) return _toggleLine!!
        _toggleLine = remixIcon(
            name = "ToggleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 7C5.239 7 3 9.239 3 12c0 2.761 2.239 5 5 5h8c2.761 0 5-2.239 5-5C21 9.239 18.761 7 16 7h-8ZM8 5h8c3.866 0 7 3.134 7 7 0 3.866-3.134 7-7 7h-8C4.134 19 1 15.866 1 12 1 8.134 4.134 5 8 5ZM8 15C6.343 15 5 13.657 5 12 5 10.343 6.343 9 8 9c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3Z"),
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
        return _toggleLine!!
    }

private var _toggleLine: ImageVector? = null
