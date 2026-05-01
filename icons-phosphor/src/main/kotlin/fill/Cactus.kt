package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorFillIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 211.58173f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.CurveTo(44.66977f, 135.96143f, 16.03858f, 107.33023f, 16.0f, 72.0f),
                    PathNode.CurveTo(16.038591f, 58.729946f, 26.809893f, 47.99443f, 40.08f, 48.0f),
                    PathNode.LineTo(40.48f, 48.0f),
                    PathNode.CurveTo(53.462887f, 48.01653f, 63.98347f, 58.537113f, 64.0f, 71.52f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.CurveTo(64.0f, 80.836555f, 71.163445f, 88.0f, 80.0f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 33.90861f, 105.90861f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(150.09138f, 16.0f, 168.0f, 33.90861f, 168.0f, 56.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.CurveTo(184.83656f, 128.0f, 192.0f, 120.836555f, 192.0f, 112.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.LineTo(192.0f, 111.52f),
                    PathNode.CurveTo(192.01653f, 98.53712f, 202.53711f, 88.016525f, 215.52f, 88.0f),
                    PathNode.LineTo(215.92f, 88.0f),
                    PathNode.CurveTo(229.19011f, 87.99443f, 239.96141f, 98.72995f, 240.0f, 112.0f),
                    PathNode.CurveTo(239.96143f, 147.33023f, 211.33023f, 175.96143f, 176.0f, 176.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 211.58173f, 224.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cactus!!
    }

private var _cactus: ImageVector? = null
