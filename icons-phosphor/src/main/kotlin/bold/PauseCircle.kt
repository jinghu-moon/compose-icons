package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) return _pauseCircle!!
        _pauseCircle = phosphorBoldIcon(
            name = "PauseCircle",
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
                    PathNode.MoveTo(116.0f, 96.0f),
                    PathNode.LineTo(116.0f, 160.0f),
                    PathNode.CurveTo(116.0f, 166.62741f, 110.62742f, 172.0f, 104.0f, 172.0f),
                    PathNode.CurveTo(97.37258f, 172.0f, 92.0f, 166.62741f, 92.0f, 160.0f),
                    PathNode.LineTo(92.0f, 96.0f),
                    PathNode.CurveTo(92.0f, 89.37258f, 97.37258f, 84.0f, 104.0f, 84.0f),
                    PathNode.CurveTo(110.62742f, 84.0f, 116.0f, 89.37258f, 116.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 96.0f),
                    PathNode.LineTo(164.0f, 160.0f),
                    PathNode.CurveTo(164.0f, 166.62741f, 158.62741f, 172.0f, 152.0f, 172.0f),
                    PathNode.CurveTo(145.37259f, 172.0f, 140.0f, 166.62741f, 140.0f, 160.0f),
                    PathNode.LineTo(140.0f, 96.0f),
                    PathNode.CurveTo(140.0f, 89.37258f, 145.37259f, 84.0f, 152.0f, 84.0f),
                    PathNode.CurveTo(158.62741f, 84.0f, 164.0f, 89.37258f, 164.0f, 96.0f),
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
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
