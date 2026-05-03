package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorThinIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 45.170 74.830 C 43.607 73.267 43.607 70.733 45.170 69.170 C 46.733 67.607 49.267 67.607 50.830 69.170 L 128.000 146.340 L 205.170 69.170 C 206.733 67.607 209.267 67.607 210.830 69.170 C 212.393 70.733 212.393 73.267 210.830 74.830 L 130.830 154.830 C 130.080 155.581 129.062 156.003 128.000 156.003 C 126.938 156.003 125.920 155.581 125.170 154.830 ZM 208.000 188.000 L 48.000 188.000 C 45.791 188.000 44.000 189.791 44.000 192.000 C 44.000 194.209 45.791 196.000 48.000 196.000 L 208.000 196.000 C 210.209 196.000 212.000 194.209 212.000 192.000 C 212.000 189.791 210.209 188.000 208.000 188.000 Z"),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
