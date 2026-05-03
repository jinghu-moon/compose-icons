package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsThree: ImageVector
    get() {
        if (_dotsThree != null) return _dotsThree!!
        _dotsThree = phosphorBoldIcon(
            name = "DotsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 136.83656f, 136.83656f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(119.163445f, 144.0f, 112.0f, 136.83656f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 119.163445f, 119.163445f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(136.83656f, 112.0f, 144.0f, 119.163445f, 144.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 112.0f),
                    PathNode.CurveTo(51.163445f, 112.0f, 44.0f, 119.163445f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 136.83656f, 51.163445f, 144.0f, 60.0f, 144.0f),
                    PathNode.CurveTo(68.836555f, 144.0f, 76.0f, 136.83656f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 119.163445f, 68.836555f, 112.0f, 60.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 112.0f),
                    PathNode.CurveTo(187.16344f, 112.0f, 180.0f, 119.163445f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 136.83656f, 187.16344f, 144.0f, 196.0f, 144.0f),
                    PathNode.CurveTo(204.83656f, 144.0f, 212.0f, 136.83656f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 119.163445f, 204.83656f, 112.0f, 196.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dotsThree!!
    }

private var _dotsThree: ImageVector? = null
