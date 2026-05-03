package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorLightIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.900 58.310 L 129.900 26.310 C 128.667 25.898 127.333 25.898 126.100 26.310 L 30.100 58.310 C 27.652 59.127 26.001 61.419 26.000 64.000 L 26.000 144.000 C 26.000 147.314 28.686 150.000 32.000 150.000 C 35.314 150.000 38.000 147.314 38.000 144.000 L 38.000 72.320 L 76.680 85.220 C 66.815 99.799 63.612 117.884 67.870 134.963 C 72.128 152.043 83.446 166.508 99.000 174.750 C 79.750 181.280 63.000 194.340 51.000 212.750 C 49.571 215.487 50.453 218.862 53.038 220.551 C 55.624 222.239 59.068 221.689 61.000 219.280 C 76.470 195.590 100.880 182.000 128.000 182.000 C 155.120 182.000 179.530 195.590 195.000 219.280 C 196.921 221.742 200.410 222.319 203.021 220.606 C 205.633 218.893 206.493 215.463 205.000 212.720 C 193.000 194.340 176.270 181.280 157.000 174.720 C 172.546 166.469 183.852 152.000 188.101 134.921 C 192.349 117.842 189.139 99.762 179.270 85.190 L 225.900 69.690 C 228.347 68.871 229.996 66.580 229.996 64.000 C 229.996 61.420 228.347 59.129 225.900 58.310 ZM 178.000 120.000 C 178.010 141.885 163.786 161.233 142.895 167.752 C 122.004 174.271 99.300 166.447 86.862 148.441 C 74.423 130.435 75.139 106.432 88.630 89.200 L 126.100 101.690 C 127.333 102.102 128.667 102.102 129.900 101.690 L 167.370 89.200 C 174.268 97.984 178.012 108.832 178.000 120.000 ZM 128.000 89.680 L 51.000 64.000 L 128.000 38.320 L 205.000 64.000 Z"),
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
        return _student!!
    }

private var _student: ImageVector? = null
