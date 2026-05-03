package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorFillIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 167.390 196.940 C 168.630 199.929 167.947 203.371 165.660 205.660 L 133.660 237.660 C 132.159 239.162 130.123 240.006 128.000 240.006 C 125.877 240.006 123.841 239.162 122.340 237.660 L 90.340 205.660 C 88.049 203.372 87.364 199.929 88.603 196.938 C 89.842 193.947 92.762 191.997 96.000 192.000 L 120.000 192.000 L 120.000 64.000 L 96.000 64.000 C 92.762 64.003 89.842 62.053 88.603 59.062 C 87.364 56.071 88.049 52.628 90.340 50.340 L 122.340 18.340 C 123.841 16.838 125.877 15.994 128.000 15.994 C 130.123 15.994 132.159 16.838 133.660 18.340 L 165.660 50.340 C 167.951 52.628 168.636 56.071 167.397 59.062 C 166.158 62.053 163.238 64.003 160.000 64.000 L 136.000 64.000 L 136.000 192.000 L 160.000 192.000 C 163.236 192.001 166.152 193.950 167.390 196.940 Z"),
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
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
