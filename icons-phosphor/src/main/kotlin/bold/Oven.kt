package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Oven: ImageVector
    get() {
        if (_oven != null) return _oven!!
        _oven = phosphorBoldIcon(
            name = "Oven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 68.000 80.000 C 68.000 71.163 75.163 64.000 84.000 64.000 C 92.837 64.000 100.000 71.163 100.000 80.000 C 100.000 88.837 92.837 96.000 84.000 96.000 C 75.163 96.000 68.000 88.837 68.000 80.000 ZM 112.000 80.000 C 112.000 71.163 119.163 64.000 128.000 64.000 C 136.837 64.000 144.000 71.163 144.000 80.000 C 144.000 88.837 136.837 96.000 128.000 96.000 C 119.163 96.000 112.000 88.837 112.000 80.000 ZM 156.000 80.000 C 156.000 71.163 163.163 64.000 172.000 64.000 C 180.837 64.000 188.000 71.163 188.000 80.000 C 188.000 88.837 180.837 96.000 172.000 96.000 C 163.163 96.000 156.000 88.837 156.000 80.000 ZM 76.000 192.000 L 180.000 192.000 C 186.627 192.000 192.000 186.627 192.000 180.000 L 192.000 120.000 C 192.000 113.373 186.627 108.000 180.000 108.000 L 76.000 108.000 C 69.373 108.000 64.000 113.373 64.000 120.000 L 64.000 180.000 C 64.000 186.627 69.373 192.000 76.000 192.000 ZM 88.000 132.000 L 168.000 132.000 L 168.000 168.000 L 88.000 168.000 Z"),
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
        return _oven!!
    }

private var _oven: ImageVector? = null
