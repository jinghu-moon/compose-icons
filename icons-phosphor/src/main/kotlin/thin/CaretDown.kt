package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = phosphorThinIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.830 98.830 L 130.830 178.830 C 130.080 179.581 129.062 180.003 128.000 180.003 C 126.938 180.003 125.920 179.581 125.170 178.830 L 45.170 98.830 C 43.607 97.267 43.607 94.733 45.170 93.170 C 46.733 91.607 49.267 91.607 50.830 93.170 L 128.000 170.340 L 205.170 93.170 C 206.733 91.607 209.267 91.607 210.830 93.170 C 212.393 94.733 212.393 97.267 210.830 98.830 Z"),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
