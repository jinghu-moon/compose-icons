package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorBoldIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.490 224.490 L 184.490 248.490 C 179.796 253.184 172.184 253.184 167.490 248.490 C 162.796 243.796 162.796 236.184 167.490 231.490 L 171.000 228.000 L 80.000 228.000 C 64.536 228.000 52.000 215.464 52.000 200.000 L 52.000 108.000 C 52.000 101.373 57.373 96.000 64.000 96.000 C 70.627 96.000 76.000 101.373 76.000 108.000 L 76.000 200.000 C 76.000 202.209 77.791 204.000 80.000 204.000 L 171.000 204.000 L 167.480 200.490 C 162.786 195.796 162.786 188.184 167.480 183.490 C 172.174 178.796 179.786 178.796 184.480 183.490 L 208.480 207.490 C 210.741 209.740 212.013 212.798 212.014 215.988 C 212.016 219.178 210.748 222.237 208.490 224.490 ZM 80.000 76.000 C 84.856 76.004 89.236 73.080 91.095 68.593 C 92.954 64.107 91.926 58.942 88.490 55.510 L 85.000 52.000 L 176.000 52.000 C 178.209 52.000 180.000 53.791 180.000 56.000 L 180.000 148.000 C 180.000 154.627 185.373 160.000 192.000 160.000 C 198.627 160.000 204.000 154.627 204.000 148.000 L 204.000 56.000 C 204.000 40.536 191.464 28.000 176.000 28.000 L 85.000 28.000 L 88.520 24.480 C 93.214 19.786 93.214 12.174 88.520 7.480 C 83.826 2.786 76.214 2.786 71.520 7.480 L 47.520 31.480 C 45.261 33.732 43.991 36.790 43.991 39.980 C 43.991 43.170 45.261 46.228 47.520 48.480 L 71.520 72.480 C 73.768 74.731 76.818 75.997 80.000 76.000 Z"),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
