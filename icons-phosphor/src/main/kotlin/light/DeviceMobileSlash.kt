package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorLightIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.440 212.000 L 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 58.000 59.920 L 58.000 216.000 C 58.000 228.150 67.850 238.000 80.000 238.000 L 176.000 238.000 C 188.150 238.000 198.000 228.150 198.000 216.000 L 198.000 213.920 L 203.560 220.040 C 205.791 222.492 209.588 222.671 212.040 220.440 C 214.492 218.209 214.671 214.412 212.440 211.960 ZM 186.000 216.000 C 186.000 221.523 181.523 226.000 176.000 226.000 L 80.000 226.000 C 74.477 226.000 70.000 221.523 70.000 216.000 L 70.000 73.120 L 186.000 200.720 ZM 70.700 24.000 C 70.700 20.686 73.386 18.000 76.700 18.000 L 176.000 18.000 C 188.150 18.000 198.000 27.850 198.000 40.000 L 198.000 150.830 C 198.000 154.144 195.314 156.830 192.000 156.830 C 188.686 156.830 186.000 154.144 186.000 150.830 L 186.000 40.000 C 186.000 34.477 181.523 30.000 176.000 30.000 L 76.700 30.000 C 73.386 30.000 70.700 27.314 70.700 24.000 Z"),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
