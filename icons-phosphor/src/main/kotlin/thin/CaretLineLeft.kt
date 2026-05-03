package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorThinIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 194.830 205.170 C 196.393 206.733 196.393 209.267 194.830 210.830 C 193.267 212.393 190.733 212.393 189.170 210.830 L 109.170 130.830 C 108.419 130.080 107.997 129.062 107.997 128.000 C 107.997 126.938 108.419 125.920 109.170 125.170 L 189.170 45.170 C 190.733 43.607 193.267 43.607 194.830 45.170 C 196.393 46.733 196.393 49.267 194.830 50.830 L 117.660 128.000 ZM 72.000 44.000 C 69.791 44.000 68.000 45.791 68.000 48.000 L 68.000 208.000 C 68.000 210.209 69.791 212.000 72.000 212.000 C 74.209 212.000 76.000 210.209 76.000 208.000 L 76.000 48.000 C 76.000 45.791 74.209 44.000 72.000 44.000 Z"),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null
