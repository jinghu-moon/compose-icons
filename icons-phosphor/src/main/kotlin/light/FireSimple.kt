package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorLightIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 142.100 19.380 C 140.599 18.133 138.585 17.695 136.701 18.204 C 134.817 18.713 133.299 20.107 132.630 21.940 L 109.540 85.250 L 83.200 59.690 C 81.967 58.478 80.272 57.857 78.548 57.985 C 76.824 58.113 75.240 58.979 74.200 60.360 C 52.850 88.390 42.000 116.530 42.000 144.000 C 42.000 191.496 80.504 230.000 128.000 230.000 C 175.496 230.000 214.000 191.496 214.000 144.000 C 214.000 85.400 163.720 37.330 142.100 19.380 ZM 128.000 218.000 C 87.151 217.950 54.050 184.849 54.000 144.000 C 54.000 121.000 62.670 97.130 79.770 73.090 L 107.820 100.310 C 109.279 101.728 111.358 102.311 113.342 101.856 C 115.326 101.401 116.944 99.972 117.640 98.060 L 140.930 34.200 C 163.350 54.160 202.000 95.600 202.000 144.000 C 201.950 184.849 168.849 217.950 128.000 218.000 Z"),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
