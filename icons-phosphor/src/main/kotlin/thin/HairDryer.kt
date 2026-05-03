package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorThinIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 88.000 C 196.000 72.536 183.464 60.000 168.000 60.000 C 152.536 60.000 140.000 72.536 140.000 88.000 C 140.000 103.464 152.536 116.000 168.000 116.000 C 183.464 116.000 196.000 103.464 196.000 88.000 ZM 168.000 108.000 C 156.954 108.000 148.000 99.046 148.000 88.000 C 148.000 76.954 156.954 68.000 168.000 68.000 C 179.046 68.000 188.000 76.954 188.000 88.000 C 188.000 99.046 179.046 108.000 168.000 108.000 ZM 162.850 212.000 C 167.546 212.004 171.813 209.269 173.770 205.000 L 205.770 134.610 C 225.508 118.610 233.028 91.913 224.543 67.963 C 216.058 44.014 193.408 28.005 168.000 28.000 C 167.779 28.002 167.559 28.018 167.340 28.050 L 30.000 50.940 C 24.223 51.916 19.996 56.921 20.000 62.780 L 20.000 113.220 C 19.996 119.079 24.223 124.084 30.000 125.060 L 132.000 142.060 L 132.000 200.000 C 132.000 206.627 137.373 212.000 144.000 212.000 L 148.000 212.000 L 148.000 216.000 C 148.000 235.882 164.118 252.000 184.000 252.000 L 200.000 252.000 C 202.209 252.000 204.000 250.209 204.000 248.000 C 204.000 245.791 202.209 244.000 200.000 244.000 L 184.000 244.000 C 168.536 244.000 156.000 231.464 156.000 216.000 L 156.000 212.000 ZM 28.000 113.220 L 28.000 62.780 C 27.973 60.805 29.392 59.106 31.340 58.780 L 168.330 36.000 C 197.049 36.000 220.330 59.281 220.330 88.000 C 220.330 116.719 197.049 140.000 168.330 140.000 L 31.330 117.170 C 29.405 116.843 27.997 115.173 28.000 113.220 ZM 140.000 200.000 L 140.000 143.390 L 167.340 148.000 C 167.559 148.032 167.779 148.048 168.000 148.050 C 176.803 148.056 185.497 146.113 193.460 142.360 L 166.460 201.700 C 165.813 203.130 164.389 204.048 162.820 204.050 L 144.000 204.050 C 142.930 204.050 141.905 203.622 141.154 202.861 C 140.402 202.100 139.987 201.070 140.000 200.000 Z"),
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
        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
