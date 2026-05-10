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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 7C13.571 7 10.645 9.158 9.507 12.19l1.873 .702C12.234 10.618 14.428 9 17 9c.698 0 1.369 .119 1.992 .339C21.326 10.16 23 12.385 23 15c0 3.314-2.686 6-6 6h-10C3.686 21 1 18.314 1 15 1 12.385 2.673 10.16 5.008 9.339 5.003 9.226 5 9.114 5 9 5 5.134 8.134 2 12 2c3.242 0 5.969 2.204 6.765 5.195C18.197 7.068 17.607 7 17 7Z"),
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
        return _cloudFill!!
    }

private var _cloudFill: ImageVector? = null
