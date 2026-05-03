package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorThinIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 128.000 C 244.000 130.209 242.209 132.000 240.000 132.000 L 211.900 132.000 C 211.429 142.493 208.972 152.802 204.660 162.380 C 204.017 163.821 202.588 164.749 201.010 164.750 C 200.447 164.748 199.891 164.625 199.380 164.390 C 197.373 163.481 196.479 161.120 197.380 159.110 C 209.714 131.524 204.547 99.252 184.217 76.895 C 163.888 54.538 132.251 46.336 103.620 56.000 C 102.247 56.537 100.691 56.276 99.568 55.321 C 98.446 54.365 97.941 52.870 98.252 51.429 C 98.564 49.988 99.643 48.836 101.060 48.430 C 108.466 45.920 116.188 44.463 124.000 44.100 L 124.000 16.000 C 124.000 13.791 125.791 12.000 128.000 12.000 C 130.209 12.000 132.000 13.791 132.000 16.000 L 132.000 44.100 C 175.222 46.214 209.786 80.778 211.900 124.000 L 240.000 124.000 C 242.209 124.000 244.000 125.791 244.000 128.000 ZM 211.000 213.310 C 211.982 214.364 212.320 215.865 211.887 217.239 C 211.454 218.613 210.315 219.647 208.906 219.948 C 207.497 220.248 206.036 219.768 205.080 218.690 L 181.520 192.780 C 167.521 204.351 150.142 211.061 132.000 211.900 L 132.000 240.000 C 132.000 242.209 130.209 244.000 128.000 244.000 C 125.791 244.000 124.000 242.209 124.000 240.000 L 124.000 211.900 C 80.778 209.786 46.214 175.222 44.100 132.000 L 16.000 132.000 C 13.791 132.000 12.000 130.209 12.000 128.000 C 12.000 125.791 13.791 124.000 16.000 124.000 L 44.100 124.000 C 45.117 103.138 53.849 83.398 68.600 68.610 L 45.000 42.690 C 43.514 41.033 43.653 38.486 45.310 37.000 C 46.967 35.514 49.514 35.653 51.000 37.310 L 184.770 184.500 L 184.770 184.500 ZM 176.130 186.840 L 74.000 74.530 C 45.606 103.262 44.649 149.185 71.821 179.075 C 98.994 208.964 144.800 212.375 176.100 186.840 Z"),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
