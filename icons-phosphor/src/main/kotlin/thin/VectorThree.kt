package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorThinIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.830 138.830 L 202.830 170.830 C 201.267 172.393 198.733 172.393 197.170 170.830 C 195.607 169.267 195.607 166.733 197.170 165.170 L 222.340 140.000 L 121.660 140.000 L 57.660 204.000 L 96.000 204.000 C 98.209 204.000 100.000 205.791 100.000 208.000 C 100.000 210.209 98.209 212.000 96.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 160.000 C 44.000 157.791 45.791 156.000 48.000 156.000 C 50.209 156.000 52.000 157.791 52.000 160.000 L 52.000 198.340 L 116.000 134.340 L 116.000 33.660 L 90.830 58.830 C 89.267 60.393 86.733 60.393 85.170 58.830 C 83.607 57.267 83.607 54.733 85.170 53.170 L 117.170 21.170 C 117.920 20.419 118.938 19.997 120.000 19.997 C 121.062 19.997 122.080 20.419 122.830 21.170 L 154.830 53.170 C 156.393 54.733 156.393 57.267 154.830 58.830 C 153.267 60.393 150.733 60.393 149.170 58.830 L 124.000 33.660 L 124.000 132.000 L 222.340 132.000 L 197.170 106.830 C 195.607 105.267 195.607 102.733 197.170 101.170 C 198.733 99.607 201.267 99.607 202.830 101.170 L 234.830 133.170 C 235.581 133.920 236.003 134.938 236.003 136.000 C 236.003 137.062 235.581 138.080 234.830 138.830 Z"),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
