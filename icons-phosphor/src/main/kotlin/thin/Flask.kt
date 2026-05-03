package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorThinIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 218.270 201.830 L 156.000 98.000 L 156.000 36.000 L 168.000 36.000 C 170.209 36.000 172.000 34.209 172.000 32.000 C 172.000 29.791 170.209 28.000 168.000 28.000 L 88.000 28.000 C 85.791 28.000 84.000 29.791 84.000 32.000 C 84.000 34.209 85.791 36.000 88.000 36.000 L 100.000 36.000 L 100.000 98.000 L 37.730 201.830 C 35.510 205.534 35.451 210.145 37.576 213.905 C 39.700 217.664 43.682 219.992 48.000 220.000 L 208.000 220.000 C 212.322 219.999 216.310 217.674 218.440 213.913 C 220.569 210.153 220.512 205.537 218.290 201.830 ZM 107.430 101.200 C 107.800 100.576 107.997 99.865 108.000 99.140 L 108.000 36.000 L 148.000 36.000 L 148.000 99.140 C 148.003 99.865 148.200 100.576 148.570 101.200 L 189.570 169.530 C 176.810 173.470 157.030 174.210 129.820 160.430 C 111.820 151.290 94.820 147.190 79.280 148.140 ZM 211.460 210.000 C 210.752 211.252 209.418 212.018 207.980 212.000 L 48.000 212.000 C 46.558 212.000 45.228 211.225 44.518 209.970 C 43.808 208.716 43.828 207.176 44.570 205.940 L 74.100 156.730 C 89.640 154.300 107.150 157.940 126.170 167.570 C 144.540 176.860 160.000 180.000 172.420 180.000 C 179.683 180.048 186.903 178.879 193.780 176.540 L 211.410 205.920 C 212.189 207.163 212.208 208.738 211.460 210.000 Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
