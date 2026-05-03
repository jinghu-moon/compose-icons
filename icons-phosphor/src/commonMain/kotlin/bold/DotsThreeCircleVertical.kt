package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsThreeCircleVertical: ImageVector
    get() {
        if (_dotsThreeCircleVertical != null) return _dotsThreeCircleVertical!!
        _dotsThreeCircleVertical = phosphorBoldIcon(
            name = "DotsThreeCircleVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 96.0f),
                    PathNode.CurveTo(144.0f, 104.836555f, 136.83656f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(119.163445f, 112.0f, 112.0f, 104.836555f, 112.0f, 96.0f),
                    PathNode.CurveTo(112.0f, 87.163445f, 119.163445f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(136.83656f, 80.0f, 144.0f, 87.163445f, 144.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 160.0f),
                    PathNode.CurveTo(144.0f, 168.83656f, 136.83656f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(119.163445f, 176.0f, 112.0f, 168.83656f, 112.0f, 160.0f),
                    PathNode.CurveTo(112.0f, 151.16344f, 119.163445f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(136.83656f, 144.0f, 144.0f, 151.16344f, 144.0f, 160.0f),
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
        return _dotsThreeCircleVertical!!
    }

private var _dotsThreeCircleVertical: ImageVector? = null
