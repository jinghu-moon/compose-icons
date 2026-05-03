package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorLightIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.540 69.710 C 244.614 67.467 242.427 66.002 240.000 66.000 L 208.400 66.000 C 200.260 51.320 184.855 42.153 168.070 42.000 C 155.973 41.845 144.324 46.575 135.760 55.120 C 126.933 63.780 121.972 75.634 122.000 88.000 L 122.000 96.660 C 80.000 86.660 45.400 52.140 45.000 51.780 C 43.355 50.147 40.916 49.607 38.736 50.393 C 36.555 51.180 35.023 53.153 34.800 55.460 C 30.550 102.680 44.220 134.210 56.440 152.350 C 62.757 161.853 70.544 170.291 79.510 177.350 C 64.020 196.350 38.170 206.240 37.890 206.350 C 36.160 206.990 34.820 208.391 34.258 210.148 C 33.695 211.906 33.973 213.824 35.010 215.350 C 36.000 216.830 45.780 230.000 80.000 230.000 C 149.880 230.000 208.230 176.000 213.820 106.660 L 244.240 76.250 C 245.956 74.534 246.469 71.952 245.540 69.710 ZM 203.760 99.760 C 202.727 100.791 202.104 102.163 202.010 103.620 C 197.930 167.760 144.330 218.000 80.000 218.000 C 66.000 218.000 57.240 215.590 51.940 213.200 C 63.240 207.520 81.660 196.320 92.990 179.330 C 93.903 177.956 94.211 176.267 93.840 174.660 C 93.466 173.042 92.437 171.652 91.000 170.820 C 90.870 170.740 77.870 162.960 66.000 145.100 C 52.000 124.000 45.310 98.430 46.000 68.880 C 60.880 81.480 91.570 103.970 127.000 109.880 C 128.742 110.174 130.525 109.686 131.874 108.545 C 133.224 107.404 134.001 105.727 134.000 103.960 L 134.000 88.000 C 133.981 78.846 137.655 70.071 144.190 63.660 C 150.482 57.378 159.039 53.896 167.930 54.000 C 181.360 54.170 193.930 62.370 199.170 74.400 C 200.124 76.587 202.284 78.000 204.670 78.000 L 225.510 78.000 Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
