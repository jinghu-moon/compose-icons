package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorFillIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 132.000 24.000 C 76.797 24.061 32.061 68.797 32.000 124.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 132.000 224.000 C 187.228 224.000 232.000 179.228 232.000 124.000 C 232.000 68.772 187.228 24.000 132.000 24.000 ZM 164.000 152.000 L 96.000 152.000 C 91.582 152.000 88.000 148.418 88.000 144.000 C 88.000 139.582 91.582 136.000 96.000 136.000 L 164.000 136.000 C 168.418 136.000 172.000 139.582 172.000 144.000 C 172.000 148.418 168.418 152.000 164.000 152.000 ZM 164.000 120.000 L 96.000 120.000 C 91.582 120.000 88.000 116.418 88.000 112.000 C 88.000 107.582 91.582 104.000 96.000 104.000 L 164.000 104.000 C 168.418 104.000 172.000 107.582 172.000 112.000 C 172.000 116.418 168.418 120.000 164.000 120.000 Z"),
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
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
