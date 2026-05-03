package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) return _deviceTablet!!
        _deviceTablet = phosphorThinIcon(
            name = "DeviceTablet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 28.000 L 64.000 28.000 C 52.954 28.000 44.000 36.954 44.000 48.000 L 44.000 208.000 C 44.000 219.046 52.954 228.000 64.000 228.000 L 192.000 228.000 C 203.046 228.000 212.000 219.046 212.000 208.000 L 212.000 48.000 C 212.000 36.954 203.046 28.000 192.000 28.000 ZM 52.000 68.000 L 204.000 68.000 L 204.000 188.000 L 52.000 188.000 ZM 64.000 36.000 L 192.000 36.000 C 198.627 36.000 204.000 41.373 204.000 48.000 L 204.000 60.000 L 52.000 60.000 L 52.000 48.000 C 52.000 41.373 57.373 36.000 64.000 36.000 ZM 192.000 220.000 L 64.000 220.000 C 57.373 220.000 52.000 214.627 52.000 208.000 L 52.000 196.000 L 204.000 196.000 L 204.000 208.000 C 204.000 214.627 198.627 220.000 192.000 220.000 Z"),
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
