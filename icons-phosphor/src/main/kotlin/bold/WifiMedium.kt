package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorBoldIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 204.000 C 144.000 212.837 136.837 220.000 128.000 220.000 C 119.163 220.000 112.000 212.837 112.000 204.000 C 112.000 195.163 119.163 188.000 128.000 188.000 C 136.837 188.000 144.000 195.163 144.000 204.000 ZM 207.450 119.640 C 160.895 82.784 95.105 82.784 48.550 119.640 C 43.490 123.793 42.692 131.235 46.757 136.367 C 50.822 141.498 58.249 142.425 63.450 138.450 C 101.275 108.508 154.725 108.508 192.550 138.450 C 197.751 142.425 205.178 141.498 209.243 136.367 C 213.308 131.235 212.510 123.793 207.450 119.640 ZM 175.070 155.300 C 147.006 134.899 108.994 134.899 80.930 155.300 C 75.573 159.205 74.395 166.713 78.300 172.070 C 82.205 177.427 89.713 178.605 95.070 174.700 C 114.703 160.426 141.297 160.426 160.930 174.700 C 166.287 178.605 173.795 177.427 177.700 172.070 C 181.605 166.713 180.427 159.205 175.070 155.300 Z"),
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
