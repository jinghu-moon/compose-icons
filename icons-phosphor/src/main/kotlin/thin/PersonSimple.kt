package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorThinIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.430 130.060 C 226.884 130.970 225.999 131.626 224.969 131.882 C 223.939 132.139 222.850 131.977 221.940 131.430 C 221.560 131.200 184.070 109.140 132.000 108.050 L 132.000 150.480 L 195.000 221.340 C 196.469 222.997 196.317 225.531 194.660 227.000 C 193.003 228.469 190.469 228.317 189.000 226.660 L 128.000 158.000 L 67.000 226.660 C 65.531 228.317 62.997 228.469 61.340 227.000 C 59.683 225.531 59.531 222.997 61.000 221.340 L 124.000 150.480 L 124.000 108.050 C 71.930 109.140 34.440 131.200 34.060 131.430 C 32.166 132.568 29.708 131.954 28.570 130.060 C 27.432 128.166 28.046 125.708 29.940 124.570 C 31.610 123.570 71.540 100.000 128.000 100.000 C 184.460 100.000 224.390 123.570 226.060 124.570 C 226.970 125.116 227.626 126.001 227.882 127.031 C 228.139 128.061 227.977 129.150 227.430 130.060 ZM 100.000 48.000 C 100.000 32.536 112.536 20.000 128.000 20.000 C 143.464 20.000 156.000 32.536 156.000 48.000 C 156.000 63.464 143.464 76.000 128.000 76.000 C 112.536 76.000 100.000 63.464 100.000 48.000 ZM 108.000 48.000 C 108.000 59.046 116.954 68.000 128.000 68.000 C 139.046 68.000 148.000 59.046 148.000 48.000 C 148.000 36.954 139.046 28.000 128.000 28.000 C 116.954 28.000 108.000 36.954 108.000 48.000 Z"),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
