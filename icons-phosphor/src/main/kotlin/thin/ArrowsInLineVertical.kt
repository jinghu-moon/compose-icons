package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorThinIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 40.000 132.000 C 37.791 132.000 36.000 130.209 36.000 128.000 C 36.000 125.791 37.791 124.000 40.000 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 ZM 125.170 98.830 C 125.920 99.581 126.938 100.003 128.000 100.003 C 129.062 100.003 130.080 99.581 130.830 98.830 L 162.830 66.830 C 164.393 65.267 164.393 62.733 162.830 61.170 C 161.267 59.607 158.733 59.607 157.170 61.170 L 132.000 86.340 L 132.000 16.000 C 132.000 13.791 130.209 12.000 128.000 12.000 C 125.791 12.000 124.000 13.791 124.000 16.000 L 124.000 86.340 L 98.830 61.170 C 97.267 59.607 94.733 59.607 93.170 61.170 C 91.607 62.733 91.607 65.267 93.170 66.830 ZM 130.830 157.170 C 130.080 156.419 129.062 155.997 128.000 155.997 C 126.938 155.997 125.920 156.419 125.170 157.170 L 93.170 189.170 C 91.607 190.733 91.607 193.267 93.170 194.830 C 94.733 196.393 97.267 196.393 98.830 194.830 L 124.000 169.660 L 124.000 240.000 C 124.000 242.209 125.791 244.000 128.000 244.000 C 130.209 244.000 132.000 242.209 132.000 240.000 L 132.000 169.660 L 157.170 194.830 C 158.733 196.393 161.267 196.393 162.830 194.830 C 164.393 193.267 164.393 190.733 162.830 189.170 Z"),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
