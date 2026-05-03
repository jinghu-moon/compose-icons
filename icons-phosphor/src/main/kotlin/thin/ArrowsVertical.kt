package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorThinIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 162.830 197.170 C 163.581 197.920 164.003 198.938 164.003 200.000 C 164.003 201.062 163.581 202.080 162.830 202.830 L 130.830 234.830 C 130.080 235.581 129.062 236.003 128.000 236.003 C 126.938 236.003 125.920 235.581 125.170 234.830 L 93.170 202.830 C 91.607 201.267 91.607 198.733 93.170 197.170 C 94.733 195.607 97.267 195.607 98.830 197.170 L 124.000 222.340 L 124.000 33.660 L 98.830 58.830 C 97.267 60.393 94.733 60.393 93.170 58.830 C 91.607 57.267 91.607 54.733 93.170 53.170 L 125.170 21.170 C 125.920 20.419 126.938 19.997 128.000 19.997 C 129.062 19.997 130.080 20.419 130.830 21.170 L 162.830 53.170 C 164.393 54.733 164.393 57.267 162.830 58.830 C 161.267 60.393 158.733 60.393 157.170 58.830 L 132.000 33.660 L 132.000 222.340 L 157.170 197.170 C 157.920 196.419 158.938 195.997 160.000 195.997 C 161.062 195.997 162.080 196.419 162.830 197.170 Z"),
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
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
