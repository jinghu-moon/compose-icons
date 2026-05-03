package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = phosphorBoldIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 100.000 L 231.800 100.000 L 205.080 39.880 C 201.870 32.655 194.706 27.999 186.800 28.000 L 69.200 28.000 C 61.294 27.999 54.130 32.655 50.920 39.880 L 24.200 100.000 L 16.000 100.000 C 9.373 100.000 4.000 105.373 4.000 112.000 C 4.000 118.627 9.373 124.000 16.000 124.000 L 20.000 124.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 68.000 220.000 C 79.046 220.000 88.000 211.046 88.000 200.000 L 88.000 180.000 L 168.000 180.000 L 168.000 200.000 C 168.000 211.046 176.954 220.000 188.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 124.000 L 240.000 124.000 C 246.627 124.000 252.000 118.627 252.000 112.000 C 252.000 105.373 246.627 100.000 240.000 100.000 ZM 71.800 52.000 L 184.200 52.000 L 205.530 100.000 L 50.470 100.000 ZM 64.000 196.000 L 44.000 196.000 L 44.000 180.000 L 64.000 180.000 ZM 192.000 196.000 L 192.000 180.000 L 212.000 180.000 L 212.000 196.000 ZM 212.000 156.000 L 44.000 156.000 L 44.000 124.000 L 212.000 124.000 Z"),
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
        return _car!!
    }

private var _car: ImageVector? = null
