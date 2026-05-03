package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VolumeUpLine: ImageVector
    get() {
        if (_volumeUpLine != null) return _volumeUpLine!!
        _volumeUpLine = remixIcon(
            name = "VolumeUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.603 10.000 L 10.000 7.221 L 10.000 16.780 L 6.603 14.000 L 3.000 14.000 L 3.000 10.000 L 6.603 10.000 ZM 2.000 16.000 L 5.889 16.000 L 11.183 20.332 C 11.273 20.405 11.385 20.445 11.500 20.445 C 11.776 20.445 12.000 20.221 12.000 19.945 L 12.000 4.055 C 12.000 3.940 11.960 3.828 11.887 3.739 C 11.712 3.525 11.397 3.493 11.183 3.668 L 5.889 8.000 L 2.000 8.000 C 1.448 8.000 1.000 8.448 1.000 9.000 L 1.000 15.000 C 1.000 15.552 1.448 16.000 2.000 16.000 ZM 23.000 12.000 C 23.000 15.292 21.554 18.246 19.262 20.262 L 17.844 18.844 C 19.776 17.194 21.000 14.740 21.000 12.000 C 21.000 9.260 19.776 6.806 17.844 5.156 L 19.262 3.738 C 21.554 5.754 23.000 8.708 23.000 12.000 ZM 18.000 12.000 C 18.000 10.088 17.106 8.385 15.713 7.287 L 14.284 8.716 C 15.321 9.439 16.000 10.640 16.000 12.000 C 16.000 13.360 15.321 14.561 14.284 15.284 L 15.713 16.713 C 17.106 15.615 18.000 13.912 18.000 12.000 Z"),
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
        return _volumeUpLine!!
    }

private var _volumeUpLine: ImageVector? = null
