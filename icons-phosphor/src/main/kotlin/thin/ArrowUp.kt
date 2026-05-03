package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorThinIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 202.830 114.830 C 202.080 115.581 201.062 116.003 200.000 116.003 C 198.938 116.003 197.920 115.581 197.170 114.830 L 132.000 49.660 L 132.000 216.000 C 132.000 218.209 130.209 220.000 128.000 220.000 C 125.791 220.000 124.000 218.209 124.000 216.000 L 124.000 49.660 L 58.830 114.830 C 57.267 116.393 54.733 116.393 53.170 114.830 C 51.607 113.267 51.607 110.733 53.170 109.170 L 125.170 37.170 C 125.920 36.419 126.938 35.997 128.000 35.997 C 129.062 35.997 130.080 36.419 130.830 37.170 L 202.830 109.170 C 203.581 109.920 204.003 110.938 204.003 112.000 C 204.003 113.062 203.581 114.080 202.830 114.830 Z"),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
