package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorThinIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.240 130.340 L 183.240 202.340 C 182.488 203.379 181.283 203.994 180.000 203.994 C 178.717 203.994 177.512 203.379 176.760 202.340 L 76.000 62.830 L 27.240 130.340 C 26.430 131.564 25.014 132.247 23.552 132.117 C 22.089 131.988 20.815 131.068 20.233 129.720 C 19.650 128.372 19.852 126.814 20.760 125.660 L 72.760 53.660 C 73.512 52.621 74.717 52.006 76.000 52.006 C 77.283 52.006 78.488 52.621 79.240 53.660 L 180.000 193.170 L 228.760 125.660 C 230.086 123.974 232.507 123.634 234.246 124.890 C 235.985 126.146 236.424 128.551 235.240 130.340 Z"),
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
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
