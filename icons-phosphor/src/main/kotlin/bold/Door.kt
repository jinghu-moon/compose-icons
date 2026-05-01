package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = phosphorBoldIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 212.0f),
                    PathNode.LineTo(212.0f, 212.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 28.954306f, 203.0457f, 20.0f, 192.0f, 20.0f),
                    PathNode.LineTo(64.0f, 20.0f),
                    PathNode.CurveTo(52.954304f, 20.0f, 44.0f, 28.954306f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(24.0f, 212.0f),
                    PathNode.CurveTo(17.372583f, 212.0f, 12.0f, 217.37259f, 12.0f, 224.0f),
                    PathNode.CurveTo(12.0f, 230.62741f, 17.372583f, 236.0f, 24.0f, 236.0f),
                    PathNode.LineTo(232.0f, 236.0f),
                    PathNode.CurveTo(238.62741f, 236.0f, 244.0f, 230.62741f, 244.0f, 224.0f),
                    PathNode.CurveTo(244.0f, 217.37259f, 238.62741f, 212.0f, 232.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 44.0f),
                    PathNode.LineTo(188.0f, 44.0f),
                    PathNode.LineTo(188.0f, 212.0f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 132.0f),
                    PathNode.CurveTo(172.0f, 140.83656f, 164.83656f, 148.0f, 156.0f, 148.0f),
                    PathNode.CurveTo(147.16344f, 148.0f, 140.0f, 140.83656f, 140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 123.163445f, 147.16344f, 116.0f, 156.0f, 116.0f),
                    PathNode.CurveTo(164.83656f, 116.0f, 172.0f, 123.163445f, 172.0f, 132.0f),
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
        return _door!!
    }

private var _door: ImageVector? = null
