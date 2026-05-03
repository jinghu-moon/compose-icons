package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorThinIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 84.000 L 180.000 84.000 L 180.000 48.000 C 180.000 41.373 174.627 36.000 168.000 36.000 L 40.000 36.000 C 33.373 36.000 28.000 41.373 28.000 48.000 L 28.000 176.000 C 28.000 178.209 29.791 180.000 32.000 180.000 C 32.914 179.999 33.800 179.685 34.510 179.110 L 73.000 148.000 L 76.000 148.000 L 76.000 184.000 C 76.000 190.627 81.373 196.000 88.000 196.000 L 183.000 196.000 L 221.490 227.110 C 222.200 227.685 223.086 227.999 224.000 228.000 C 226.209 228.000 228.000 226.209 228.000 224.000 L 228.000 96.000 C 228.000 89.373 222.627 84.000 216.000 84.000 ZM 71.580 140.000 C 70.666 140.001 69.780 140.315 69.070 140.890 L 36.000 167.620 L 36.000 48.000 C 36.000 45.791 37.791 44.000 40.000 44.000 L 168.000 44.000 C 170.209 44.000 172.000 45.791 172.000 48.000 L 172.000 136.000 C 172.000 138.209 170.209 140.000 168.000 140.000 ZM 220.000 215.620 L 186.930 188.890 C 186.220 188.315 185.334 188.001 184.420 188.000 L 88.000 188.000 C 85.791 188.000 84.000 186.209 84.000 184.000 L 84.000 148.000 L 168.000 148.000 C 174.627 148.000 180.000 142.627 180.000 136.000 L 180.000 92.000 L 216.000 92.000 C 218.209 92.000 220.000 93.791 220.000 96.000 Z"),
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
