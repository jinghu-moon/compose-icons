package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyMeh: ImageVector
    get() {
        if (_smileyMeh != null) return _smileyMeh!!
        _smileyMeh = phosphorBoldIcon(
            name = "SmileyMeh",
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
                    PathNode.MoveTo(180.0f, 160.0f),
                    PathNode.CurveTo(180.0f, 166.62741f, 174.62741f, 172.0f, 168.0f, 172.0f),
                    PathNode.LineTo(88.0f, 172.0f),
                    PathNode.CurveTo(81.37258f, 172.0f, 76.0f, 166.62741f, 76.0f, 160.0f),
                    PathNode.CurveTo(76.0f, 153.37259f, 81.37258f, 148.0f, 88.0f, 148.0f),
                    PathNode.LineTo(168.0f, 148.0f),
                    PathNode.CurveTo(174.62741f, 148.0f, 180.0f, 153.37259f, 180.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 108.0f),
                    PathNode.CurveTo(76.0f, 99.163445f, 83.163445f, 92.0f, 92.0f, 92.0f),
                    PathNode.CurveTo(100.836555f, 92.0f, 108.0f, 99.163445f, 108.0f, 108.0f),
                    PathNode.CurveTo(108.0f, 116.836555f, 100.836555f, 124.0f, 92.0f, 124.0f),
                    PathNode.CurveTo(83.163445f, 124.0f, 76.0f, 116.836555f, 76.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 108.0f),
                    PathNode.CurveTo(180.0f, 116.836555f, 172.83656f, 124.0f, 164.0f, 124.0f),
                    PathNode.CurveTo(155.16344f, 124.0f, 148.0f, 116.836555f, 148.0f, 108.0f),
                    PathNode.CurveTo(148.0f, 99.163445f, 155.16344f, 92.0f, 164.0f, 92.0f),
                    PathNode.CurveTo(172.83656f, 92.0f, 180.0f, 99.163445f, 180.0f, 108.0f),
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
        return _smileyMeh!!
    }

private var _smileyMeh: ImageVector? = null
