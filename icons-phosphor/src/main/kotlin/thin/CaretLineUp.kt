package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorThinIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.830 194.830 C 210.080 195.581 209.062 196.003 208.000 196.003 C 206.938 196.003 205.920 195.581 205.170 194.830 L 128.000 117.660 L 50.830 194.830 C 49.267 196.393 46.733 196.393 45.170 194.830 C 43.607 193.267 43.607 190.733 45.170 189.170 L 125.170 109.170 C 125.920 108.419 126.938 107.997 128.000 107.997 C 129.062 107.997 130.080 108.419 130.830 109.170 L 210.830 189.170 C 211.581 189.920 212.003 190.938 212.003 192.000 C 212.003 193.062 211.581 194.080 210.830 194.830 ZM 48.000 76.000 L 208.000 76.000 C 210.209 76.000 212.000 74.209 212.000 72.000 C 212.000 69.791 210.209 68.000 208.000 68.000 L 48.000 68.000 C 45.791 68.000 44.000 69.791 44.000 72.000 C 44.000 74.209 45.791 76.000 48.000 76.000 Z"),
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
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null
