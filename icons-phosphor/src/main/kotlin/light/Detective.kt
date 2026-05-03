package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorLightIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 114.000 L 219.060 114.000 L 171.000 47.770 C 168.445 44.263 164.408 42.139 160.070 42.019 C 155.732 41.900 151.584 43.799 148.840 47.160 L 135.930 62.080 C 135.878 62.132 135.831 62.189 135.790 62.250 C 133.892 64.608 131.027 65.980 128.000 65.980 C 124.973 65.980 122.108 64.608 120.210 62.250 C 120.169 62.189 120.122 62.132 120.070 62.080 L 107.200 47.160 C 104.456 43.783 100.299 41.874 95.950 41.993 C 91.600 42.113 87.554 44.248 85.000 47.770 L 36.940 114.000 L 8.000 114.000 C 4.686 114.000 2.000 116.686 2.000 120.000 C 2.000 123.314 4.686 126.000 8.000 126.000 L 248.000 126.000 C 251.314 126.000 254.000 123.314 254.000 120.000 C 254.000 116.686 251.314 114.000 248.000 114.000 ZM 94.750 54.820 C 95.118 54.327 95.693 54.031 96.308 54.017 C 96.923 54.004 97.510 54.274 97.900 54.750 L 98.050 54.920 L 110.910 69.840 C 115.073 75.012 121.360 78.014 128.000 78.000 L 128.000 78.000 C 134.640 78.014 140.927 75.012 145.090 69.840 L 158.000 54.920 L 158.150 54.750 C 158.540 54.274 159.127 54.004 159.742 54.017 C 160.357 54.031 160.932 54.327 161.300 54.820 L 204.300 114.000 L 51.770 114.000 ZM 180.000 146.000 C 162.000 146.001 147.119 160.031 146.060 178.000 L 109.940 178.000 C 108.898 160.429 94.617 146.558 77.022 146.029 C 59.428 145.499 44.339 158.486 42.242 175.963 C 40.145 193.439 51.733 209.627 68.953 213.275 C 86.173 216.923 103.330 206.826 108.500 190.000 L 147.500 190.000 C 152.638 206.696 169.593 216.782 186.717 213.329 C 203.841 209.876 215.562 194.008 213.828 176.625 C 212.094 159.242 197.469 146.002 180.000 146.000 ZM 76.000 202.000 C 63.850 202.000 54.000 192.150 54.000 180.000 C 54.000 167.850 63.850 158.000 76.000 158.000 C 88.150 158.000 98.000 167.850 98.000 180.000 C 98.000 192.150 88.150 202.000 76.000 202.000 ZM 180.000 202.000 C 167.850 202.000 158.000 192.150 158.000 180.000 C 158.000 167.850 167.850 158.000 180.000 158.000 C 192.150 158.000 202.000 167.850 202.000 180.000 C 202.000 192.150 192.150 202.000 180.000 202.000 Z"),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
