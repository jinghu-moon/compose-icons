package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorThinIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 40.000 L 132.000 216.000 C 132.000 218.209 130.209 220.000 128.000 220.000 C 125.791 220.000 124.000 218.209 124.000 216.000 L 124.000 40.000 C 124.000 37.791 125.791 36.000 128.000 36.000 C 130.209 36.000 132.000 37.791 132.000 40.000 ZM 66.830 93.170 C 65.267 91.607 62.733 91.607 61.170 93.170 C 59.607 94.733 59.607 97.267 61.170 98.830 L 86.340 124.000 L 16.000 124.000 C 13.791 124.000 12.000 125.791 12.000 128.000 C 12.000 130.209 13.791 132.000 16.000 132.000 L 86.340 132.000 L 61.170 157.170 C 59.607 158.733 59.607 161.267 61.170 162.830 C 62.733 164.393 65.267 164.393 66.830 162.830 L 98.830 130.830 C 99.581 130.080 100.003 129.062 100.003 128.000 C 100.003 126.938 99.581 125.920 98.830 125.170 ZM 240.000 124.000 L 169.660 124.000 L 194.830 98.830 C 196.393 97.267 196.393 94.733 194.830 93.170 C 193.267 91.607 190.733 91.607 189.170 93.170 L 157.170 125.170 C 156.419 125.920 155.997 126.938 155.997 128.000 C 155.997 129.062 156.419 130.080 157.170 130.830 L 189.170 162.830 C 190.733 164.393 193.267 164.393 194.830 162.830 C 196.393 161.267 196.393 158.733 194.830 157.170 L 169.660 132.000 L 240.000 132.000 C 242.209 132.000 244.000 130.209 244.000 128.000 C 244.000 125.791 242.209 124.000 240.000 124.000 Z"),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null
