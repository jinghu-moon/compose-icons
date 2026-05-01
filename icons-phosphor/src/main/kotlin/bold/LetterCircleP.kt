package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LetterCircleP: ImageVector
    get() {
        if (_letterCircleP != null) return _letterCircleP!!
        _letterCircleP = phosphorBoldIcon(
            name = "LetterCircleP",
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
                    PathNode.MoveTo(136.0f, 76.0f),
                    PathNode.LineTo(104.0f, 76.0f),
                    PathNode.CurveTo(97.37258f, 76.0f, 92.0f, 81.37258f, 92.0f, 88.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.CurveTo(92.0f, 174.62741f, 97.37258f, 180.0f, 104.0f, 180.0f),
                    PathNode.CurveTo(110.62742f, 180.0f, 116.0f, 174.62741f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 156.0f),
                    PathNode.LineTo(136.0f, 156.0f),
                    PathNode.CurveTo(158.09138f, 156.0f, 176.0f, 138.09138f, 176.0f, 116.0f),
                    PathNode.CurveTo(176.0f, 93.90861f, 158.09138f, 76.0f, 136.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 132.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.LineTo(116.0f, 100.0f),
                    PathNode.LineTo(136.0f, 100.0f),
                    PathNode.CurveTo(144.83656f, 100.0f, 152.0f, 107.163445f, 152.0f, 116.0f),
                    PathNode.CurveTo(152.0f, 124.836555f, 144.83656f, 132.0f, 136.0f, 132.0f),
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
        return _letterCircleP!!
    }

private var _letterCircleP: ImageVector? = null
