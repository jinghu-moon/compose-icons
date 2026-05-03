package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorThinIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 165.170 135.510 C 164.246 134.583 163.835 133.262 164.068 131.975 C 164.301 130.687 165.150 129.594 166.340 129.050 L 212.650 111.260 L 212.810 111.200 C 217.324 109.187 220.142 104.613 219.910 99.676 C 219.678 94.740 216.443 90.450 211.760 88.870 L 51.670 36.600 C 47.396 35.242 42.722 36.381 39.551 39.551 C 36.381 42.722 35.242 47.396 36.600 51.670 L 88.870 211.760 C 90.385 216.501 94.698 219.791 99.670 220.000 L 100.250 220.000 C 105.031 220.039 109.368 217.205 111.250 212.810 L 111.310 212.650 L 129.100 166.340 C 129.644 165.146 130.738 164.295 132.029 164.061 C 133.320 163.828 134.643 164.242 135.570 165.170 L 186.880 216.490 C 189.132 218.749 192.190 220.019 195.380 220.019 C 198.570 220.019 201.628 218.749 203.880 216.490 L 216.570 203.800 C 218.829 201.548 220.099 198.490 220.099 195.300 C 220.099 192.110 218.829 189.052 216.570 186.800 ZM 210.830 198.140 L 198.140 210.830 C 197.390 211.581 196.372 212.003 195.310 212.003 C 194.248 212.003 193.230 211.581 192.480 210.830 L 141.170 159.520 C 138.922 157.269 135.872 156.003 132.690 156.000 C 131.938 156.000 131.189 156.071 130.450 156.210 C 126.549 156.949 123.265 159.569 121.680 163.210 L 121.620 163.370 L 103.830 209.680 C 103.122 211.125 101.617 212.004 100.011 211.912 C 98.404 211.821 97.009 210.776 96.470 209.260 L 44.200 49.190 C 43.764 47.774 44.147 46.232 45.194 45.184 C 46.242 44.137 47.784 43.754 49.200 44.190 L 209.270 96.470 C 210.786 97.009 211.831 98.404 211.922 100.011 C 212.014 101.617 211.135 103.122 209.690 103.830 L 163.380 121.610 L 163.220 121.680 C 159.577 123.261 156.953 126.542 156.210 130.444 C 155.467 134.345 156.703 138.361 159.510 141.170 L 210.830 192.480 C 211.581 193.230 212.003 194.248 212.003 195.310 C 212.003 196.372 211.581 197.390 210.830 198.140 Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
