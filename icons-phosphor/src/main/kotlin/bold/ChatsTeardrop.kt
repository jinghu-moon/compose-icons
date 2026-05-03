package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorBoldIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.290 68.900 C 155.781 33.073 116.566 13.561 78.032 21.999 C 39.497 30.437 12.026 64.552 12.000 104.000 L 12.000 168.000 C 12.000 179.046 20.954 188.000 32.000 188.000 L 84.100 188.000 C 98.040 217.286 127.566 235.958 160.000 236.000 L 224.000 236.000 C 235.046 236.000 244.000 227.046 244.000 216.000 L 244.000 152.000 C 244.002 110.353 213.488 74.993 172.290 68.900 ZM 36.000 104.000 C 36.000 70.863 62.863 44.000 96.000 44.000 C 129.137 44.000 156.000 70.863 156.000 104.000 C 156.000 137.137 129.137 164.000 96.000 164.000 L 36.000 164.000 ZM 220.000 212.000 L 160.000 212.000 C 140.522 211.977 122.261 202.523 111.000 186.630 C 154.248 178.818 184.146 138.967 179.550 95.260 C 203.760 103.604 220.006 126.393 220.000 152.000 Z"),
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
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
