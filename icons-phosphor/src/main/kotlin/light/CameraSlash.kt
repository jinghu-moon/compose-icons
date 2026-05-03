package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorLightIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 56.250 58.000 L 48.000 58.000 C 35.850 58.000 26.000 67.850 26.000 80.000 L 26.000 192.000 C 26.000 204.150 35.850 214.000 48.000 214.000 L 198.070 214.000 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 105.500 112.200 L 145.610 156.330 C 140.494 160.049 134.324 162.035 128.000 162.000 C 116.209 161.999 105.512 155.091 100.660 144.344 C 95.808 133.597 97.702 121.005 105.500 112.160 ZM 48.000 202.000 C 42.477 202.000 38.000 197.523 38.000 192.000 L 38.000 80.000 C 38.000 74.477 42.477 70.000 48.000 70.000 L 67.160 70.000 L 97.390 103.250 C 82.261 119.202 81.994 144.123 96.778 160.395 C 111.562 176.668 136.394 178.785 153.720 165.250 L 187.160 202.000 ZM 230.000 80.000 L 230.000 186.000 C 230.000 189.314 227.314 192.000 224.000 192.000 C 220.686 192.000 218.000 189.314 218.000 186.000 L 218.000 80.000 C 218.000 74.477 213.523 70.000 208.000 70.000 L 176.000 70.000 C 173.992 70.003 172.115 69.001 171.000 67.330 L 156.780 46.000 L 99.210 46.000 L 98.980 46.340 C 97.144 49.101 93.416 49.851 90.655 48.015 C 87.894 46.179 87.144 42.451 88.980 39.690 L 90.980 36.690 C 92.094 35.006 93.981 33.995 96.000 34.000 L 160.000 34.000 C 162.008 33.997 163.885 34.999 165.000 36.670 L 179.210 58.000 L 208.000 58.000 C 220.150 58.000 230.000 67.850 230.000 80.000 Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
