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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 15.314 19.314 18.000 16.000 18.000 C 12.686 18.000 10.000 15.314 10.000 12.000 C 10.000 11.448 9.552 11.000 9.000 11.000 C 8.448 11.000 8.000 11.448 8.000 12.000 C 8.000 16.418 11.582 20.000 16.000 20.000 C 16.871 20.000 17.708 19.859 18.493 19.602 C 16.746 21.096 14.479 22.000 12.000 22.000 C 6.669 22.000 2.313 17.828 2.017 12.571 C 2.236 9.458 4.830 7.000 8.000 7.000 C 11.314 7.000 14.000 9.686 14.000 13.000 C 14.000 13.552 14.448 14.000 15.000 14.000 C 15.552 14.000 16.000 13.552 16.000 13.000 C 16.000 8.582 12.418 5.000 8.000 5.000 C 6.505 5.000 5.106 5.410 3.909 6.124 C 5.727 3.625 8.673 2.000 12.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _remixFill!!
    }

private var _remixFill: ImageVector? = null
