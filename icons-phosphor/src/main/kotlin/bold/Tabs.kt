package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorBoldIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 255.490 164.550 L 255.490 164.550 L 255.490 164.490 C 255.495 164.460 255.495 164.430 255.490 164.400 L 233.200 90.250 C 230.699 81.768 222.893 75.959 214.050 76.000 L 204.000 76.000 C 197.373 76.000 192.000 81.373 192.000 88.000 C 192.000 94.627 197.373 100.000 204.000 100.000 L 211.070 100.000 L 227.870 156.000 L 196.930 156.000 L 177.200 90.250 C 174.699 81.768 166.893 75.959 158.050 76.000 L 148.000 76.000 C 141.373 76.000 136.000 81.373 136.000 88.000 C 136.000 94.627 141.373 100.000 148.000 100.000 L 155.070 100.000 L 171.870 156.000 L 140.930 156.000 L 121.200 90.250 C 118.699 81.768 110.893 75.959 102.050 76.000 L 42.000 76.000 C 33.138 75.937 25.306 81.750 22.800 90.250 L 0.550 164.400 C 0.545 164.430 0.545 164.460 0.550 164.490 L 0.550 164.550 C 0.485 164.753 0.432 164.960 0.390 165.170 C -0.476 168.738 0.339 172.506 2.603 175.397 C 4.866 178.288 8.328 179.984 12.000 180.000 L 244.000 180.000 C 247.793 179.999 251.362 178.205 253.626 175.161 C 255.889 172.117 256.581 168.183 255.490 164.550 ZM 44.930 100.000 L 99.070 100.000 L 115.870 156.000 L 28.130 156.000 Z"),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
