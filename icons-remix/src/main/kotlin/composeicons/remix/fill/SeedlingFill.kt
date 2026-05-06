package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SeedlingFill: ImageVector
    get() {
        if (_seedlingFill != null) return _seedlingFill!!
        _seedlingFill = remixIcon(
            name = "SeedlingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.998 7v2.5c0 3.59-2.91 6.5-6.5 6.5h-2.5v5h-2v-7l.019-.999C11.272 9.644 14.076 7 17.498 7h4.5ZM5.998 3c3.092 0 5.716 2.005 6.643 4.786-1.499 1.275-2.489 3.128-2.626 5.214L8.998 13C5.132 13 1.998 9.866 1.998 6v-3h4Z"),
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
        return _seedlingFill!!
    }

private var _seedlingFill: ImageVector? = null
