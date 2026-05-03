package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorLightIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 128.000 C 246.000 131.314 243.314 134.000 240.000 134.000 L 213.790 134.000 C 213.109 144.089 210.637 153.977 206.490 163.200 C 205.523 165.361 203.377 166.751 201.010 166.750 C 200.165 166.751 199.329 166.570 198.560 166.220 C 195.544 164.857 194.201 161.308 195.560 158.290 C 207.576 131.432 202.550 100.007 182.757 78.236 C 162.963 56.465 132.158 48.478 104.280 57.890 C 101.140 58.950 97.735 57.265 96.675 54.125 C 95.615 50.985 97.300 47.580 100.440 46.520 C 107.412 44.166 114.658 42.721 122.000 42.220 L 122.000 16.000 C 122.000 12.686 124.686 10.000 128.000 10.000 C 131.314 10.000 134.000 12.686 134.000 16.000 L 134.000 42.230 C 176.729 45.280 210.720 79.271 213.770 122.000 L 240.000 122.000 C 243.314 122.000 246.000 124.686 246.000 128.000 ZM 212.440 212.000 C 214.671 214.452 214.492 218.249 212.040 220.480 C 209.588 222.711 205.791 222.532 203.560 220.080 L 181.260 195.540 C 167.702 206.238 151.230 212.592 134.000 213.770 L 134.000 240.000 C 134.000 243.314 131.314 246.000 128.000 246.000 C 124.686 246.000 122.000 243.314 122.000 240.000 L 122.000 213.770 C 79.271 210.720 45.280 176.729 42.230 134.000 L 16.000 134.000 C 12.686 134.000 10.000 131.314 10.000 128.000 C 10.000 124.686 12.686 122.000 16.000 122.000 L 42.220 122.000 C 43.640 101.978 52.000 83.079 65.860 68.560 L 43.560 44.000 C 41.695 41.516 42.034 38.019 44.342 35.940 C 46.650 33.861 50.163 33.887 52.440 36.000 ZM 173.170 186.600 L 74.000 77.480 C 47.909 105.656 47.706 149.109 73.534 177.528 C 99.361 205.946 142.635 209.886 173.170 186.600 Z"),
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
