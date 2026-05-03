package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorThinIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 144.000 C 227.961 177.121 201.121 203.961 168.000 204.000 L 80.000 204.000 C 77.791 204.000 76.000 202.209 76.000 200.000 C 76.000 197.791 77.791 196.000 80.000 196.000 L 168.000 196.000 C 196.719 196.000 220.000 172.719 220.000 144.000 C 220.000 115.281 196.719 92.000 168.000 92.000 L 41.660 92.000 L 82.830 133.170 C 84.393 134.733 84.393 137.267 82.830 138.830 C 81.267 140.393 78.733 140.393 77.170 138.830 L 29.170 90.830 C 28.419 90.080 27.997 89.062 27.997 88.000 C 27.997 86.938 28.419 85.920 29.170 85.170 L 77.170 37.170 C 78.733 35.607 81.267 35.607 82.830 37.170 C 84.393 38.733 84.393 41.267 82.830 42.830 L 41.660 84.000 L 168.000 84.000 C 201.121 84.039 227.961 110.879 228.000 144.000 Z"),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
