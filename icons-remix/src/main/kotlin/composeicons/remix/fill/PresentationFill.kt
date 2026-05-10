package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PresentationFill: ImageVector
    get() {
        if (_presentationFill != null) return _presentationFill!!
        _presentationFill = remixIcon(
            name = "PresentationFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 4C8 5.105 7.105 6 6 6 4.895 6 4 5.105 4 4 4 2.895 4.895 2 6 2c1.105 0 2 .895 2 2ZM5 16v6h-2v-12C3 8.343 4.343 7 6 7c.821 0 1.564 .329 2.106 .863l2.374 2.242L12.793 7.793l1.414 1.414-3.687 3.687L9 11.459v10.541h-2v-6h-2ZM10 5h9v9h-9v2h4.365l2.823 6h2.21L16.576 16h3.424c.552 0 1-.448 1-1v-11C21 3.448 20.552 3 20 3h-10v2Z"),
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
        return _presentationFill!!
    }

private var _presentationFill: ImageVector? = null
