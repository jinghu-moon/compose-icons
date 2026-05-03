package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorBoldIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 208.000 C 236.000 214.627 230.627 220.000 224.000 220.000 L 32.000 220.000 C 25.373 220.000 20.000 214.627 20.000 208.000 L 20.000 48.000 C 20.000 41.373 25.373 36.000 32.000 36.000 C 38.627 36.000 44.000 41.373 44.000 48.000 L 44.000 147.000 L 87.510 103.480 C 89.762 101.221 92.820 99.951 96.010 99.951 C 99.200 99.951 102.258 101.221 104.510 103.480 L 128.000 127.000 L 171.000 84.000 L 160.000 84.000 C 153.373 84.000 148.000 78.627 148.000 72.000 C 148.000 65.373 153.373 60.000 160.000 60.000 L 200.000 60.000 C 206.627 60.000 212.000 65.373 212.000 72.000 L 212.000 112.000 C 212.000 118.627 206.627 124.000 200.000 124.000 C 193.373 124.000 188.000 118.627 188.000 112.000 L 188.000 101.000 L 136.490 152.520 C 134.238 154.779 131.180 156.049 127.990 156.049 C 124.800 156.049 121.742 154.779 119.490 152.520 L 96.000 129.000 L 44.000 181.000 L 44.000 196.000 L 224.000 196.000 C 230.627 196.000 236.000 201.373 236.000 208.000 Z"),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
