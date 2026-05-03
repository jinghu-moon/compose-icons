package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorThinIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 93.170 66.830 C 91.607 65.267 91.607 62.733 93.170 61.170 C 94.733 59.607 97.267 59.607 98.830 61.170 L 124.000 86.340 L 124.000 24.000 C 124.000 21.791 125.791 20.000 128.000 20.000 C 130.209 20.000 132.000 21.791 132.000 24.000 L 132.000 86.340 L 157.170 61.170 C 158.733 59.607 161.267 59.607 162.830 61.170 C 164.393 62.733 164.393 65.267 162.830 66.830 L 130.830 98.830 C 130.080 99.581 129.062 100.003 128.000 100.003 C 126.938 100.003 125.920 99.581 125.170 98.830 ZM 130.830 157.170 C 130.080 156.419 129.062 155.997 128.000 155.997 C 126.938 155.997 125.920 156.419 125.170 157.170 L 93.170 189.170 C 91.607 190.733 91.607 193.267 93.170 194.830 C 94.733 196.393 97.267 196.393 98.830 194.830 L 124.000 169.660 L 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 L 132.000 169.660 L 157.170 194.830 C 158.733 196.393 161.267 196.393 162.830 194.830 C 164.393 193.267 164.393 190.733 162.830 189.170 ZM 232.000 124.000 L 169.660 124.000 L 194.830 98.830 C 196.393 97.267 196.393 94.733 194.830 93.170 C 193.267 91.607 190.733 91.607 189.170 93.170 L 157.170 125.170 C 156.419 125.920 155.997 126.938 155.997 128.000 C 155.997 129.062 156.419 130.080 157.170 130.830 L 189.170 162.830 C 190.733 164.393 193.267 164.393 194.830 162.830 C 196.393 161.267 196.393 158.733 194.830 157.170 L 169.660 132.000 L 232.000 132.000 C 234.209 132.000 236.000 130.209 236.000 128.000 C 236.000 125.791 234.209 124.000 232.000 124.000 ZM 98.830 125.170 L 66.830 93.170 C 65.267 91.607 62.733 91.607 61.170 93.170 C 59.607 94.733 59.607 97.267 61.170 98.830 L 86.340 124.000 L 24.000 124.000 C 21.791 124.000 20.000 125.791 20.000 128.000 C 20.000 130.209 21.791 132.000 24.000 132.000 L 86.340 132.000 L 61.170 157.170 C 59.607 158.733 59.607 161.267 61.170 162.830 C 62.733 164.393 65.267 164.393 66.830 162.830 L 98.830 130.830 C 99.581 130.080 100.003 129.062 100.003 128.000 C 100.003 126.938 99.581 125.920 98.830 125.170 Z"),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
