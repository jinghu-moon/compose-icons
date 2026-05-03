package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CloudFill: ImageVector
    get() {
        if (_cloudFill != null) return _cloudFill!!
        _cloudFill = remixIcon(
            name = "CloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 7.000 C 13.571 7.000 10.645 9.158 9.507 12.190 L 11.380 12.893 C 12.234 10.618 14.428 9.000 17.000 9.000 C 17.698 9.000 18.369 9.119 18.992 9.339 C 21.326 10.160 23.000 12.385 23.000 15.000 C 23.000 18.314 20.314 21.000 17.000 21.000 L 7.000 21.000 C 3.686 21.000 1.000 18.314 1.000 15.000 C 1.000 12.385 2.673 10.160 5.008 9.339 C 5.003 9.226 5.000 9.114 5.000 9.000 C 5.000 5.134 8.134 2.000 12.000 2.000 C 15.242 2.000 17.969 4.204 18.765 7.195 C 18.197 7.068 17.607 7.000 17.000 7.000 Z"),
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
        return _cloudFill!!
    }

private var _cloudFill: ImageVector? = null
