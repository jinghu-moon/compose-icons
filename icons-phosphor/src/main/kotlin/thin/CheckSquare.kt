package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) return _checkSquare!!
        _checkSquare = phosphorThinIcon(
            name = "CheckSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 170.830 101.170 C 171.581 101.920 172.003 102.938 172.003 104.000 C 172.003 105.062 171.581 106.080 170.830 106.830 L 114.830 162.830 C 114.080 163.581 113.062 164.003 112.000 164.003 C 110.938 164.003 109.920 163.581 109.170 162.830 L 85.170 138.830 C 83.607 137.267 83.607 134.733 85.170 133.170 C 86.733 131.607 89.267 131.607 90.830 133.170 L 112.000 154.340 L 165.170 101.170 C 165.920 100.419 166.938 99.997 168.000 99.997 C 169.062 99.997 170.080 100.419 170.830 101.170 ZM 220.000 48.000 L 220.000 208.000 C 220.000 214.627 214.627 220.000 208.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 48.000 C 36.000 41.373 41.373 36.000 48.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 208.000 212.000 C 210.209 212.000 212.000 210.209 212.000 208.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
