package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorFillIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 149.660 122.340 C 151.162 123.841 152.006 125.877 152.006 128.000 C 152.006 130.123 151.162 132.159 149.660 133.660 L 69.660 213.660 C 67.372 215.951 63.929 216.636 60.938 215.397 C 57.947 214.158 55.997 211.238 56.000 208.000 L 56.000 48.000 C 55.997 44.762 57.947 41.842 60.938 40.603 C 63.929 39.364 67.372 40.049 69.660 42.340 ZM 184.000 40.000 C 179.582 40.000 176.000 43.582 176.000 48.000 L 176.000 208.000 C 176.000 212.418 179.582 216.000 184.000 216.000 C 188.418 216.000 192.000 212.418 192.000 208.000 L 192.000 48.000 C 192.000 43.582 188.418 40.000 184.000 40.000 Z"),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
