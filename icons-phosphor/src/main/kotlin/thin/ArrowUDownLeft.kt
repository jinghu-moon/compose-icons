package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorThinIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 112.000 C 227.961 145.121 201.121 171.961 168.000 172.000 L 41.660 172.000 L 82.830 213.170 C 84.393 214.733 84.393 217.267 82.830 218.830 C 81.267 220.393 78.733 220.393 77.170 218.830 L 29.170 170.830 C 28.419 170.080 27.997 169.062 27.997 168.000 C 27.997 166.938 28.419 165.920 29.170 165.170 L 77.170 117.170 C 78.733 115.607 81.267 115.607 82.830 117.170 C 84.393 118.733 84.393 121.267 82.830 122.830 L 41.660 164.000 L 168.000 164.000 C 196.719 164.000 220.000 140.719 220.000 112.000 C 220.000 83.281 196.719 60.000 168.000 60.000 L 80.000 60.000 C 77.791 60.000 76.000 58.209 76.000 56.000 C 76.000 53.791 77.791 52.000 80.000 52.000 L 168.000 52.000 C 201.121 52.039 227.961 78.879 228.000 112.000 Z"),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
