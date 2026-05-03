package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorBoldIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 44.000 L 32.000 44.000 C 20.954 44.000 12.000 52.954 12.000 64.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 64.000 C 244.000 52.954 235.046 44.000 224.000 44.000 ZM 220.000 188.000 L 36.000 188.000 L 36.000 68.000 L 220.000 68.000 ZM 52.000 128.000 C 52.000 121.373 57.373 116.000 64.000 116.000 L 192.000 116.000 C 198.627 116.000 204.000 121.373 204.000 128.000 C 204.000 134.627 198.627 140.000 192.000 140.000 L 64.000 140.000 C 57.373 140.000 52.000 134.627 52.000 128.000 ZM 52.000 92.000 C 52.000 85.373 57.373 80.000 64.000 80.000 L 192.000 80.000 C 198.627 80.000 204.000 85.373 204.000 92.000 C 204.000 98.627 198.627 104.000 192.000 104.000 L 64.000 104.000 C 57.373 104.000 52.000 98.627 52.000 92.000 ZM 52.000 164.000 C 52.000 157.373 57.373 152.000 64.000 152.000 L 72.000 152.000 C 78.627 152.000 84.000 157.373 84.000 164.000 C 84.000 170.627 78.627 176.000 72.000 176.000 L 64.000 176.000 C 57.373 176.000 52.000 170.627 52.000 164.000 ZM 160.000 164.000 C 160.000 170.627 154.627 176.000 148.000 176.000 L 108.000 176.000 C 101.373 176.000 96.000 170.627 96.000 164.000 C 96.000 157.373 101.373 152.000 108.000 152.000 L 148.000 152.000 C 154.627 152.000 160.000 157.373 160.000 164.000 ZM 204.000 164.000 C 204.000 170.627 198.627 176.000 192.000 176.000 L 184.000 176.000 C 177.373 176.000 172.000 170.627 172.000 164.000 C 172.000 157.373 177.373 152.000 184.000 152.000 L 192.000 152.000 C 198.627 152.000 204.000 157.373 204.000 164.000 Z"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
