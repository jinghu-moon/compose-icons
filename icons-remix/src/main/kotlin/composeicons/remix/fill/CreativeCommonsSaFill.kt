package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CreativeCommonsSaFill: ImageVector
    get() {
        if (_creativeCommonsSaFill != null) return _creativeCommonsSaFill!!
        _creativeCommonsSaFill = remixIcon(
            name = "CreativeCommonsSaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.52 0 10 4.48 10 10 0 5.52-4.48 10-10 10C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2ZM12 6C9.823 6 7.971 7.67 7.284 10.001L6 10l2.5 3L11 10l-1.599 0C9.92 8.805 10.889 8 12 8c1.657 0 3 1.791 3 4 0 2.209-1.343 4-3 4C10.89 16 9.921 15.196 9.402 14.001L7.285 14.001C7.971 16.331 9.823 18 12 18c2.761 0 5-2.686 5-6C17 8.686 14.761 6 12 6Z"),
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
        return _creativeCommonsSaFill!!
    }

private var _creativeCommonsSaFill: ImageVector? = null
