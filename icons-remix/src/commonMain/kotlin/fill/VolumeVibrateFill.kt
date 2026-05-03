package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VolumeVibrateFill: ImageVector
    get() {
        if (_volumeVibrateFill != null) return _volumeVibrateFill!!
        _volumeVibrateFill = remixIcon(
            name = "VolumeVibrateFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.389 3.161 L 20.803 4.575 L 18.328 7.050 L 20.803 9.525 L 18.328 11.999 L 20.803 14.475 L 18.328 16.950 L 20.803 19.425 L 19.389 20.839 L 15.500 16.950 L 17.975 14.475 L 15.500 12.000 L 17.975 9.525 L 15.500 7.050 L 19.389 3.161 ZM 12.887 3.738 C 12.960 3.828 13.000 3.940 13.000 4.055 L 13.000 19.945 C 13.000 20.221 12.776 20.445 12.500 20.445 C 12.385 20.445 12.273 20.405 12.183 20.332 L 6.889 15.999 L 3.000 16.000 C 2.448 16.000 2.000 15.552 2.000 15.000 L 2.000 9.000 C 2.000 8.448 2.448 8.000 3.000 8.000 L 6.889 7.999 L 12.183 3.668 C 12.397 3.493 12.712 3.525 12.887 3.738 Z"),
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
        return _volumeVibrateFill!!
    }

private var _volumeVibrateFill: ImageVector? = null
