package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorThinIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.830 194.830 L 194.830 226.830 C 193.267 228.393 190.733 228.393 189.170 226.830 C 187.607 225.267 187.607 222.733 189.170 221.170 L 214.340 196.000 L 80.000 196.000 C 77.791 196.000 76.000 194.209 76.000 192.000 L 76.000 49.660 L 50.830 74.830 C 49.267 76.393 46.733 76.393 45.170 74.830 C 43.607 73.267 43.607 70.733 45.170 69.170 L 77.170 37.170 C 77.920 36.419 78.938 35.997 80.000 35.997 C 81.062 35.997 82.080 36.419 82.830 37.170 L 114.830 69.170 C 116.393 70.733 116.393 73.267 114.830 74.830 C 113.267 76.393 110.733 76.393 109.170 74.830 L 84.000 49.660 L 84.000 188.000 L 214.340 188.000 L 189.170 162.830 C 187.607 161.267 187.607 158.733 189.170 157.170 C 190.733 155.607 193.267 155.607 194.830 157.170 L 226.830 189.170 C 227.581 189.920 228.003 190.938 228.003 192.000 C 228.003 193.062 227.581 194.080 226.830 194.830 Z"),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
