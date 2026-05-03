package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorLightIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 254.000 216.000 C 254.000 219.314 251.314 222.000 248.000 222.000 L 104.000 222.000 C 100.686 222.000 98.000 219.314 98.000 216.000 C 98.000 212.686 100.686 210.000 104.000 210.000 L 248.000 210.000 C 251.314 210.000 254.000 212.686 254.000 216.000 ZM 230.380 189.780 L 53.750 140.320 C 37.367 135.682 26.044 120.746 26.000 103.720 L 26.000 48.000 C 25.997 43.498 28.160 39.269 31.811 36.635 C 35.463 34.002 40.159 33.285 44.430 34.710 L 49.900 36.540 C 51.639 37.121 53.016 38.466 53.640 40.190 L 64.640 70.520 L 98.000 80.000 L 98.000 48.000 C 97.997 43.498 100.160 39.269 103.811 36.635 C 107.463 34.002 112.159 33.285 116.430 34.710 L 121.900 36.540 C 123.539 37.088 124.862 38.316 125.530 39.910 L 148.410 94.440 L 210.180 111.710 C 226.604 116.309 237.969 131.264 238.000 148.320 L 238.000 184.000 C 238.001 185.878 237.122 187.648 235.626 188.783 C 234.130 189.918 232.188 190.287 230.380 189.780 ZM 226.000 148.320 C 225.958 136.679 218.205 126.477 207.000 123.320 L 142.420 105.320 C 140.657 104.824 139.217 103.550 138.510 101.860 L 115.510 47.160 L 112.620 46.160 C 112.021 45.964 111.365 46.062 110.850 46.424 C 110.334 46.787 110.019 47.370 110.000 48.000 L 110.000 88.000 C 110.000 89.881 109.117 91.653 107.616 92.786 C 106.115 93.920 104.169 94.284 102.360 93.770 L 58.360 81.230 C 56.505 80.702 55.016 79.314 54.360 77.500 L 43.340 47.000 L 40.630 46.100 C 40.427 46.032 40.214 45.998 40.000 46.000 C 39.583 46.003 39.178 46.136 38.840 46.380 C 38.316 46.753 38.003 47.356 38.000 48.000 L 38.000 103.720 C 38.048 115.358 45.799 125.557 57.000 128.720 L 226.000 176.050 Z"),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
