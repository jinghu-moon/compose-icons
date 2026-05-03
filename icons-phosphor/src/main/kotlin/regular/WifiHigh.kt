package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = phosphorRegularIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 204.000 C 140.000 210.627 134.627 216.000 128.000 216.000 C 121.373 216.000 116.000 210.627 116.000 204.000 C 116.000 197.373 121.373 192.000 128.000 192.000 C 134.627 192.000 140.000 197.373 140.000 204.000 ZM 237.080 87.000 C 173.662 34.983 82.338 34.983 18.920 87.000 C 15.504 89.806 15.009 94.849 17.815 98.265 C 20.621 101.681 25.664 102.176 29.080 99.370 C 86.594 52.206 169.406 52.206 226.920 99.370 C 230.336 102.176 235.379 101.681 238.185 98.265 C 240.991 94.849 240.496 89.806 237.080 87.000 ZM 205.000 122.770 C 159.899 87.063 96.161 87.063 51.060 122.770 C 47.597 125.515 47.015 130.547 49.760 134.010 C 52.505 137.473 57.537 138.055 61.000 135.310 C 100.279 104.219 155.781 104.219 195.060 135.310 C 196.723 136.628 198.841 137.232 200.949 136.988 C 203.057 136.744 204.982 135.673 206.300 134.010 C 207.618 132.347 208.222 130.229 207.978 128.121 C 207.734 126.013 206.663 124.088 205.000 122.770 ZM 172.740 158.530 C 146.082 139.156 109.978 139.156 83.320 158.530 C 79.747 161.131 78.959 166.137 81.560 169.710 C 84.161 173.283 89.167 174.071 92.740 171.470 C 113.779 156.169 142.281 156.169 163.320 171.470 C 166.893 174.071 171.899 173.283 174.500 169.710 C 177.101 166.137 176.313 161.131 172.740 158.530 Z"),
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
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
