package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorThinIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 93.170 58.830 C 92.419 58.080 91.997 57.062 91.997 56.000 C 91.997 54.938 92.419 53.920 93.170 53.170 L 125.170 21.170 C 125.920 20.419 126.938 19.997 128.000 19.997 C 129.062 19.997 130.080 20.419 130.830 21.170 L 162.830 53.170 C 164.393 54.733 164.393 57.267 162.830 58.830 C 161.267 60.393 158.733 60.393 157.170 58.830 L 132.000 33.660 L 132.000 96.000 C 132.000 98.209 130.209 100.000 128.000 100.000 C 125.791 100.000 124.000 98.209 124.000 96.000 L 124.000 33.660 L 98.830 58.830 C 98.080 59.581 97.062 60.003 96.000 60.003 C 94.938 60.003 93.920 59.581 93.170 58.830 ZM 157.170 197.170 L 132.000 222.340 L 132.000 160.000 C 132.000 157.791 130.209 156.000 128.000 156.000 C 125.791 156.000 124.000 157.791 124.000 160.000 L 124.000 222.340 L 98.830 197.170 C 97.267 195.607 94.733 195.607 93.170 197.170 C 91.607 198.733 91.607 201.267 93.170 202.830 L 125.170 234.830 C 125.920 235.581 126.938 236.003 128.000 236.003 C 129.062 236.003 130.080 235.581 130.830 234.830 L 162.830 202.830 C 164.393 201.267 164.393 198.733 162.830 197.170 C 161.267 195.607 158.733 195.607 157.170 197.170 ZM 234.830 125.170 L 202.830 93.170 C 201.267 91.607 198.733 91.607 197.170 93.170 C 195.607 94.733 195.607 97.267 197.170 98.830 L 222.340 124.000 L 160.000 124.000 C 157.791 124.000 156.000 125.791 156.000 128.000 C 156.000 130.209 157.791 132.000 160.000 132.000 L 222.340 132.000 L 197.170 157.170 C 195.607 158.733 195.607 161.267 197.170 162.830 C 198.733 164.393 201.267 164.393 202.830 162.830 L 234.830 130.830 C 235.581 130.080 236.003 129.062 236.003 128.000 C 236.003 126.938 235.581 125.920 234.830 125.170 ZM 33.660 132.000 L 96.000 132.000 C 98.209 132.000 100.000 130.209 100.000 128.000 C 100.000 125.791 98.209 124.000 96.000 124.000 L 33.660 124.000 L 58.830 98.830 C 60.393 97.267 60.393 94.733 58.830 93.170 C 57.267 91.607 54.733 91.607 53.170 93.170 L 21.170 125.170 C 20.419 125.920 19.997 126.938 19.997 128.000 C 19.997 129.062 20.419 130.080 21.170 130.830 L 53.170 162.830 C 54.733 164.393 57.267 164.393 58.830 162.830 C 60.393 161.267 60.393 158.733 58.830 157.170 Z"),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
