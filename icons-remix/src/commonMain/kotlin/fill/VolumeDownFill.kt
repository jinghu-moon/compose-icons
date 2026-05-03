package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VolumeDownFill: ImageVector
    get() {
        if (_volumeDownFill != null) return _volumeDownFill!!
        _volumeDownFill = remixIcon(
            name = "VolumeDownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.889 16.000 L 5.000 16.000 C 4.448 16.000 4.000 15.552 4.000 15.000 L 4.000 9.000 C 4.000 8.448 4.448 8.000 5.000 8.000 L 8.889 8.000 L 14.183 3.668 C 14.397 3.493 14.712 3.525 14.887 3.739 C 14.960 3.828 15.000 3.940 15.000 4.055 L 15.000 19.945 C 15.000 20.221 14.776 20.445 14.500 20.445 C 14.385 20.445 14.273 20.405 14.183 20.332 L 8.889 16.000 ZM 18.863 16.591 L 17.441 15.169 C 18.389 14.438 19.000 13.290 19.000 12.000 C 19.000 10.570 18.249 9.315 17.120 8.608 L 18.559 7.169 C 20.040 8.262 21.000 10.019 21.000 12.000 C 21.000 13.842 20.170 15.491 18.863 16.591 Z"),
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
        return _volumeDownFill!!
    }

private var _volumeDownFill: ImageVector? = null
