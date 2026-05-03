package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorBoldIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 128.000 L 244.000 192.000 C 244.000 198.627 238.627 204.000 232.000 204.000 L 168.000 204.000 C 161.373 204.000 156.000 198.627 156.000 192.000 C 156.000 185.373 161.373 180.000 168.000 180.000 L 203.000 180.000 L 136.000 113.000 L 104.490 144.520 C 102.238 146.779 99.180 148.049 95.990 148.049 C 92.800 148.049 89.742 146.779 87.490 144.520 L 15.490 72.520 C 10.796 67.826 10.796 60.214 15.490 55.520 C 20.184 50.826 27.796 50.826 32.490 55.520 L 96.000 119.000 L 127.510 87.480 C 129.762 85.221 132.820 83.951 136.010 83.951 C 139.200 83.951 142.258 85.221 144.510 87.480 L 220.000 163.000 L 220.000 128.000 C 220.000 121.373 225.373 116.000 232.000 116.000 C 238.627 116.000 244.000 121.373 244.000 128.000 Z"),
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
