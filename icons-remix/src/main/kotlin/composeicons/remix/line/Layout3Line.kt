package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Layout3Line: ImageVector
    get() {
        if (_layout3Line != null) return _layout3Line!!
        _layout3Line = remixIcon(
            name = "Layout3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 21C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16ZM8 10h-3v9h3v-9ZM19 10h-9v9h9v-9ZM19 5h-14v3h14v-3Z"),
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
        return _layout3Line!!
    }

private var _layout3Line: ImageVector? = null
