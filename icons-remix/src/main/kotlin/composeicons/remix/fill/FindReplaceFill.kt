package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FindReplaceFill: ImageVector
    get() {
        if (_findReplaceFill != null) return _findReplaceFill!!
        _findReplaceFill = remixIcon(
            name = "FindReplaceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.031 16.617l4.283 4.283-1.414 1.414L16.617 18.031C15.077 19.263 13.124 20 11 20 6.032 20 2 15.968 2 11 2 6.032 6.032 2 11 2c4.968 0 9 4.032 9 9 0 2.124-.737 4.077-1.969 5.617ZM16.659 9C15.836 6.669 13.614 5 11 5 7.685 5 5 7.685 5 11h2C7 8.792 8.792 7 11 7c.691 0 1.342 .176 1.909 .485L12 9h4.659ZM17 11h-2c0 2.208-1.792 4-4 4-.691 0-1.342-.176-1.909-.485L10 13h-2.464-2.195c.823 2.331 3.045 4 5.659 4 3.315 0 6-2.685 6-6Z"),
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
        return _findReplaceFill!!
    }

private var _findReplaceFill: ImageVector? = null
