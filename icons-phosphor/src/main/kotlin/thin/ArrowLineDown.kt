package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorThinIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 53.170 114.830 C 51.607 113.267 51.607 110.733 53.170 109.170 C 54.733 107.607 57.267 107.607 58.830 109.170 L 124.000 174.340 L 124.000 32.000 C 124.000 29.791 125.791 28.000 128.000 28.000 C 130.209 28.000 132.000 29.791 132.000 32.000 L 132.000 174.340 L 197.170 109.170 C 198.733 107.607 201.267 107.607 202.830 109.170 C 204.393 110.733 204.393 113.267 202.830 114.830 L 130.830 186.830 C 130.080 187.581 129.062 188.003 128.000 188.003 C 126.938 188.003 125.920 187.581 125.170 186.830 ZM 216.000 212.000 L 40.000 212.000 C 37.791 212.000 36.000 213.791 36.000 216.000 C 36.000 218.209 37.791 220.000 40.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 C 220.000 213.791 218.209 212.000 216.000 212.000 Z"),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
