package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ParenthesesFill: ImageVector
    get() {
        if (_parenthesesFill != null) return _parenthesesFill!!
        _parenthesesFill = remixIcon(
            name = "ParenthesesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.923 21C5.113 18.664 4 15.493 4 12 4 8.507 5.113 5.336 6.923 3h2.014C7.235 5.388 6.2 8.542 6.2 12c0 3.458 1.035 6.612 2.737 9h-2.014ZM17.074 21h-2.014c1.702-2.388 2.737-5.542 2.737-9 0-3.458-1.035-6.612-2.737-9h2.014c1.81 2.336 2.923 5.507 2.923 9 0 3.493-1.113 6.664-2.923 9Z"),
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
        return _parenthesesFill!!
    }

private var _parenthesesFill: ImageVector? = null
