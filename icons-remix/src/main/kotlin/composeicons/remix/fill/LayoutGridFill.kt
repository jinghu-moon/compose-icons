package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LayoutGridFill: ImageVector
    get() {
        if (_layoutGridFill != null) return _layoutGridFill!!
        _layoutGridFill = remixIcon(
            name = "LayoutGridFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12.999v7.001c0 .552-.448 1-1 1h-8v-8.001h9ZM11 12.999v8.001h-8C2.448 21 2 20.552 2 20v-7.001h9ZM11 3v7.999h-9v-6.999C2 3.448 2.448 3 3 3h8ZM21 3c.552 0 1 .448 1 1v6.999h-9v-7.999h8Z"),
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
        return _layoutGridFill!!
    }

private var _layoutGridFill: ImageVector? = null
