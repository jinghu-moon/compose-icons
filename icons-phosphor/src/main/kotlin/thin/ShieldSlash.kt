package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorThinIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 46.310 44.130 C 40.399 44.971 36.005 50.029 36.000 56.000 L 36.000 112.000 C 36.000 163.160 60.730 194.120 81.470 211.100 C 103.870 229.420 126.020 235.600 126.950 235.860 C 127.638 236.047 128.362 236.047 129.050 235.860 C 130.420 235.490 161.610 226.720 187.280 199.150 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 128.000 227.820 C 112.811 222.708 98.678 214.877 86.290 204.710 C 58.230 181.630 44.000 150.440 44.000 112.000 L 44.000 56.000 C 44.000 53.791 45.791 52.000 48.000 52.000 L 53.500 52.000 L 181.880 193.210 C 160.230 216.700 133.580 226.060 128.000 227.820 ZM 220.000 56.000 L 220.000 112.000 C 220.000 132.000 216.230 150.490 208.800 166.940 C 208.154 168.377 206.725 169.301 205.150 169.300 C 204.581 169.297 204.019 169.174 203.500 168.940 C 201.487 168.031 200.592 165.663 201.500 163.650 C 208.500 148.240 211.990 130.860 211.990 112.000 L 211.990 56.000 C 211.990 53.791 210.199 52.000 207.990 52.000 L 98.520 52.000 C 96.311 52.000 94.520 50.209 94.520 48.000 C 94.520 45.791 96.311 44.000 98.520 44.000 L 208.000 44.000 C 214.627 44.000 220.000 49.373 220.000 56.000 Z"),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
