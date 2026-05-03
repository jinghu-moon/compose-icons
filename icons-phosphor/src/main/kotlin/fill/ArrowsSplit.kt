package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorFillIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.660 189.660 L 197.660 221.660 C 196.159 223.162 194.123 224.006 192.000 224.006 C 189.877 224.006 187.841 223.162 186.340 221.660 L 154.340 189.660 C 152.049 187.372 151.364 183.929 152.603 180.938 C 153.842 177.947 156.762 175.997 160.000 176.000 L 184.000 176.000 L 184.000 139.310 L 128.000 83.310 L 72.000 139.310 L 72.000 176.000 L 96.000 176.000 C 99.238 175.997 102.158 177.947 103.397 180.938 C 104.636 183.929 103.951 187.372 101.660 189.660 L 69.660 221.660 C 68.159 223.162 66.123 224.006 64.000 224.006 C 61.877 224.006 59.841 223.162 58.340 221.660 L 26.340 189.660 C 24.049 187.372 23.364 183.929 24.603 180.938 C 25.842 177.947 28.762 175.997 32.000 176.000 L 56.000 176.000 L 56.000 136.000 C 55.998 133.878 56.840 131.842 58.340 130.340 L 120.000 68.690 L 120.000 24.000 C 120.000 19.582 123.582 16.000 128.000 16.000 C 132.418 16.000 136.000 19.582 136.000 24.000 L 136.000 68.690 L 197.660 130.340 C 199.160 131.842 200.002 133.878 200.000 136.000 L 200.000 176.000 L 224.000 176.000 C 227.238 175.997 230.158 177.947 231.397 180.938 C 232.636 183.929 231.951 187.372 229.660 189.660 Z"),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
