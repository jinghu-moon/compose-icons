package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorThinIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 60.780 60.000 L 48.000 60.000 C 36.954 60.000 28.000 68.954 28.000 80.000 L 28.000 192.000 C 28.000 203.046 36.954 212.000 48.000 212.000 L 199.000 212.000 L 205.080 218.690 C 206.036 219.768 207.497 220.248 208.906 219.948 C 210.315 219.647 211.454 218.613 211.887 217.239 C 212.320 215.865 211.982 214.364 211.000 213.310 ZM 148.580 156.540 C 142.824 161.392 135.528 164.037 128.000 164.000 C 115.017 164.003 103.319 156.160 98.390 144.149 C 93.461 132.137 96.277 118.338 105.520 109.220 ZM 48.000 204.000 C 41.373 204.000 36.000 198.627 36.000 192.000 L 36.000 80.000 C 36.000 73.373 41.373 68.000 48.000 68.000 L 68.000 68.000 L 100.090 103.300 C 84.598 118.332 83.827 142.945 98.349 158.917 C 112.871 174.888 137.446 176.456 153.880 162.460 L 191.690 204.000 ZM 228.000 80.000 L 228.000 186.000 C 228.000 188.209 226.209 190.000 224.000 190.000 C 221.791 190.000 220.000 188.209 220.000 186.000 L 220.000 80.000 C 220.000 73.373 214.627 68.000 208.000 68.000 L 176.000 68.000 C 174.666 67.998 173.421 67.330 172.680 66.220 L 157.850 44.000 L 98.130 44.000 L 97.310 45.230 C 96.538 46.469 95.154 47.189 93.697 47.109 C 92.240 47.030 90.942 46.163 90.310 44.848 C 89.677 43.532 89.812 41.977 90.660 40.790 L 92.660 37.790 C 93.402 36.670 94.657 35.998 96.000 36.000 L 160.000 36.000 C 161.338 35.999 162.588 36.667 163.330 37.780 L 178.130 60.000 L 208.000 60.000 C 219.046 60.000 228.000 68.954 228.000 80.000 Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
