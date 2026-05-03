package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) return _arrowSquareUp!!
        _arrowSquareUp = phosphorThinIcon(
            name = "ArrowSquareUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 162.830 117.170 C 164.393 118.733 164.393 121.267 162.830 122.830 C 161.267 124.393 158.733 124.393 157.170 122.830 L 132.000 97.660 L 132.000 168.000 C 132.000 170.209 130.209 172.000 128.000 172.000 C 125.791 172.000 124.000 170.209 124.000 168.000 L 124.000 97.660 L 98.830 122.830 C 97.267 124.393 94.733 124.393 93.170 122.830 C 91.607 121.267 91.607 118.733 93.170 117.170 L 125.170 85.170 C 125.920 84.419 126.938 83.997 128.000 83.997 C 129.062 83.997 130.080 84.419 130.830 85.170 Z"),
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
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null
