package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorThinIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 80.000 L 204.000 168.000 C 204.000 201.137 177.137 228.000 144.000 228.000 C 110.863 228.000 84.000 201.137 84.000 168.000 L 84.000 41.660 L 42.830 82.830 C 41.267 84.393 38.733 84.393 37.170 82.830 C 35.607 81.267 35.607 78.733 37.170 77.170 L 85.170 29.170 C 85.920 28.419 86.938 27.997 88.000 27.997 C 89.062 27.997 90.080 28.419 90.830 29.170 L 138.830 77.170 C 140.393 78.733 140.393 81.267 138.830 82.830 C 137.267 84.393 134.733 84.393 133.170 82.830 L 92.000 41.660 L 92.000 168.000 C 92.000 196.719 115.281 220.000 144.000 220.000 C 172.719 220.000 196.000 196.719 196.000 168.000 L 196.000 80.000 C 196.000 77.791 197.791 76.000 200.000 76.000 C 202.209 76.000 204.000 77.791 204.000 80.000 Z"),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
