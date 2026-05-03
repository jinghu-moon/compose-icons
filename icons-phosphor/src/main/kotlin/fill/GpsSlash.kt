package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorFillIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 136.000 L 215.630 136.000 C 214.566 147.774 211.120 159.209 205.500 169.610 C 204.889 170.762 203.755 171.544 202.461 171.706 C 201.167 171.867 199.875 171.387 199.000 170.420 L 92.510 53.280 C 91.635 52.320 91.280 50.996 91.559 49.728 C 91.837 48.459 92.714 47.405 93.910 46.900 C 102.216 43.384 111.017 41.181 120.000 40.370 L 120.000 16.000 C 119.995 13.783 120.910 11.664 122.527 10.147 C 124.144 8.631 126.318 7.853 128.530 8.000 C 132.805 8.367 136.068 11.979 136.000 16.270 L 136.000 40.370 C 178.252 44.282 211.718 77.748 215.630 120.000 L 239.730 120.000 C 244.013 119.942 247.613 123.202 247.980 127.470 C 248.127 129.678 247.352 131.849 245.840 133.465 C 244.328 135.082 242.213 135.999 240.000 136.000 ZM 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 63.170 68.580 C 50.126 82.749 42.113 100.820 40.370 120.000 L 16.000 120.000 C 11.582 120.000 8.000 123.582 8.000 128.000 C 8.000 132.418 11.582 136.000 16.000 136.000 L 40.370 136.000 C 44.282 178.252 77.748 211.718 120.000 215.630 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 215.630 C 152.337 214.152 167.930 208.113 181.000 198.200 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 Z"),
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
