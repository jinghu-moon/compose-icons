package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorBoldIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 56.000 L 244.000 120.000 C 244.000 126.627 238.627 132.000 232.000 132.000 C 225.373 132.000 220.000 126.627 220.000 120.000 L 220.000 85.000 L 144.490 160.520 C 142.238 162.779 139.180 164.049 135.990 164.049 C 132.800 164.049 129.742 162.779 127.490 160.520 L 96.000 129.000 L 32.490 192.490 C 27.796 197.184 20.184 197.184 15.490 192.490 C 10.796 187.796 10.796 180.184 15.490 175.490 L 87.490 103.490 C 89.742 101.231 92.800 99.961 95.990 99.961 C 99.180 99.961 102.238 101.231 104.490 103.490 L 136.000 135.000 L 203.000 68.000 L 168.000 68.000 C 161.373 68.000 156.000 62.627 156.000 56.000 C 156.000 49.373 161.373 44.000 168.000 44.000 L 232.000 44.000 C 238.627 44.000 244.000 49.373 244.000 56.000 Z"),
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
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
