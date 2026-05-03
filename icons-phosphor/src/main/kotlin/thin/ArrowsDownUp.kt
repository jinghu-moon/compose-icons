package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorThinIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 114.830 173.170 C 115.581 173.920 116.003 174.938 116.003 176.000 C 116.003 177.062 115.581 178.080 114.830 178.830 L 82.830 210.830 C 82.080 211.581 81.062 212.003 80.000 212.003 C 78.938 212.003 77.920 211.581 77.170 210.830 L 45.170 178.830 C 43.607 177.267 43.607 174.733 45.170 173.170 C 46.733 171.607 49.267 171.607 50.830 173.170 L 76.000 198.340 L 76.000 48.000 C 76.000 45.791 77.791 44.000 80.000 44.000 C 82.209 44.000 84.000 45.791 84.000 48.000 L 84.000 198.340 L 109.170 173.170 C 109.920 172.419 110.938 171.997 112.000 171.997 C 113.062 171.997 114.080 172.419 114.830 173.170 ZM 210.830 77.170 L 178.830 45.170 C 178.080 44.419 177.062 43.997 176.000 43.997 C 174.938 43.997 173.920 44.419 173.170 45.170 L 141.170 77.170 C 139.607 78.733 139.607 81.267 141.170 82.830 C 142.733 84.393 145.267 84.393 146.830 82.830 L 172.000 57.660 L 172.000 208.000 C 172.000 210.209 173.791 212.000 176.000 212.000 C 178.209 212.000 180.000 210.209 180.000 208.000 L 180.000 57.660 L 205.170 82.830 C 206.733 84.393 209.267 84.393 210.830 82.830 C 212.393 81.267 212.393 78.733 210.830 77.170 Z"),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
