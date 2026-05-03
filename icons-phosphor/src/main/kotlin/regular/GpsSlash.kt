package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorRegularIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 128.000 C 248.000 132.418 244.418 136.000 240.000 136.000 L 215.640 136.000 C 214.777 145.677 212.300 155.141 208.310 164.000 C 207.021 166.877 204.163 168.730 201.010 168.730 C 199.882 168.730 198.767 168.487 197.740 168.020 C 193.720 166.202 191.931 161.474 193.740 157.450 C 205.421 131.318 200.528 100.750 181.273 79.570 C 162.019 58.390 132.054 50.615 104.930 59.760 C 102.202 60.761 99.146 60.203 96.946 58.304 C 94.747 56.405 93.751 53.462 94.343 50.617 C 94.936 47.772 97.025 45.473 99.800 44.610 C 106.342 42.402 113.123 40.979 120.000 40.370 L 120.000 16.000 C 120.000 11.582 123.582 8.000 128.000 8.000 C 132.418 8.000 136.000 11.582 136.000 16.000 L 136.000 40.370 C 178.252 44.282 211.718 77.748 215.630 120.000 L 240.000 120.000 C 244.418 120.000 248.000 123.582 248.000 128.000 ZM 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 181.000 198.230 C 167.922 208.124 152.332 214.152 136.000 215.630 L 136.000 240.000 C 136.000 244.418 132.418 248.000 128.000 248.000 C 123.582 248.000 120.000 244.418 120.000 240.000 L 120.000 215.630 C 77.748 211.718 44.282 178.252 40.370 136.000 L 16.000 136.000 C 11.582 136.000 8.000 132.418 8.000 128.000 C 8.000 123.582 11.582 120.000 16.000 120.000 L 40.370 120.000 C 42.146 100.823 50.142 82.751 63.140 68.540 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 170.200 186.320 L 74.000 80.450 C 49.937 107.985 50.337 149.184 74.928 176.248 C 99.520 203.312 140.493 207.643 170.200 186.320 Z"),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
