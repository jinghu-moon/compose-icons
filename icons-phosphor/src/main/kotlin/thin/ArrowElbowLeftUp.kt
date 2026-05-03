package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorThinIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 192.000 C 236.000 194.209 234.209 196.000 232.000 196.000 L 88.000 196.000 C 85.791 196.000 84.000 194.209 84.000 192.000 L 84.000 57.660 L 42.830 98.830 C 41.267 100.393 38.733 100.393 37.170 98.830 C 35.607 97.267 35.607 94.733 37.170 93.170 L 85.170 45.170 C 85.920 44.419 86.938 43.997 88.000 43.997 C 89.062 43.997 90.080 44.419 90.830 45.170 L 138.830 93.170 C 140.393 94.733 140.393 97.267 138.830 98.830 C 137.267 100.393 134.733 100.393 133.170 98.830 L 92.000 57.660 L 92.000 188.000 L 232.000 188.000 C 234.209 188.000 236.000 189.791 236.000 192.000 Z"),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
