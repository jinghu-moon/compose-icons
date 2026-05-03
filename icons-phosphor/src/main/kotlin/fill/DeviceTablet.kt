package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) return _deviceTablet!!
        _deviceTablet = phosphorFillIcon(
            name = "DeviceTablet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 24.000 L 64.000 24.000 C 50.745 24.000 40.000 34.745 40.000 48.000 L 40.000 208.000 C 40.000 221.255 50.745 232.000 64.000 232.000 L 192.000 232.000 C 205.255 232.000 216.000 221.255 216.000 208.000 L 216.000 48.000 C 216.000 34.745 205.255 24.000 192.000 24.000 ZM 64.000 40.000 L 192.000 40.000 C 196.418 40.000 200.000 43.582 200.000 48.000 L 200.000 56.000 L 56.000 56.000 L 56.000 48.000 C 56.000 43.582 59.582 40.000 64.000 40.000 ZM 192.000 216.000 L 64.000 216.000 C 59.582 216.000 56.000 212.418 56.000 208.000 L 56.000 200.000 L 200.000 200.000 L 200.000 208.000 C 200.000 212.418 196.418 216.000 192.000 216.000 Z"),
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
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
