package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorThinIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 20.000 L 72.000 20.000 C 65.373 20.000 60.000 25.373 60.000 32.000 L 60.000 77.330 C 60.004 79.926 60.845 82.451 62.400 84.530 L 83.200 112.270 C 83.719 112.962 84.000 113.805 84.000 114.670 L 84.000 224.000 C 84.000 230.627 89.373 236.000 96.000 236.000 L 160.000 236.000 C 166.627 236.000 172.000 230.627 172.000 224.000 L 172.000 114.670 C 172.000 113.805 172.281 112.962 172.800 112.270 L 193.600 84.530 C 195.155 82.451 195.996 79.926 196.000 77.330 L 196.000 32.000 C 196.000 25.373 190.627 20.000 184.000 20.000 ZM 72.000 28.000 L 184.000 28.000 C 186.209 28.000 188.000 29.791 188.000 32.000 L 188.000 60.000 L 68.000 60.000 L 68.000 32.000 C 68.000 29.791 69.791 28.000 72.000 28.000 ZM 187.200 79.730 L 166.400 107.470 C 164.845 109.549 164.004 112.074 164.000 114.670 L 164.000 224.000 C 164.000 226.209 162.209 228.000 160.000 228.000 L 96.000 228.000 C 93.791 228.000 92.000 226.209 92.000 224.000 L 92.000 114.670 C 91.996 112.074 91.155 109.549 89.600 107.470 L 68.800 79.730 C 68.281 79.038 68.000 78.195 68.000 77.330 L 68.000 68.000 L 188.000 68.000 L 188.000 77.330 C 188.000 78.195 187.719 79.038 187.200 79.730 ZM 132.000 120.000 L 132.000 152.000 C 132.000 154.209 130.209 156.000 128.000 156.000 C 125.791 156.000 124.000 154.209 124.000 152.000 L 124.000 120.000 C 124.000 117.791 125.791 116.000 128.000 116.000 C 130.209 116.000 132.000 117.791 132.000 120.000 Z"),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
