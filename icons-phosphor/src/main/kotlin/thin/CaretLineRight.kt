package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorThinIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 146.830 125.170 C 147.581 125.920 148.003 126.938 148.003 128.000 C 148.003 129.062 147.581 130.080 146.830 130.830 L 66.830 210.830 C 65.267 212.393 62.733 212.393 61.170 210.830 C 59.607 209.267 59.607 206.733 61.170 205.170 L 138.340 128.000 L 61.170 50.830 C 59.607 49.267 59.607 46.733 61.170 45.170 C 62.733 43.607 65.267 43.607 66.830 45.170 ZM 184.000 44.000 C 181.791 44.000 180.000 45.791 180.000 48.000 L 180.000 208.000 C 180.000 210.209 181.791 212.000 184.000 212.000 C 186.209 212.000 188.000 210.209 188.000 208.000 L 188.000 48.000 C 188.000 45.791 186.209 44.000 184.000 44.000 Z"),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
