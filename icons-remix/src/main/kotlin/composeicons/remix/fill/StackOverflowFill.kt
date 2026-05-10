package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StackOverflowFill: ImageVector
    get() {
        if (_stackOverflowFill != null) return _stackOverflowFill!!
        _stackOverflowFill = remixIcon(
            name = "StackOverflowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.001 20.003v-5.333h2v7.333h-16v-7.333h2v5.333h12ZM7.6 14.736l.313-1.979 8.837 1.699-.113 1.586L7.6 14.736ZM8.799 10.204 9.532 8.605l7.997 3.732-.733 1.599L8.799 10.204ZM11.065 6.272 12.198 4.939l6.798 5.665-1.133 1.333L11.065 6.272ZM15.397 2.14l5.265 7.064-1.4 1.066L13.998 3.206 15.397 2.14ZM7.333 18.668v-1.999h9.33v1.999h-9.33Z"),
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
        return _stackOverflowFill!!
    }

private var _stackOverflowFill: ImageVector? = null
