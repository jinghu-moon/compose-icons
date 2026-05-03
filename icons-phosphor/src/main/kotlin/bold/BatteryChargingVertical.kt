package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorBoldIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 154.210 133.690 C 156.396 137.230 156.593 141.650 154.730 145.370 L 138.730 177.370 C 136.849 181.269 133.014 183.852 128.695 184.131 C 124.375 184.409 120.240 182.340 117.874 178.715 C 115.508 175.090 115.277 170.472 117.270 166.630 L 124.580 152.000 L 112.000 152.000 C 107.841 152.000 103.978 149.845 101.792 146.307 C 99.606 142.768 99.409 138.350 101.270 134.630 L 117.270 102.630 C 119.151 98.731 122.986 96.148 127.305 95.869 C 131.625 95.591 135.760 97.660 138.126 101.285 C 140.492 104.910 140.723 109.528 138.730 113.370 L 131.420 128.000 L 144.000 128.000 C 148.159 127.999 152.023 130.152 154.210 133.690 ZM 104.000 24.000 L 152.000 24.000 C 158.627 24.000 164.000 18.627 164.000 12.000 C 164.000 5.373 158.627 0.000 152.000 0.000 L 104.000 0.000 C 97.373 0.000 92.000 5.373 92.000 12.000 C 92.000 18.627 97.373 24.000 104.000 24.000 ZM 204.000 60.000 L 204.000 228.000 C 204.000 243.464 191.464 256.000 176.000 256.000 L 80.000 256.000 C 64.536 256.000 52.000 243.464 52.000 228.000 L 52.000 60.000 C 52.000 44.536 64.536 32.000 80.000 32.000 L 176.000 32.000 C 191.464 32.000 204.000 44.536 204.000 60.000 ZM 180.000 60.000 C 180.000 57.791 178.209 56.000 176.000 56.000 L 80.000 56.000 C 77.791 56.000 76.000 57.791 76.000 60.000 L 76.000 228.000 C 76.000 230.209 77.791 232.000 80.000 232.000 L 176.000 232.000 C 178.209 232.000 180.000 230.209 180.000 228.000 Z"),
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
