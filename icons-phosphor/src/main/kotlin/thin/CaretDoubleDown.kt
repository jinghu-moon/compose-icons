package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorThinIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.830 133.170 C 211.581 133.920 212.003 134.938 212.003 136.000 C 212.003 137.062 211.581 138.080 210.830 138.830 L 130.830 218.830 C 130.080 219.581 129.062 220.003 128.000 220.003 C 126.938 220.003 125.920 219.581 125.170 218.830 L 45.170 138.830 C 43.607 137.267 43.607 134.733 45.170 133.170 C 46.733 131.607 49.267 131.607 50.830 133.170 L 128.000 210.340 L 205.170 133.170 C 205.920 132.419 206.938 131.997 208.000 131.997 C 209.062 131.997 210.080 132.419 210.830 133.170 ZM 125.170 138.830 C 125.920 139.581 126.938 140.003 128.000 140.003 C 129.062 140.003 130.080 139.581 130.830 138.830 L 210.830 58.830 C 212.393 57.267 212.393 54.733 210.830 53.170 C 209.267 51.607 206.733 51.607 205.170 53.170 L 128.000 130.340 L 50.830 53.170 C 49.267 51.607 46.733 51.607 45.170 53.170 C 43.607 54.733 43.607 57.267 45.170 58.830 Z"),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
