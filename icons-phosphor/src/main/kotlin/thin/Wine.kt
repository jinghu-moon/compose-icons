package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorThinIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 201.500 104.800 L 179.720 30.870 C 179.220 29.171 177.661 28.003 175.890 28.000 L 80.110 28.000 C 78.339 28.003 76.780 29.171 76.280 30.870 L 54.500 104.800 C 47.973 126.466 54.297 149.959 70.820 165.420 C 85.303 179.010 104.161 186.985 124.000 187.910 L 124.000 236.000 L 88.000 236.000 C 85.791 236.000 84.000 237.791 84.000 240.000 C 84.000 242.209 85.791 244.000 88.000 244.000 L 168.000 244.000 C 170.209 244.000 172.000 242.209 172.000 240.000 C 172.000 237.791 170.209 236.000 168.000 236.000 L 132.000 236.000 L 132.000 187.910 C 151.839 186.985 170.697 179.010 185.180 165.420 C 201.703 149.959 208.027 126.466 201.500 104.800 ZM 83.100 36.000 L 172.900 36.000 L 193.830 107.060 C 194.260 108.550 194.630 110.060 194.930 111.530 C 171.290 122.000 144.170 111.710 129.810 104.430 C 101.590 90.140 80.330 90.330 65.930 94.290 ZM 179.720 159.570 C 150.620 186.811 105.380 186.811 76.280 159.570 C 61.973 146.174 56.505 125.822 62.170 107.060 L 63.170 103.600 C 75.830 98.730 96.620 96.600 126.170 111.600 C 137.000 117.000 154.330 124.000 172.800 124.000 C 180.730 124.071 188.603 122.639 196.000 119.780 C 196.666 134.788 190.715 149.333 179.720 159.570 Z"),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
