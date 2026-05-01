package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorBoldIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 128.0f),
                    PathNode.CurveTo(251.96143f, 161.1211f, 225.1211f, 187.96143f, 192.0f, 188.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.CurveTo(21.90861f, 188.0f, 4.0f, 170.09138f, 4.0f, 148.0f),
                    PathNode.CurveTo(4.0f, 125.90861f, 21.90861f, 108.0f, 44.0f, 108.0f),
                    PathNode.LineTo(184.0f, 108.0f),
                    PathNode.CurveTo(190.62741f, 108.0f, 196.0f, 113.37258f, 196.0f, 120.0f),
                    PathNode.CurveTo(196.0f, 126.62742f, 190.62741f, 132.0f, 184.0f, 132.0f),
                    PathNode.LineTo(44.0f, 132.0f),
                    PathNode.CurveTo(35.163445f, 132.0f, 28.0f, 139.16344f, 28.0f, 148.0f),
                    PathNode.CurveTo(28.0f, 156.83656f, 35.163445f, 164.0f, 44.0f, 164.0f),
                    PathNode.LineTo(192.0f, 164.0f),
                    PathNode.CurveTo(211.88223f, 164.0f, 228.0f, 147.88223f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 108.11775f, 211.88223f, 92.0f, 192.0f, 92.0f),
                    PathNode.LineTo(80.0f, 92.0f),
                    PathNode.CurveTo(73.37258f, 92.0f, 68.0f, 86.62742f, 68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 73.37258f, 73.37258f, 68.0f, 80.0f, 68.0f),
                    PathNode.LineTo(192.0f, 68.0f),
                    PathNode.CurveTo(225.1211f, 68.038574f, 251.96143f, 94.87891f, 252.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
