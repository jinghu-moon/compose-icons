package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MaskSad: ImageVector
    get() {
        if (_maskSad != null) return _maskSad!!
        _maskSad = phosphorFillIcon(
            name = "MaskSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 217.000 34.800 C 212.648 31.811 207.098 31.170 202.180 33.090 C 188.150 38.550 159.820 47.710 128.000 47.710 C 96.180 47.710 67.840 38.550 53.790 33.090 C 48.869 31.180 43.322 31.820 38.965 34.801 C 34.608 37.782 32.002 42.721 32.000 48.000 L 32.000 103.770 C 32.000 139.610 41.650 173.420 59.180 198.950 C 77.340 225.410 101.780 239.950 128.000 239.950 C 154.220 239.950 178.660 225.380 196.820 198.950 C 214.350 173.440 224.000 139.630 224.000 103.790 L 224.000 48.000 C 223.990 42.714 221.371 37.773 217.000 34.800 ZM 66.000 125.330 C 63.054 122.016 63.351 116.941 66.665 113.995 C 69.979 111.049 75.054 111.346 78.000 114.660 C 80.680 117.660 86.850 120.000 92.000 120.000 C 97.150 120.000 103.360 117.650 106.000 114.660 C 108.946 111.346 114.021 111.049 117.335 113.995 C 120.649 116.941 120.946 122.016 118.000 125.330 C 112.250 131.710 101.820 136.000 92.000 136.000 C 82.180 136.000 71.750 131.710 66.000 125.330 ZM 158.620 188.430 C 157.145 190.648 154.663 191.986 152.000 192.000 C 150.426 192.002 148.887 191.536 147.580 190.660 C 141.070 186.340 136.000 184.000 128.000 184.000 C 120.000 184.000 114.930 186.340 108.430 190.660 C 104.755 193.013 99.872 191.987 97.455 188.353 C 95.038 184.720 95.979 179.820 99.570 177.340 C 108.000 171.730 116.060 168.000 128.000 168.000 C 139.940 168.000 148.000 171.730 156.430 177.340 C 160.108 179.787 161.106 184.752 158.660 188.430 ZM 189.920 125.330 C 184.210 131.710 173.780 136.000 163.920 136.000 C 154.060 136.000 143.670 131.710 137.920 125.330 C 134.974 121.994 135.289 116.901 138.625 113.955 C 141.961 111.009 147.054 111.324 150.000 114.660 C 152.680 117.660 158.850 120.000 164.000 120.000 C 169.150 120.000 175.360 117.650 178.000 114.660 C 180.946 111.346 186.021 111.049 189.335 113.995 C 192.649 116.941 192.946 122.016 190.000 125.330 Z"),
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
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null
