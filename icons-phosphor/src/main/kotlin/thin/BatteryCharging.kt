package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorThinIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 60.000 L 32.000 60.000 C 20.954 60.000 12.000 68.954 12.000 80.000 L 12.000 176.000 C 12.000 187.046 20.954 196.000 32.000 196.000 L 200.000 196.000 C 211.046 196.000 220.000 187.046 220.000 176.000 L 220.000 80.000 C 220.000 68.954 211.046 60.000 200.000 60.000 ZM 212.000 176.000 C 212.000 182.627 206.627 188.000 200.000 188.000 L 32.000 188.000 C 25.373 188.000 20.000 182.627 20.000 176.000 L 20.000 80.000 C 20.000 73.373 25.373 68.000 32.000 68.000 L 200.000 68.000 C 206.627 68.000 212.000 73.373 212.000 80.000 ZM 252.000 96.000 L 252.000 160.000 C 252.000 162.209 250.209 164.000 248.000 164.000 C 245.791 164.000 244.000 162.209 244.000 160.000 L 244.000 96.000 C 244.000 93.791 245.791 92.000 248.000 92.000 C 250.209 92.000 252.000 93.791 252.000 96.000 ZM 135.400 125.900 C 136.130 127.078 136.198 128.550 135.580 129.790 L 119.580 161.790 C 118.902 163.145 117.516 164.001 116.000 164.000 C 115.379 163.997 114.767 163.853 114.210 163.580 C 113.260 163.106 112.538 162.273 112.202 161.266 C 111.866 160.259 111.945 159.159 112.420 158.210 L 125.530 132.000 L 100.000 132.000 C 98.613 132.001 97.324 131.283 96.595 130.104 C 95.866 128.924 95.799 127.450 96.420 126.210 L 112.420 94.210 C 113.409 92.233 115.813 91.431 117.790 92.420 C 119.767 93.409 120.569 95.813 119.580 97.790 L 106.470 124.000 L 132.000 124.000 C 133.386 124.002 134.672 124.720 135.400 125.900 Z"),
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
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
