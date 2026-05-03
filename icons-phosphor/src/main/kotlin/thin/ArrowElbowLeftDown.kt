package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorThinIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 72.000 C 236.000 74.209 234.209 76.000 232.000 76.000 L 92.000 76.000 L 92.000 206.340 L 133.170 165.170 C 134.733 163.607 137.267 163.607 138.830 165.170 C 140.393 166.733 140.393 169.267 138.830 170.830 L 90.830 218.830 C 90.080 219.581 89.062 220.003 88.000 220.003 C 86.938 220.003 85.920 219.581 85.170 218.830 L 37.170 170.830 C 35.607 169.267 35.607 166.733 37.170 165.170 C 38.733 163.607 41.267 163.607 42.830 165.170 L 84.000 206.340 L 84.000 72.000 C 84.000 69.791 85.791 68.000 88.000 68.000 L 232.000 68.000 C 234.209 68.000 236.000 69.791 236.000 72.000 Z"),
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
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
