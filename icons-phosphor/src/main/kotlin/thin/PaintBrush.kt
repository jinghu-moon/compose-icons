package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorThinIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 28.000 C 203.710 28.000 180.840 39.240 156.000 61.400 C 137.530 77.890 121.610 97.230 111.000 111.330 C 93.841 105.141 74.744 107.697 59.816 118.180 C 44.889 128.663 36.003 145.759 36.000 164.000 C 36.000 197.220 14.740 212.000 13.780 212.680 C 12.321 213.660 11.673 215.479 12.183 217.161 C 12.693 218.843 14.242 219.995 16.000 220.000 L 92.000 220.000 C 110.241 219.997 127.337 211.111 137.820 196.184 C 148.303 181.256 150.859 162.159 144.670 145.000 C 158.780 134.370 178.110 118.450 194.600 100.000 C 216.760 75.160 228.000 52.290 228.000 32.000 C 228.000 29.791 226.209 28.000 224.000 28.000 ZM 92.000 212.000 L 26.350 212.000 C 33.910 203.690 44.000 188.080 44.000 164.000 C 44.000 137.490 65.490 116.000 92.000 116.000 C 118.510 116.000 140.000 137.490 140.000 164.000 C 140.000 190.510 118.510 212.000 92.000 212.000 ZM 118.520 114.690 C 122.650 109.250 127.840 102.690 133.810 95.790 C 144.567 102.387 153.613 111.433 160.210 122.190 C 153.270 128.190 146.750 133.350 141.310 137.480 C 136.096 127.825 128.175 119.904 118.520 114.690 ZM 166.290 116.830 C 159.350 105.910 150.090 96.650 139.170 89.710 C 161.000 65.430 191.260 38.630 219.820 36.180 C 217.370 64.740 190.570 95.000 166.290 116.830 Z"),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
