package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DeviceTabletCamera: ImageVector
    get() {
        if (_deviceTabletCamera != null) return _deviceTabletCamera!!
        _deviceTabletCamera = phosphorFillIcon(
            name = "DeviceTabletCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 24.000 L 64.000 24.000 C 50.745 24.000 40.000 34.745 40.000 48.000 L 40.000 208.000 C 40.000 221.255 50.745 232.000 64.000 232.000 L 192.000 232.000 C 205.255 232.000 216.000 221.255 216.000 208.000 L 216.000 48.000 C 216.000 34.745 205.255 24.000 192.000 24.000 ZM 128.000 80.000 C 121.373 80.000 116.000 74.627 116.000 68.000 C 116.000 61.373 121.373 56.000 128.000 56.000 C 134.627 56.000 140.000 61.373 140.000 68.000 C 140.000 74.627 134.627 80.000 128.000 80.000 Z"),
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
        return _deviceTabletCamera!!
    }

private var _deviceTabletCamera: ImageVector? = null
