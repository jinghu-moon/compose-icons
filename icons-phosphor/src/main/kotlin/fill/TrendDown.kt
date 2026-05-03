package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorFillIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 128.000 L 240.000 192.000 C 240.000 196.418 236.418 200.000 232.000 200.000 L 168.000 200.000 C 164.762 200.003 161.842 198.053 160.603 195.062 C 159.364 192.071 160.049 188.628 162.340 186.340 L 188.690 160.000 L 136.000 107.310 L 101.660 141.660 C 100.159 143.162 98.123 144.006 96.000 144.006 C 93.877 144.006 91.841 143.162 90.340 141.660 L 18.340 69.660 C 15.214 66.534 15.214 61.466 18.340 58.340 C 21.466 55.214 26.534 55.214 29.660 58.340 L 96.000 124.690 L 130.340 90.340 C 131.841 88.838 133.877 87.994 136.000 87.994 C 138.123 87.994 140.159 88.838 141.660 90.340 L 200.000 148.690 L 226.340 122.340 C 228.628 120.049 232.071 119.364 235.062 120.603 C 238.053 121.842 240.003 124.762 240.000 128.000 Z"),
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
