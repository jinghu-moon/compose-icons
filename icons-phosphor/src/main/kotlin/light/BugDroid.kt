package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorLightIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 189.000 51.470 L 204.220 36.240 C 205.825 34.744 206.486 32.492 205.943 30.366 C 205.400 28.240 203.740 26.580 201.614 26.037 C 199.488 25.494 197.236 26.155 195.740 27.760 L 180.000 43.540 C 149.288 20.122 106.712 20.122 76.000 43.540 L 60.240 27.760 C 57.876 25.557 54.192 25.622 51.907 27.907 C 49.622 30.192 49.557 33.876 51.760 36.240 L 67.000 51.470 C 50.982 67.541 41.992 89.309 42.000 112.000 L 42.000 152.000 C 42.000 199.496 80.504 238.000 128.000 238.000 C 175.496 238.000 214.000 199.496 214.000 152.000 L 214.000 112.000 C 214.008 89.309 205.018 67.541 189.000 51.470 ZM 128.000 38.000 C 168.849 38.050 201.950 71.151 202.000 112.000 L 202.000 122.000 L 54.000 122.000 L 54.000 112.000 C 54.050 71.151 87.151 38.050 128.000 38.000 ZM 128.000 226.000 C 87.151 225.950 54.050 192.849 54.000 152.000 L 54.000 134.000 L 202.000 134.000 L 202.000 152.000 C 201.950 192.849 168.849 225.950 128.000 226.000 ZM 146.000 92.000 C 146.000 86.477 150.477 82.000 156.000 82.000 C 161.523 82.000 166.000 86.477 166.000 92.000 C 166.000 97.523 161.523 102.000 156.000 102.000 C 150.477 102.000 146.000 97.523 146.000 92.000 ZM 90.000 92.000 C 90.000 86.477 94.477 82.000 100.000 82.000 C 105.523 82.000 110.000 86.477 110.000 92.000 C 110.000 97.523 105.523 102.000 100.000 102.000 C 94.477 102.000 90.000 97.523 90.000 92.000 Z"),
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
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
