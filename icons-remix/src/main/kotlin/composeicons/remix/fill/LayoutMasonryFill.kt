package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LayoutMasonryFill: ImageVector
    get() {
        if (_layoutMasonryFill != null) return _layoutMasonryFill!!
        _layoutMasonryFill = remixIcon(
            name = "LayoutMasonryFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 9.999v10.001c0 .552-.448 1-1 1h-8v-11.001h9ZM11 15.999v5.001h-8C2.448 21 2 20.552 2 20v-4.001h9ZM11 3v10.999h-9v-9.999C2 3.448 2.448 3 3 3h8ZM21 3c.552 0 1 .448 1 1v3.999h-9v-4.999h8Z"),
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
        return _layoutMasonryFill!!
    }

private var _layoutMasonryFill: ImageVector? = null
