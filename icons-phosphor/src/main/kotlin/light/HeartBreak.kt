package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorLightIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.000 42.000 C 162.078 41.957 146.800 48.284 135.570 59.570 L 128.000 67.150 L 120.430 59.570 C 103.270 42.407 77.460 37.272 55.038 46.560 C 32.616 55.849 17.997 77.730 18.000 102.000 C 18.000 131.200 36.200 161.590 72.100 192.310 C 88.550 206.328 106.320 218.719 125.160 229.310 C 126.933 230.263 129.067 230.263 130.840 229.310 C 149.680 218.719 167.450 206.328 183.900 192.310 C 219.800 161.590 238.000 131.200 238.000 102.000 C 237.961 68.879 211.121 42.039 178.000 42.000 ZM 128.000 217.110 C 111.590 207.640 30.000 157.720 30.000 102.000 C 30.001 82.587 41.696 65.085 59.632 57.656 C 77.567 50.227 98.212 54.333 111.940 68.060 L 119.510 75.630 L 107.760 87.390 C 106.633 88.515 106.000 90.043 106.000 91.635 C 106.000 93.227 106.633 94.755 107.760 95.880 L 133.700 121.820 L 115.760 139.760 C 113.557 142.124 113.622 145.808 115.907 148.093 C 118.192 150.378 121.876 150.443 124.240 148.240 L 146.430 126.060 C 147.557 124.935 148.190 123.407 148.190 121.815 C 148.190 120.223 147.557 118.695 146.430 117.570 L 120.490 91.630 L 144.060 68.060 C 157.788 54.333 178.433 50.227 196.368 57.656 C 214.304 65.085 225.999 82.587 226.000 102.000 C 226.000 157.720 144.410 207.640 128.000 217.110 Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
