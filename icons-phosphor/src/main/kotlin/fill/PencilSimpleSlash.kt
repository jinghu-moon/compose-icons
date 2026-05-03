package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) return _pencilSimpleSlash!!
        _pencilSimpleSlash = phosphorFillIcon(
            name = "PencilSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.320 73.370 L 182.630 28.690 C 179.629 25.689 175.559 24.002 171.315 24.002 C 167.071 24.002 163.001 25.689 160.000 28.690 L 115.640 73.050 C 114.127 74.558 114.066 76.988 115.500 78.570 L 174.230 143.170 C 174.967 143.979 176.003 144.451 177.097 144.475 C 178.191 144.500 179.247 144.075 180.020 143.300 L 227.320 96.000 C 230.321 92.999 232.008 88.929 232.008 84.685 C 232.008 80.441 230.321 76.371 227.320 73.370 ZM 192.000 108.690 L 147.320 64.000 L 171.320 40.000 L 216.000 84.690 ZM 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 154.400 168.920 L 104.000 219.310 C 101.010 222.324 96.936 224.014 92.690 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 163.310 C 31.987 159.066 33.672 154.994 36.680 152.000 L 90.280 98.400 L 42.280 45.580 C 39.487 42.593 39.329 38.002 41.910 34.830 C 43.398 33.081 45.566 32.056 47.863 32.016 C 50.159 31.976 52.361 32.924 53.910 34.620 Z"),
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
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null
