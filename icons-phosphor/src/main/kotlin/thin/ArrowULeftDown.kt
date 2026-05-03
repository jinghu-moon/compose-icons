package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorThinIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 88.000 L 204.000 176.000 C 204.000 178.209 202.209 180.000 200.000 180.000 C 197.791 180.000 196.000 178.209 196.000 176.000 L 196.000 88.000 C 196.000 59.281 172.719 36.000 144.000 36.000 C 115.281 36.000 92.000 59.281 92.000 88.000 L 92.000 214.340 L 133.170 173.170 C 134.733 171.607 137.267 171.607 138.830 173.170 C 140.393 174.733 140.393 177.267 138.830 178.830 L 90.830 226.830 C 90.080 227.581 89.062 228.003 88.000 228.003 C 86.938 228.003 85.920 227.581 85.170 226.830 L 37.170 178.830 C 35.607 177.267 35.607 174.733 37.170 173.170 C 38.733 171.607 41.267 171.607 42.830 173.170 L 84.000 214.340 L 84.000 88.000 C 84.000 54.863 110.863 28.000 144.000 28.000 C 177.137 28.000 204.000 54.863 204.000 88.000 Z"),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
