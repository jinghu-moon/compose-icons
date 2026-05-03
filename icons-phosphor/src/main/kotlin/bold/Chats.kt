package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorBoldIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 76.000 L 188.000 76.000 L 188.000 48.000 C 188.000 36.954 179.046 28.000 168.000 28.000 L 40.000 28.000 C 28.954 28.000 20.000 36.954 20.000 48.000 L 20.000 176.000 C 20.002 180.622 22.658 184.832 26.829 186.824 C 31.000 188.815 35.944 188.234 39.540 185.330 L 68.000 162.330 L 68.000 184.000 C 68.000 195.046 76.954 204.000 88.000 204.000 L 180.170 204.000 L 216.460 233.330 C 220.056 236.234 225.000 236.815 229.171 234.824 C 233.342 232.832 235.998 228.622 236.000 224.000 L 236.000 96.000 C 236.000 84.954 227.046 76.000 216.000 76.000 ZM 44.000 150.870 L 44.000 52.000 L 164.000 52.000 L 164.000 132.000 L 71.580 132.000 C 68.822 131.992 66.145 132.935 64.000 134.670 ZM 212.000 198.870 L 192.000 182.670 C 189.866 180.944 187.205 180.002 184.460 180.000 L 92.000 180.000 L 92.000 156.000 L 168.000 156.000 C 179.046 156.000 188.000 147.046 188.000 136.000 L 188.000 100.000 L 212.000 100.000 Z"),
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
        return _chats!!
    }

private var _chats: ImageVector? = null
