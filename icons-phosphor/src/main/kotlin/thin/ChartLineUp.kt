package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorThinIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 32.000 212.000 C 29.791 212.000 28.000 210.209 28.000 208.000 L 28.000 48.000 C 28.000 45.791 29.791 44.000 32.000 44.000 C 34.209 44.000 36.000 45.791 36.000 48.000 L 36.000 166.340 L 93.170 109.170 C 93.920 108.419 94.938 107.997 96.000 107.997 C 97.062 107.997 98.080 108.419 98.830 109.170 L 128.000 138.340 L 190.340 76.000 L 160.000 76.000 C 157.791 76.000 156.000 74.209 156.000 72.000 C 156.000 69.791 157.791 68.000 160.000 68.000 L 200.000 68.000 C 202.209 68.000 204.000 69.791 204.000 72.000 L 204.000 112.000 C 204.000 114.209 202.209 116.000 200.000 116.000 C 197.791 116.000 196.000 114.209 196.000 112.000 L 196.000 81.660 L 130.830 146.830 C 130.080 147.581 129.062 148.003 128.000 148.003 C 126.938 148.003 125.920 147.581 125.170 146.830 L 96.000 117.660 L 36.000 177.660 L 36.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 205.791 228.000 208.000 Z"),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
