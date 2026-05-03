package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorThinIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 211.000 213.310 L 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 60.000 59.150 L 60.000 216.000 C 60.000 227.046 68.954 236.000 80.000 236.000 L 176.000 236.000 C 187.046 236.000 196.000 227.046 196.000 216.000 L 196.000 208.750 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 188.000 216.000 C 188.000 222.627 182.627 228.000 176.000 228.000 L 80.000 228.000 C 73.373 228.000 68.000 222.627 68.000 216.000 L 68.000 68.000 L 188.000 200.000 ZM 72.700 24.000 C 72.700 21.791 74.491 20.000 76.700 20.000 L 176.000 20.000 C 187.046 20.000 196.000 28.954 196.000 40.000 L 196.000 150.830 C 196.000 153.039 194.209 154.830 192.000 154.830 C 189.791 154.830 188.000 153.039 188.000 150.830 L 188.000 40.000 C 188.000 33.373 182.627 28.000 176.000 28.000 L 76.700 28.000 C 74.491 28.000 72.700 26.209 72.700 24.000 Z"),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
