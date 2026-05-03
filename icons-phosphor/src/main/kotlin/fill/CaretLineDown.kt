package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorFillIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 42.340 77.660 C 40.049 75.372 39.364 71.929 40.603 68.938 C 41.842 65.947 44.762 63.997 48.000 64.000 L 208.000 64.000 C 211.238 63.997 214.158 65.947 215.397 68.938 C 216.636 71.929 215.951 75.372 213.660 77.660 L 133.660 157.660 C 132.159 159.162 130.123 160.006 128.000 160.006 C 125.877 160.006 123.841 159.162 122.340 157.660 ZM 208.000 184.000 L 48.000 184.000 C 43.582 184.000 40.000 187.582 40.000 192.000 C 40.000 196.418 43.582 200.000 48.000 200.000 L 208.000 200.000 C 212.418 200.000 216.000 196.418 216.000 192.000 C 216.000 187.582 212.418 184.000 208.000 184.000 Z"),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
