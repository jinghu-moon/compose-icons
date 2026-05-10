package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GovernmentFill: ImageVector
    get() {
        if (_governmentFill != null) return _governmentFill!!
        _governmentFill = remixIcon(
            name = "GovernmentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 19v-11h-1v-2h3v-2C4 3.448 4.448 3 5 3h14c.552 0 1 .448 1 1v2h3v2h-1v11h1v2h-22v-2h1ZM13 19v-7h-2v7h2ZM8 19v-7h-2v7h2ZM18 19v-7h-2v7h2ZM6 5v1h12v-1h-12Z"),
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
        return _governmentFill!!
    }

private var _governmentFill: ImageVector? = null
