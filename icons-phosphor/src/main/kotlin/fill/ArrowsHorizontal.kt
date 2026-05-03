package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsHorizontal: ImageVector
    get() {
        if (_arrowsHorizontal != null) return _arrowsHorizontal!!
        _arrowsHorizontal = phosphorFillIcon(
            name = "ArrowsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 133.660 L 205.660 165.660 C 203.372 167.951 199.929 168.636 196.938 167.397 C 193.947 166.158 191.997 163.238 192.000 160.000 L 192.000 136.000 L 64.000 136.000 L 64.000 160.000 C 64.003 163.238 62.053 166.158 59.062 167.397 C 56.071 168.636 52.628 167.951 50.340 165.660 L 18.340 133.660 C 16.838 132.159 15.994 130.123 15.994 128.000 C 15.994 125.877 16.838 123.841 18.340 122.340 L 50.340 90.340 C 52.628 88.049 56.071 87.364 59.062 88.603 C 62.053 89.842 64.003 92.762 64.000 96.000 L 64.000 120.000 L 192.000 120.000 L 192.000 96.000 C 191.997 92.762 193.947 89.842 196.938 88.603 C 199.929 87.364 203.372 88.049 205.660 90.340 L 237.660 122.340 C 239.162 123.841 240.006 125.877 240.006 128.000 C 240.006 130.123 239.162 132.159 237.660 133.660 Z"),
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
        return _arrowsHorizontal!!
    }

private var _arrowsHorizontal: ImageVector? = null
