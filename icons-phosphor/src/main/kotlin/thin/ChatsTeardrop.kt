package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorThinIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 166.760 76.320 C 153.434 42.316 117.804 22.599 81.914 29.368 C 46.025 36.137 20.025 67.478 20.000 104.000 L 20.000 168.000 C 20.000 174.627 25.373 180.000 32.000 180.000 L 89.330 180.000 C 100.844 208.955 128.840 227.970 160.000 228.000 L 224.000 228.000 C 230.627 228.000 236.000 222.627 236.000 216.000 L 236.000 152.000 C 235.990 112.653 205.951 79.820 166.760 76.320 ZM 28.000 168.000 L 28.000 104.000 C 28.000 66.445 58.445 36.000 96.000 36.000 C 133.555 36.000 164.000 66.445 164.000 104.000 C 164.000 141.555 133.555 172.000 96.000 172.000 L 32.000 172.000 C 29.791 172.000 28.000 170.209 28.000 168.000 ZM 228.000 216.000 C 228.000 218.209 226.209 220.000 224.000 220.000 L 160.000 220.000 C 133.279 219.972 109.039 204.334 98.000 180.000 C 121.212 179.391 142.873 168.203 156.805 149.627 C 170.738 131.051 175.414 107.125 169.500 84.670 C 203.051 89.404 227.998 118.116 228.000 152.000 Z"),
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
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
