package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorBoldIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 60.000 71.000 C 51.054 73.944 42.732 78.525 35.460 84.510 C 31.034 88.071 28.331 93.346 28.026 99.018 C 27.721 104.690 29.842 110.225 33.860 114.240 L 79.320 159.710 L 39.520 199.510 C 34.826 204.204 34.826 211.816 39.520 216.510 C 44.214 221.204 51.826 221.204 56.520 216.510 L 96.320 176.700 L 141.790 222.160 C 145.536 225.896 150.609 227.996 155.900 228.000 C 156.370 228.000 156.840 228.000 157.310 227.950 C 163.085 227.533 168.396 224.633 171.870 220.000 C 175.524 215.155 178.718 209.979 181.410 204.540 L 199.130 224.030 C 201.998 227.263 206.382 228.704 210.609 227.803 C 214.835 226.902 218.251 223.798 219.551 219.676 C 220.851 215.555 219.835 211.053 216.890 207.890 ZM 155.370 201.810 L 54.080 100.520 C 62.000 95.000 70.310 92.120 78.910 91.830 L 163.420 184.830 C 161.615 190.866 158.900 196.592 155.370 201.810 ZM 238.150 106.810 L 199.150 145.920 C 194.469 150.614 186.869 150.626 182.175 145.945 C 177.481 141.264 177.469 133.664 182.150 128.970 L 218.340 92.670 L 163.340 37.670 L 130.590 70.500 C 125.901 75.131 118.355 75.114 113.687 70.463 C 109.019 65.811 108.976 58.265 113.590 53.560 L 149.160 17.870 C 152.911 14.114 158.002 12.004 163.310 12.004 C 168.618 12.004 173.709 14.114 177.460 17.870 L 238.150 78.550 C 245.958 86.360 245.958 99.020 238.150 106.830 Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
