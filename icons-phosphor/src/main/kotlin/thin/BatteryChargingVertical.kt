package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorThinIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 147.400 133.900 C 148.130 135.078 148.198 136.550 147.580 137.790 L 131.580 169.790 C 130.902 171.145 129.516 172.001 128.000 172.000 C 127.379 171.997 126.767 171.853 126.210 171.580 C 125.260 171.106 124.538 170.273 124.202 169.266 C 123.866 168.259 123.945 167.159 124.420 166.210 L 137.530 140.000 L 112.000 140.000 C 110.613 140.001 109.324 139.283 108.595 138.104 C 107.866 136.924 107.799 135.450 108.420 134.210 L 124.420 102.210 C 125.409 100.233 127.813 99.431 129.790 100.420 C 131.767 101.409 132.569 103.813 131.580 105.790 L 118.470 132.000 L 144.000 132.000 C 145.386 132.002 146.672 132.720 147.400 133.900 ZM 96.000 12.000 L 160.000 12.000 C 162.209 12.000 164.000 10.209 164.000 8.000 C 164.000 5.791 162.209 4.000 160.000 4.000 L 96.000 4.000 C 93.791 4.000 92.000 5.791 92.000 8.000 C 92.000 10.209 93.791 12.000 96.000 12.000 ZM 196.000 56.000 L 196.000 224.000 C 196.000 235.046 187.046 244.000 176.000 244.000 L 80.000 244.000 C 68.954 244.000 60.000 235.046 60.000 224.000 L 60.000 56.000 C 60.000 44.954 68.954 36.000 80.000 36.000 L 176.000 36.000 C 187.046 36.000 196.000 44.954 196.000 56.000 ZM 188.000 56.000 C 188.000 49.373 182.627 44.000 176.000 44.000 L 80.000 44.000 C 73.373 44.000 68.000 49.373 68.000 56.000 L 68.000 224.000 C 68.000 230.627 73.373 236.000 80.000 236.000 L 176.000 236.000 C 182.627 236.000 188.000 230.627 188.000 224.000 Z"),
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
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
