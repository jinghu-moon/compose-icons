package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RemixFill: ImageVector
    get() {
        if (_remixFill != null) return _remixFill!!
        _remixFill = remixIcon(
            name = "RemixFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 4.418 3.582 8 8 8 .871 0 1.708-.141 2.493-.398C16.746 21.096 14.479 22 12 22 6.669 22 2.313 17.828 2.017 12.571 2.236 9.458 4.83 7 8 7c3.314 0 6 2.686 6 6 0 .552 .448 1 1 1 .552 0 1-.448 1-1C16 8.582 12.418 5 8 5 6.505 5 5.106 5.41 3.909 6.124 5.727 3.625 8.673 2 12 2Z"),
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
        return _remixFill!!
    }

private var _remixFill: ImageVector? = null
