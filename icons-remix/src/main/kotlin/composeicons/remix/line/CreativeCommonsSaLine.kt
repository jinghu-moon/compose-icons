package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CreativeCommonsSaLine: ImageVector
    get() {
        if (_creativeCommonsSaLine != null) return _creativeCommonsSaLine!!
        _creativeCommonsSaLine = remixIcon(
            name = "CreativeCommonsSaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 12C17 8.686 14.762 6 12 6 9.823 6 7.971 7.67 7.284 10.001L6 10l2.5 3L11 10l-1.599 0C9.92 8.805 10.889 8 12 8c1.657 0 3 1.791 3 4 0 2.209-1.343 4-3 4C10.89 16 9.921 15.196 9.402 14.001L7.285 14.001C7.971 16.331 9.823 18 12 18c2.762 0 5-2.686 5-6ZM12 2C9.24 2 6.739 3.121 4.93 4.93 3.121 6.739 2 9.24 2 12c0 2.76 1.121 5.261 2.93 7.07C6.739 20.879 9.24 22 12 22c2.76 0 5.261-1.121 7.07-2.93C20.879 17.261 22 14.76 22 12 22 9.24 20.879 6.739 19.07 4.93 17.261 3.121 14.76 2 12 2ZM6.344 6.344C7.794 4.895 9.792 4 12 4c2.208 0 4.206 .895 5.656 2.344C19.105 7.794 20 9.792 20 12c0 2.208-.895 4.206-2.344 5.656C16.206 19.105 14.208 20 12 20 9.792 20 7.794 19.105 6.344 17.656 4.895 16.206 4 14.208 4 12 4 9.792 4.895 7.794 6.344 6.344Z"),
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
        return _creativeCommonsSaLine!!
    }

private var _creativeCommonsSaLine: ImageVector? = null
