package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorDuotoneIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 152.000 L 232.000 216.000 C 232.000 220.418 228.418 224.000 224.000 224.000 L 160.000 224.000 C 129.481 224.008 102.273 204.773 92.100 176.000 L 96.000 176.000 C 135.764 176.000 168.000 143.764 168.000 104.000 L 168.000 104.000 C 168.005 95.867 166.629 87.792 163.930 80.120 L 163.930 80.120 C 202.106 82.207 231.993 113.767 232.000 152.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 169.570 72.590 C 154.644 37.646 117.197 18.022 79.969 25.636 C 42.742 33.251 16.007 66.002 16.000 104.000 L 16.000 168.000 C 16.000 176.837 23.163 184.000 32.000 184.000 L 86.670 184.000 C 99.426 213.131 128.199 231.965 160.000 232.000 L 224.000 232.000 C 232.837 232.000 240.000 224.837 240.000 216.000 L 240.000 152.000 C 239.992 111.525 209.755 77.432 169.570 72.590 ZM 32.000 104.000 C 32.000 68.654 60.654 40.000 96.000 40.000 C 131.346 40.000 160.000 68.654 160.000 104.000 C 160.000 139.346 131.346 168.000 96.000 168.000 L 32.000 168.000 ZM 224.000 216.000 L 160.000 216.000 C 136.963 215.974 115.709 203.595 104.320 183.570 C 126.471 181.271 146.659 169.836 160.019 152.018 C 173.379 134.201 178.700 111.618 174.700 89.710 C 203.590 96.528 224.001 122.316 224.000 152.000 Z"),
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
