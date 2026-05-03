package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorBoldIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.840 54.160 C 201.659 29.979 162.465 29.944 138.240 54.080 L 128.000 63.940 L 117.760 54.080 C 93.505 30.093 54.429 30.205 30.312 54.332 C 6.196 78.459 6.101 117.536 30.100 141.780 L 119.450 232.420 C 121.705 234.710 124.786 236.000 128.000 236.000 C 131.214 236.000 134.295 234.710 136.550 232.420 L 225.840 141.840 C 250.052 117.628 250.052 78.372 225.840 54.160 ZM 208.840 124.930 L 128.030 206.930 L 47.160 124.930 C 37.527 115.337 33.753 101.329 37.262 88.195 C 40.772 75.061 51.031 64.802 64.165 61.292 C 77.299 57.783 91.307 61.557 100.900 71.190 L 101.060 71.350 L 110.730 80.660 L 103.730 87.420 C 101.408 89.654 100.082 92.727 100.050 95.949 C 100.018 99.171 101.283 102.271 103.560 104.550 L 127.000 128.000 L 119.480 135.510 C 114.786 140.204 114.786 147.816 119.480 152.510 C 124.174 157.204 131.786 157.204 136.480 152.510 L 152.480 136.510 C 154.739 134.258 156.009 131.200 156.009 128.010 C 156.009 124.820 154.739 121.762 152.480 119.510 L 129.130 96.160 L 155.000 71.290 L 155.160 71.130 C 164.765 61.513 178.775 57.758 191.902 61.283 C 205.029 64.808 215.273 75.076 218.769 88.210 C 222.264 101.345 218.478 115.347 208.840 124.930 Z"),
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
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
