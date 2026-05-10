package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlignItemLeftFill: ImageVector
    get() {
        if (_alignItemLeftFill != null) return _alignItemLeftFill!!
        _alignItemLeftFill = remixIcon(
            name = "AlignItemLeftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 21v-18h2v18h-2ZM7 14c0-.552 .448-1 1-1h8c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-8C7.448 20 7 19.552 7 19v-5ZM8 4C7.448 4 7 4.448 7 5v5c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-5C21 4.448 20.552 4 20 4h-12Z"),
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
        return _alignItemLeftFill!!
    }

private var _alignItemLeftFill: ImageVector? = null
