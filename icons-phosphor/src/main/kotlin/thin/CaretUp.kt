package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorThinIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.830 162.830 C 210.080 163.581 209.062 164.003 208.000 164.003 C 206.938 164.003 205.920 163.581 205.170 162.830 L 128.000 85.660 L 50.830 162.830 C 49.267 164.393 46.733 164.393 45.170 162.830 C 43.607 161.267 43.607 158.733 45.170 157.170 L 125.170 77.170 C 125.920 76.419 126.938 75.997 128.000 75.997 C 129.062 75.997 130.080 76.419 130.830 77.170 L 210.830 157.170 C 211.581 157.920 212.003 158.938 212.003 160.000 C 212.003 161.062 211.581 162.080 210.830 162.830 Z"),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
