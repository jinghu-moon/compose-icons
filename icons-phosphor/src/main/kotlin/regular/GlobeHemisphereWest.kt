package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) return _globeHemisphereWest!!
        _globeHemisphereWest = phosphorRegularIcon(
            name = "GlobeHemisphereWest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 216.000 128.000 C 216.009 139.290 213.836 150.475 209.600 160.940 L 164.900 133.450 C 162.999 132.277 160.873 131.517 158.660 131.220 L 135.840 128.140 C 129.411 127.302 123.106 130.399 119.840 136.000 L 111.120 136.000 L 107.320 128.140 C 105.191 123.705 101.130 120.504 96.320 119.470 L 88.320 117.740 L 96.140 104.000 L 112.850 104.000 C 115.554 103.995 118.213 103.307 120.580 102.000 L 132.830 95.240 C 133.906 94.640 134.912 93.922 135.830 93.100 L 162.740 68.760 C 168.298 63.779 169.653 55.608 166.000 49.100 L 165.640 48.450 C 196.374 63.023 215.975 93.986 216.000 128.000 ZM 143.310 41.340 L 152.000 56.900 L 125.090 81.240 L 112.850 88.000 L 96.140 88.000 C 90.415 87.992 85.122 91.042 82.260 96.000 L 73.530 111.230 L 63.380 84.190 L 74.320 58.320 C 93.900 43.191 118.952 37.019 143.320 41.320 ZM 40.000 128.000 C 39.987 114.920 42.905 102.004 48.540 90.200 L 59.880 120.470 C 61.800 125.563 66.178 129.330 71.500 130.470 L 92.930 135.080 L 96.740 143.000 C 99.437 148.495 105.019 151.983 111.140 152.000 L 112.620 152.000 L 105.390 168.230 C 102.786 174.071 103.911 180.902 108.250 185.600 L 108.390 185.740 L 128.000 205.940 L 126.060 215.940 C 78.267 214.828 40.079 175.806 40.000 128.000 ZM 142.580 214.780 L 143.710 208.970 C 144.652 203.965 143.168 198.809 139.710 195.070 C 139.661 195.026 139.614 194.979 139.570 194.930 L 120.000 174.740 L 133.700 144.000 L 156.520 147.080 L 202.240 175.200 C 188.845 196.236 167.169 210.617 142.580 214.780 Z"),
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
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null
