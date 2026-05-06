package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BlazeLine: ImageVector
    get() {
        if (_blazeLine != null) return _blazeLine!!
        _blazeLine = remixIcon(
            name = "BlazeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 9c.667 1.061 1 2.394 1 4 0 3-3.5 4-5 9-.667-.575-1-1.408-1-2.5C14 16.018 19 14.21 19 9ZM14.5 5c.667 1.238 1 2.572 1 4 0 5-6 6-4 13C9.833 20.839 9 19.173 9 17 9 13.675 14.5 11 14.5 5ZM10 1c.667 1.333 1 2.833 1 4.5C11 11.5 2 13 8 22 5.5 21.5 3.5 19 3.5 16 3.5 9.5 10 8.5 10 1Z"),
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
        return _blazeLine!!
    }

private var _blazeLine: ImageVector? = null
