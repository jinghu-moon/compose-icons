package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = phosphorLightIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 253.570 117.780 L 239.570 82.780 C 237.459 77.452 232.301 73.960 226.570 73.980 L 190.000 73.980 L 190.000 64.000 C 190.000 60.686 187.314 58.000 184.000 58.000 L 32.000 58.000 C 24.268 58.000 18.000 64.268 18.000 72.000 L 18.000 184.000 C 18.000 191.732 24.268 198.000 32.000 198.000 L 50.600 198.000 C 53.439 211.982 65.733 222.030 80.000 222.030 C 94.267 222.030 106.561 211.982 109.400 198.000 L 162.600 198.000 C 165.439 211.982 177.733 222.030 192.000 222.030 C 206.267 222.030 218.561 211.982 221.400 198.000 L 240.000 198.000 C 247.732 198.000 254.000 191.732 254.000 184.000 L 254.000 120.000 C 253.999 119.239 253.853 118.486 253.570 117.780 ZM 190.000 86.000 L 226.580 86.000 C 227.400 85.999 228.137 86.499 228.440 87.260 L 239.140 114.000 L 190.000 114.000 ZM 30.000 72.000 C 30.000 70.895 30.895 70.000 32.000 70.000 L 178.000 70.000 L 178.000 138.000 L 30.000 138.000 ZM 80.000 210.000 C 70.059 210.000 62.000 201.941 62.000 192.000 C 62.000 182.059 70.059 174.000 80.000 174.000 C 89.941 174.000 98.000 182.059 98.000 192.000 C 98.000 201.941 89.941 210.000 80.000 210.000 ZM 162.600 186.000 L 109.400 186.000 C 106.561 172.018 94.267 161.970 80.000 161.970 C 65.733 161.970 53.439 172.018 50.600 186.000 L 32.000 186.000 C 30.895 186.000 30.000 185.105 30.000 184.000 L 30.000 150.000 L 178.000 150.000 L 178.000 165.480 C 170.063 169.680 164.415 177.205 162.600 186.000 ZM 192.000 210.000 C 182.059 210.000 174.000 201.941 174.000 192.000 C 174.000 182.059 182.059 174.000 192.000 174.000 C 201.941 174.000 210.000 182.059 210.000 192.000 C 210.000 201.941 201.941 210.000 192.000 210.000 ZM 242.000 184.000 C 242.000 185.105 241.105 186.000 240.000 186.000 L 221.400 186.000 C 218.531 172.041 206.251 162.016 192.000 162.000 C 191.330 162.000 190.660 162.000 190.000 162.070 L 190.000 126.000 L 242.000 126.000 Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
