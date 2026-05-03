package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorLightIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 138.000 204.000 C 138.000 209.523 133.523 214.000 128.000 214.000 C 122.477 214.000 118.000 209.523 118.000 204.000 C 118.000 198.477 122.477 194.000 128.000 194.000 C 133.523 194.000 138.000 198.477 138.000 204.000 ZM 203.730 124.340 C 159.355 89.207 96.645 89.207 52.270 124.340 C 49.672 126.400 49.235 130.176 51.295 132.775 C 53.355 135.374 57.132 135.810 59.730 133.750 C 99.736 102.084 156.264 102.084 196.270 133.750 C 197.338 134.574 198.652 135.014 200.000 135.000 C 202.553 135.000 204.826 133.385 205.666 130.975 C 206.506 128.565 205.730 125.887 203.730 124.300 ZM 171.530 160.150 C 145.580 141.273 110.420 141.273 84.470 160.150 C 81.873 162.127 81.333 165.816 83.253 168.455 C 85.174 171.094 88.851 171.713 91.530 169.850 C 113.272 154.036 142.728 154.036 164.470 169.850 C 167.149 171.799 170.900 171.208 172.850 168.530 C 174.799 165.851 174.208 162.100 171.530 160.150 Z"),
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
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
