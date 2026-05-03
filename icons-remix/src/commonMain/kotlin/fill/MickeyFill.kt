package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MickeyFill: ImageVector
    get() {
        if (_mickeyFill != null) return _mickeyFill!!
        _mickeyFill = remixIcon(
            name = "MickeyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.500 2.000 C 20.985 2.000 23.000 4.015 23.000 6.500 C 23.000 8.683 21.445 10.503 19.383 10.913 C 19.780 11.862 20.000 12.906 20.000 14.000 C 20.000 18.418 16.418 22.000 12.000 22.000 C 7.582 22.000 4.000 18.418 4.000 14.000 C 4.000 12.906 4.220 11.862 4.618 10.912 C 2.555 10.503 1.000 8.683 1.000 6.500 C 1.000 4.015 3.015 2.000 5.500 2.000 C 7.903 2.000 9.866 3.883 9.993 6.254 C 10.635 6.088 11.307 6.000 12.000 6.000 C 12.693 6.000 13.365 6.088 14.006 6.254 C 14.134 3.883 16.097 2.000 18.500 2.000 Z"),
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
        return _mickeyFill!!
    }

private var _mickeyFill: ImageVector? = null
