package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorBoldIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 208.000 C 236.000 214.627 230.627 220.000 224.000 220.000 L 32.000 220.000 C 25.373 220.000 20.000 214.627 20.000 208.000 L 20.000 48.000 C 20.000 41.373 25.373 36.000 32.000 36.000 C 38.627 36.000 44.000 41.373 44.000 48.000 L 44.000 133.550 L 88.100 95.000 C 92.367 91.267 98.664 91.029 103.200 94.430 L 159.420 136.590 L 216.100 87.000 C 219.264 83.842 223.922 82.704 228.186 84.049 C 232.450 85.393 235.613 88.996 236.393 93.399 C 237.173 97.801 235.442 102.272 231.900 105.000 L 167.900 161.000 C 163.633 164.733 157.336 164.971 152.800 161.570 L 96.580 119.440 L 44.000 165.450 L 44.000 196.000 L 224.000 196.000 C 230.627 196.000 236.000 201.373 236.000 208.000 Z"),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
