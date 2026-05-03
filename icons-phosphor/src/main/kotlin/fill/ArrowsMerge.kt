package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorFillIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 40.000 L 192.000 104.000 C 192.002 106.122 191.160 108.158 189.660 109.660 L 136.000 163.310 L 136.000 192.000 L 160.000 192.000 C 163.238 191.997 166.158 193.947 167.397 196.938 C 168.636 199.929 167.951 203.372 165.660 205.660 L 133.660 237.660 C 132.159 239.162 130.123 240.006 128.000 240.006 C 125.877 240.006 123.841 239.162 122.340 237.660 L 90.340 205.660 C 88.049 203.372 87.364 199.929 88.603 196.938 C 89.842 193.947 92.762 191.997 96.000 192.000 L 120.000 192.000 L 120.000 163.310 L 66.340 109.660 C 64.840 108.158 63.998 106.122 64.000 104.000 L 64.000 40.000 C 64.000 35.582 67.582 32.000 72.000 32.000 C 76.418 32.000 80.000 35.582 80.000 40.000 L 80.000 100.690 L 128.000 148.690 L 176.000 100.690 L 176.000 40.000 C 176.000 35.582 179.582 32.000 184.000 32.000 C 188.418 32.000 192.000 35.582 192.000 40.000 Z"),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
