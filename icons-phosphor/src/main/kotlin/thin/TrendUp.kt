package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorThinIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 56.000 L 236.000 120.000 C 236.000 122.209 234.209 124.000 232.000 124.000 C 229.791 124.000 228.000 122.209 228.000 120.000 L 228.000 65.660 L 138.830 154.830 C 138.080 155.581 137.062 156.003 136.000 156.003 C 134.938 156.003 133.920 155.581 133.170 154.830 L 96.000 117.660 L 26.830 186.830 C 25.267 188.393 22.733 188.393 21.170 186.830 C 19.607 185.267 19.607 182.733 21.170 181.170 L 93.170 109.170 C 93.920 108.419 94.938 107.997 96.000 107.997 C 97.062 107.997 98.080 108.419 98.830 109.170 L 136.000 146.340 L 222.340 60.000 L 168.000 60.000 C 165.791 60.000 164.000 58.209 164.000 56.000 C 164.000 53.791 165.791 52.000 168.000 52.000 L 232.000 52.000 C 234.209 52.000 236.000 53.791 236.000 56.000 Z"),
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
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
