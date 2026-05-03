package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorFillIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.660 133.660 L 141.660 213.660 C 139.372 215.951 135.929 216.636 132.938 215.397 C 129.947 214.158 127.997 211.238 128.000 208.000 L 128.000 147.310 L 61.660 213.660 C 59.372 215.951 55.929 216.636 52.938 215.397 C 49.947 214.158 47.997 211.238 48.000 208.000 L 48.000 48.000 C 47.997 44.762 49.947 41.842 52.938 40.603 C 55.929 39.364 59.372 40.049 61.660 42.340 L 128.000 108.690 L 128.000 48.000 C 127.997 44.762 129.947 41.842 132.938 40.603 C 135.929 39.364 139.372 40.049 141.660 42.340 L 221.660 122.340 C 223.162 123.841 224.006 125.877 224.006 128.000 C 224.006 130.123 223.162 132.159 221.660 133.660 Z"),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
