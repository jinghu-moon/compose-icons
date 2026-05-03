package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RefreshFill: ImageVector
    get() {
        if (_refreshFill != null) return _refreshFill!!
        _refreshFill = remixIcon(
            name = "RefreshFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 16.820 17.076 C 18.163 15.801 19.000 13.998 19.000 12.000 C 19.000 8.134 15.866 5.000 12.000 5.000 C 10.939 5.000 9.933 5.236 9.032 5.658 L 10.007 7.413 C 10.618 7.147 11.292 7.000 12.000 7.000 C 14.761 7.000 17.000 9.239 17.000 12.000 L 14.000 12.000 L 16.820 17.076 ZM 14.968 18.342 L 13.993 16.587 C 13.382 16.853 12.708 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 L 10.000 12.000 L 7.180 6.924 C 5.837 8.199 5.000 10.002 5.000 12.000 C 5.000 15.866 8.134 19.000 12.000 19.000 C 13.061 19.000 14.067 18.764 14.968 18.342 Z"),
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
        return _refreshFill!!
    }

private var _refreshFill: ImageVector? = null
