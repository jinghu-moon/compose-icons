package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorLightIcon(
            name = "DribbbleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 217.810 122.300 C 214.550 122.110 211.270 122.000 208.010 122.000 C 192.709 122.007 177.483 124.123 162.760 128.290 C 159.126 117.039 154.288 106.213 148.330 96.000 C 148.190 95.750 148.030 95.510 147.890 95.260 C 163.198 86.272 176.969 74.891 188.680 61.550 C 205.907 77.251 216.353 99.037 217.810 122.300 ZM 179.290 54.090 C 168.393 66.411 155.599 76.913 141.390 85.200 C 129.894 68.629 115.492 54.277 98.880 42.840 C 125.946 33.578 155.805 37.756 179.290 54.090 ZM 85.710 48.580 C 103.393 59.510 118.696 73.885 130.710 90.850 C 109.894 100.847 87.092 106.025 64.000 106.000 C 56.356 105.994 48.722 105.429 41.160 104.310 C 47.738 80.409 63.845 60.260 85.710 48.580 ZM 38.000 128.000 C 38.000 124.014 38.263 120.032 38.790 116.080 C 47.133 117.355 55.560 117.997 64.000 118.000 C 89.410 118.028 114.487 112.212 137.290 101.000 C 137.510 101.370 137.750 101.730 137.960 102.100 C 143.483 111.556 147.969 121.581 151.340 132.000 C 142.307 135.267 133.577 139.320 125.250 144.110 C 102.900 157.004 83.841 174.902 69.570 196.400 C 49.534 179.326 37.994 154.324 38.000 128.000 ZM 79.190 203.580 C 92.478 183.376 110.301 166.556 131.240 154.460 C 138.711 150.164 146.533 146.508 154.620 143.530 C 157.475 155.371 158.919 167.509 158.920 179.690 C 158.920 191.173 157.642 202.620 155.110 213.820 C 129.543 221.902 101.702 218.147 79.190 203.580 ZM 168.430 208.390 C 170.086 198.913 170.919 189.311 170.920 179.690 C 170.913 166.253 169.281 152.865 166.060 139.820 C 179.707 135.966 193.819 134.007 208.000 134.000 C 211.250 134.000 214.520 134.110 217.770 134.320 C 215.505 165.973 196.766 194.104 168.430 208.390 Z"),
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
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
