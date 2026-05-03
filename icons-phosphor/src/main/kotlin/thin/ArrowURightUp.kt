package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorThinIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 218.830 82.830 C 218.080 83.581 217.062 84.003 216.000 84.003 C 214.938 84.003 213.920 83.581 213.170 82.830 L 172.000 41.660 L 172.000 168.000 C 172.000 201.137 145.137 228.000 112.000 228.000 C 78.863 228.000 52.000 201.137 52.000 168.000 L 52.000 80.000 C 52.000 77.791 53.791 76.000 56.000 76.000 C 58.209 76.000 60.000 77.791 60.000 80.000 L 60.000 168.000 C 60.000 196.719 83.281 220.000 112.000 220.000 C 140.719 220.000 164.000 196.719 164.000 168.000 L 164.000 41.660 L 122.830 82.830 C 121.267 84.393 118.733 84.393 117.170 82.830 C 115.607 81.267 115.607 78.733 117.170 77.170 L 165.170 29.170 C 165.920 28.419 166.938 27.997 168.000 27.997 C 169.062 27.997 170.080 28.419 170.830 29.170 L 218.830 77.170 C 219.581 77.920 220.003 78.938 220.003 80.000 C 220.003 81.062 219.581 82.080 218.830 82.830 Z"),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
