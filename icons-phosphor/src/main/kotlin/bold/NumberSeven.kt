package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorBoldIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 179.490 51.450 L 131.490 211.450 C 129.967 216.524 125.297 219.999 120.000 220.000 C 118.831 220.002 117.668 219.830 116.550 219.490 C 110.222 217.566 106.643 210.884 108.550 204.550 L 151.870 60.000 L 88.000 60.000 C 81.373 60.000 76.000 54.627 76.000 48.000 C 76.000 41.373 81.373 36.000 88.000 36.000 L 168.000 36.000 C 171.793 36.001 175.362 37.795 177.626 40.839 C 179.889 43.883 180.580 47.817 179.490 51.450 Z"),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
