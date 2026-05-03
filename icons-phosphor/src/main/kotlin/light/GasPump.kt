package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorLightIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 239.560 71.070 L 220.240 51.760 C 217.876 49.557 214.192 49.622 211.907 51.907 C 209.622 54.192 209.557 57.876 211.760 60.240 L 231.070 79.560 C 232.952 81.431 234.007 83.977 234.000 86.630 L 234.000 168.000 C 234.000 173.523 229.523 178.000 224.000 178.000 C 218.477 178.000 214.000 173.523 214.000 168.000 L 214.000 128.000 C 214.000 115.850 204.150 106.000 192.000 106.000 L 174.000 106.000 L 174.000 56.000 C 174.000 43.850 164.150 34.000 152.000 34.000 L 72.000 34.000 C 59.850 34.000 50.000 43.850 50.000 56.000 L 50.000 210.000 L 32.000 210.000 C 28.686 210.000 26.000 212.686 26.000 216.000 C 26.000 219.314 28.686 222.000 32.000 222.000 L 192.000 222.000 C 195.314 222.000 198.000 219.314 198.000 216.000 C 198.000 212.686 195.314 210.000 192.000 210.000 L 174.000 210.000 L 174.000 118.000 L 192.000 118.000 C 197.523 118.000 202.000 122.477 202.000 128.000 L 202.000 168.000 C 202.000 180.150 211.850 190.000 224.000 190.000 C 236.150 190.000 246.000 180.150 246.000 168.000 L 246.000 86.630 C 246.015 80.792 243.697 75.190 239.560 71.070 ZM 62.000 210.000 L 62.000 56.000 C 62.000 50.477 66.477 46.000 72.000 46.000 L 152.000 46.000 C 157.523 46.000 162.000 50.477 162.000 56.000 L 162.000 210.000 ZM 142.000 112.000 C 142.000 115.314 139.314 118.000 136.000 118.000 L 88.000 118.000 C 84.686 118.000 82.000 115.314 82.000 112.000 C 82.000 108.686 84.686 106.000 88.000 106.000 L 136.000 106.000 C 139.314 106.000 142.000 108.686 142.000 112.000 Z"),
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
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
