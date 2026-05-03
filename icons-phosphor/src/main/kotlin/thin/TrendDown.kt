package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorThinIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 128.000 L 236.000 192.000 C 236.000 194.209 234.209 196.000 232.000 196.000 L 168.000 196.000 C 165.791 196.000 164.000 194.209 164.000 192.000 C 164.000 189.791 165.791 188.000 168.000 188.000 L 222.340 188.000 L 136.000 101.660 L 98.830 138.830 C 98.080 139.581 97.062 140.003 96.000 140.003 C 94.938 140.003 93.920 139.581 93.170 138.830 L 21.170 66.830 C 19.607 65.267 19.607 62.733 21.170 61.170 C 22.733 59.607 25.267 59.607 26.830 61.170 L 96.000 130.340 L 133.170 93.170 C 133.920 92.419 134.938 91.997 136.000 91.997 C 137.062 91.997 138.080 92.419 138.830 93.170 L 228.000 182.340 L 228.000 128.000 C 228.000 125.791 229.791 124.000 232.000 124.000 C 234.209 124.000 236.000 125.791 236.000 128.000 Z"),
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
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
