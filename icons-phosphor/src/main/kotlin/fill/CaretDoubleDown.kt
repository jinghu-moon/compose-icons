package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorFillIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 215.390 132.940 C 216.630 135.929 215.947 139.371 213.660 141.660 L 133.660 221.660 C 132.159 223.162 130.123 224.006 128.000 224.006 C 125.877 224.006 123.841 223.162 122.340 221.660 L 42.340 141.660 C 40.049 139.372 39.364 135.929 40.603 132.938 C 41.842 129.947 44.762 127.997 48.000 128.000 L 108.690 128.000 L 42.340 61.660 C 40.049 59.372 39.364 55.929 40.603 52.938 C 41.842 49.947 44.762 47.997 48.000 48.000 L 208.000 48.000 C 211.238 47.997 214.158 49.947 215.397 52.938 C 216.636 55.929 215.951 59.372 213.660 61.660 L 147.310 128.000 L 208.000 128.000 C 211.236 128.001 214.152 129.950 215.390 132.940 Z"),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
