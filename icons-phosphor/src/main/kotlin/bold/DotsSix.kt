package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorBoldIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(76.0f, 92.0f),
                    PathNode.CurveTo(76.0f, 100.836555f, 68.836555f, 108.0f, 60.0f, 108.0f),
                    PathNode.CurveTo(51.163445f, 108.0f, 44.0f, 100.836555f, 44.0f, 92.0f),
                    PathNode.CurveTo(44.0f, 83.163445f, 51.163445f, 76.0f, 60.0f, 76.0f),
                    PathNode.CurveTo(68.836555f, 76.0f, 76.0f, 83.163445f, 76.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 76.0f),
                    PathNode.CurveTo(119.163445f, 76.0f, 112.0f, 83.163445f, 112.0f, 92.0f),
                    PathNode.CurveTo(112.0f, 100.836555f, 119.163445f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(136.83656f, 108.0f, 144.0f, 100.836555f, 144.0f, 92.0f),
                    PathNode.CurveTo(144.0f, 83.163445f, 136.83656f, 76.0f, 128.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 108.0f),
                    PathNode.CurveTo(204.83656f, 108.0f, 212.0f, 100.836555f, 212.0f, 92.0f),
                    PathNode.CurveTo(212.0f, 83.163445f, 204.83656f, 76.0f, 196.0f, 76.0f),
                    PathNode.CurveTo(187.16344f, 76.0f, 180.0f, 83.163445f, 180.0f, 92.0f),
                    PathNode.CurveTo(180.0f, 100.836555f, 187.16344f, 108.0f, 196.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 148.0f),
                    PathNode.CurveTo(51.163445f, 148.0f, 44.0f, 155.16344f, 44.0f, 164.0f),
                    PathNode.CurveTo(44.0f, 172.83656f, 51.163445f, 180.0f, 60.0f, 180.0f),
                    PathNode.CurveTo(68.836555f, 180.0f, 76.0f, 172.83656f, 76.0f, 164.0f),
                    PathNode.CurveTo(76.0f, 155.16344f, 68.836555f, 148.0f, 60.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(119.163445f, 148.0f, 112.0f, 155.16344f, 112.0f, 164.0f),
                    PathNode.CurveTo(112.0f, 172.83656f, 119.163445f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(136.83656f, 180.0f, 144.0f, 172.83656f, 144.0f, 164.0f),
                    PathNode.CurveTo(144.0f, 155.16344f, 136.83656f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 148.0f),
                    PathNode.CurveTo(187.16344f, 148.0f, 180.0f, 155.16344f, 180.0f, 164.0f),
                    PathNode.CurveTo(180.0f, 172.83656f, 187.16344f, 180.0f, 196.0f, 180.0f),
                    PathNode.CurveTo(204.83656f, 180.0f, 212.0f, 172.83656f, 212.0f, 164.0f),
                    PathNode.CurveTo(212.0f, 155.16344f, 204.83656f, 148.0f, 196.0f, 148.0f),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
