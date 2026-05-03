package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlbumFill: ImageVector
    get() {
        if (_albumFill != null) return _albumFill!!
        _albumFill = remixIcon(
            name = "AlbumFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.520 2.000 22.000 6.480 22.000 12.000 C 22.000 17.520 17.520 22.000 12.000 22.000 C 6.480 22.000 2.000 17.520 2.000 12.000 C 2.000 6.480 6.480 2.000 12.000 2.000 ZM 12.000 16.000 C 14.213 16.000 16.000 14.213 16.000 12.000 C 16.000 9.787 14.213 8.000 12.000 8.000 C 9.787 8.000 8.000 9.787 8.000 12.000 C 8.000 14.213 9.787 16.000 12.000 16.000 ZM 12.000 11.000 C 12.550 11.000 13.000 11.450 13.000 12.000 C 13.000 12.550 12.550 13.000 12.000 13.000 C 11.450 13.000 11.000 12.550 11.000 12.000 C 11.000 11.450 11.450 11.000 12.000 11.000 Z"),
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
        return _albumFill!!
    }

private var _albumFill: ImageVector? = null
