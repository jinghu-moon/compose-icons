package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorBoldIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(38.878906f, 36.038574f, 12.038574f, 62.878906f, 12.0f, 96.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 96.0f),
                    PathNode.CurveTo(243.96143f, 62.878906f, 217.1211f, 36.038574f, 184.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 96.0f),
                    PathNode.LineTo(220.0f, 100.0f),
                    PathNode.LineTo(192.0f, 100.0f),
                    PathNode.LineTo(192.0f, 60.91f),
                    PathNode.CurveTo(208.36592f, 64.65918f, 219.97684f, 79.210144f, 220.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(134.62741f, 156.0f, 140.0f, 150.62741f, 140.0f, 144.0f),
                    PathNode.LineTo(140.0f, 124.0f),
                    PathNode.LineTo(168.0f, 124.0f),
                    PathNode.LineTo(168.0f, 188.0f),
                    PathNode.LineTo(88.0f, 188.0f),
                    PathNode.LineTo(88.0f, 124.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.LineTo(116.0f, 144.0f),
                    PathNode.CurveTo(116.0f, 150.62741f, 121.37258f, 156.0f, 128.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 100.0f),
                    PathNode.LineTo(140.0f, 96.0f),
                    PathNode.CurveTo(140.0f, 89.37258f, 134.62741f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(121.37258f, 84.0f, 116.0f, 89.37258f, 116.0f, 96.0f),
                    PathNode.LineTo(116.0f, 100.0f),
                    PathNode.LineTo(88.0f, 100.0f),
                    PathNode.LineTo(88.0f, 60.0f),
                    PathNode.LineTo(168.0f, 60.0f),
                    PathNode.LineTo(168.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 60.91f),
                    PathNode.LineTo(64.0f, 100.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.02316f, 79.210144f, 47.634075f, 64.65918f, 64.0f, 60.91f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 124.0f),
                    PathNode.LineTo(64.0f, 124.0f),
                    PathNode.LineTo(64.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 188.0f),
                    PathNode.LineTo(192.0f, 124.0f),
                    PathNode.LineTo(220.0f, 124.0f),
                    PathNode.LineTo(220.0f, 188.0f),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
