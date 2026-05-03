package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsHorizontal: ImageVector
    get() {
        if (_arrowsHorizontal != null) return _arrowsHorizontal!!
        _arrowsHorizontal = phosphorThinIcon(
            name = "ArrowsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.830 130.830 L 202.830 162.830 C 201.267 164.393 198.733 164.393 197.170 162.830 C 195.607 161.267 195.607 158.733 197.170 157.170 L 222.340 132.000 L 33.660 132.000 L 58.830 157.170 C 60.393 158.733 60.393 161.267 58.830 162.830 C 57.267 164.393 54.733 164.393 53.170 162.830 L 21.170 130.830 C 20.419 130.080 19.997 129.062 19.997 128.000 C 19.997 126.938 20.419 125.920 21.170 125.170 L 53.170 93.170 C 54.733 91.607 57.267 91.607 58.830 93.170 C 60.393 94.733 60.393 97.267 58.830 98.830 L 33.660 124.000 L 222.340 124.000 L 197.170 98.830 C 195.607 97.267 195.607 94.733 197.170 93.170 C 198.733 91.607 201.267 91.607 202.830 93.170 L 234.830 125.170 C 235.581 125.920 236.003 126.938 236.003 128.000 C 236.003 129.062 235.581 130.080 234.830 130.830 Z"),
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
        return _arrowsHorizontal!!
    }

private var _arrowsHorizontal: ImageVector? = null
