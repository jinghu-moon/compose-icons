package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorFillIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.380 221.920 C 210.110 224.891 205.051 224.649 202.080 221.380 L 196.570 215.320 C 195.087 215.765 193.548 215.994 192.000 216.000 L 32.000 216.000 C 25.248 216.001 19.223 211.764 16.940 205.410 C 14.912 199.432 16.495 192.821 21.010 188.410 L 100.140 109.290 L 42.260 45.620 C 39.249 42.402 39.310 37.382 42.400 34.240 C 43.956 32.736 46.055 31.926 48.218 31.996 C 50.381 32.065 52.424 33.009 53.880 34.610 L 213.880 210.610 C 215.315 212.175 216.068 214.247 215.975 216.369 C 215.881 218.490 214.947 220.487 213.380 221.920 ZM 201.000 172.660 C 202.106 173.914 203.875 174.348 205.435 173.748 C 206.996 173.149 208.019 171.642 208.000 169.970 L 208.000 40.000 C 208.005 33.525 204.107 27.685 198.125 25.206 C 192.143 22.727 185.256 24.099 180.680 28.680 L 125.470 83.880 C 123.960 85.390 123.903 87.820 125.340 89.400 Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
