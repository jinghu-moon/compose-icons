package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorThinIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 138.830 130.830 L 58.830 210.830 C 57.267 212.393 54.733 212.393 53.170 210.830 C 51.607 209.267 51.607 206.733 53.170 205.170 L 130.340 128.000 L 53.170 50.830 C 51.607 49.267 51.607 46.733 53.170 45.170 C 54.733 43.607 57.267 43.607 58.830 45.170 L 138.830 125.170 C 139.581 125.920 140.003 126.938 140.003 128.000 C 140.003 129.062 139.581 130.080 138.830 130.830 ZM 218.830 125.170 L 138.830 45.170 C 137.267 43.607 134.733 43.607 133.170 45.170 C 131.607 46.733 131.607 49.267 133.170 50.830 L 210.340 128.000 L 133.170 205.170 C 131.607 206.733 131.607 209.267 133.170 210.830 C 134.733 212.393 137.267 212.393 138.830 210.830 L 218.830 130.830 C 219.581 130.080 220.003 129.062 220.003 128.000 C 220.003 126.938 219.581 125.920 218.830 125.170 Z"),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
