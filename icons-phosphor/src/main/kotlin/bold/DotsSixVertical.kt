package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsSixVertical: ImageVector
    get() {
        if (_dotsSixVertical != null) return _dotsSixVertical!!
        _dotsSixVertical = phosphorBoldIcon(
            name = "DotsSixVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 60.0f),
                    PathNode.CurveTo(108.0f, 68.836555f, 100.836555f, 76.0f, 92.0f, 76.0f),
                    PathNode.CurveTo(83.163445f, 76.0f, 76.0f, 68.836555f, 76.0f, 60.0f),
                    PathNode.CurveTo(76.0f, 51.163445f, 83.163445f, 44.0f, 92.0f, 44.0f),
                    PathNode.CurveTo(100.836555f, 44.0f, 108.0f, 51.163445f, 108.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 76.0f),
                    PathNode.CurveTo(172.83656f, 76.0f, 180.0f, 68.836555f, 180.0f, 60.0f),
                    PathNode.CurveTo(180.0f, 51.163445f, 172.83656f, 44.0f, 164.0f, 44.0f),
                    PathNode.CurveTo(155.16344f, 44.0f, 148.0f, 51.163445f, 148.0f, 60.0f),
                    PathNode.CurveTo(148.0f, 68.836555f, 155.16344f, 76.0f, 164.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 112.0f),
                    PathNode.CurveTo(83.163445f, 112.0f, 76.0f, 119.163445f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 136.83656f, 83.163445f, 144.0f, 92.0f, 144.0f),
                    PathNode.CurveTo(100.836555f, 144.0f, 108.0f, 136.83656f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 119.163445f, 100.836555f, 112.0f, 92.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 112.0f),
                    PathNode.CurveTo(155.16344f, 112.0f, 148.0f, 119.163445f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 136.83656f, 155.16344f, 144.0f, 164.0f, 144.0f),
                    PathNode.CurveTo(172.83656f, 144.0f, 180.0f, 136.83656f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 119.163445f, 172.83656f, 112.0f, 164.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 180.0f),
                    PathNode.CurveTo(83.163445f, 180.0f, 76.0f, 187.16344f, 76.0f, 196.0f),
                    PathNode.CurveTo(76.0f, 204.83656f, 83.163445f, 212.0f, 92.0f, 212.0f),
                    PathNode.CurveTo(100.836555f, 212.0f, 108.0f, 204.83656f, 108.0f, 196.0f),
                    PathNode.CurveTo(108.0f, 187.16344f, 100.836555f, 180.0f, 92.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 180.0f),
                    PathNode.CurveTo(155.16344f, 180.0f, 148.0f, 187.16344f, 148.0f, 196.0f),
                    PathNode.CurveTo(148.0f, 204.83656f, 155.16344f, 212.0f, 164.0f, 212.0f),
                    PathNode.CurveTo(172.83656f, 212.0f, 180.0f, 204.83656f, 180.0f, 196.0f),
                    PathNode.CurveTo(180.0f, 187.16344f, 172.83656f, 180.0f, 164.0f, 180.0f),
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
        return _dotsSixVertical!!
    }

private var _dotsSixVertical: ImageVector? = null
