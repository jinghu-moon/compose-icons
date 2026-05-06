package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CheckboxCircleLine: ImageVector
    get() {
        if (_checkboxCircleLine != null) return _checkboxCircleLine!!
        _checkboxCircleLine = remixIcon(
            name = "CheckboxCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 12C4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12ZM12 2C6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2ZM17.457 9.457 16.043 8.043 11 13.086 8.207 10.293 6.793 11.707 11 15.914 17.457 9.457Z"),
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
        return _checkboxCircleLine!!
    }

private var _checkboxCircleLine: ImageVector? = null
