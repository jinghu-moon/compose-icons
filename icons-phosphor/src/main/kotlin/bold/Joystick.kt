package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorBoldIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 144.000 L 140.000 144.000 L 140.000 98.320 C 161.127 92.331 174.604 71.681 171.581 49.930 C 168.558 28.180 149.960 11.988 128.000 11.988 C 106.040 11.988 87.442 28.180 84.419 49.930 C 81.396 71.681 94.873 92.331 116.000 98.320 L 116.000 144.000 L 48.000 144.000 C 36.954 144.000 28.000 152.954 28.000 164.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 164.000 C 228.000 152.954 219.046 144.000 208.000 144.000 ZM 108.000 56.000 C 108.000 44.954 116.954 36.000 128.000 36.000 C 139.046 36.000 148.000 44.954 148.000 56.000 C 148.000 67.046 139.046 76.000 128.000 76.000 C 116.954 76.000 108.000 67.046 108.000 56.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 168.000 L 204.000 168.000 ZM 172.000 104.000 L 204.000 104.000 C 210.627 104.000 216.000 109.373 216.000 116.000 C 216.000 122.627 210.627 128.000 204.000 128.000 L 172.000 128.000 C 165.373 128.000 160.000 122.627 160.000 116.000 C 160.000 109.373 165.373 104.000 172.000 104.000 Z"),
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
        return _joystick!!
    }

private var _joystick: ImageVector? = null
