package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleDownRight: ImageVector
    get() {
        if (_arrowCircleDownRight != null) return _arrowCircleDownRight!!
        _arrowCircleDownRight = phosphorBoldIcon(
            name = "ArrowCircleDownRight",
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
                    PathNode.MoveTo(172.0f, 112.0f),
                    PathNode.LineTo(172.0f, 160.0f),
                    PathNode.CurveTo(172.0f, 166.62741f, 166.62741f, 172.0f, 160.0f, 172.0f),
                    PathNode.LineTo(112.0f, 172.0f),
                    PathNode.CurveTo(105.37258f, 172.0f, 100.0f, 166.62741f, 100.0f, 160.0f),
                    PathNode.CurveTo(100.0f, 153.37259f, 105.37258f, 148.0f, 112.0f, 148.0f),
                    PathNode.LineTo(131.0f, 148.0f),
                    PathNode.LineTo(87.51f, 104.49f),
                    PathNode.CurveTo(82.81558f, 99.79558f, 82.81558f, 92.18442f, 87.51f, 87.49f),
                    PathNode.CurveTo(92.20442f, 82.79558f, 99.81558f, 82.79558f, 104.51f, 87.49f),
                    PathNode.LineTo(148.0f, 131.0f),
                    PathNode.LineTo(148.0f, 112.0f),
                    PathNode.CurveTo(148.0f, 105.37258f, 153.37259f, 100.0f, 160.0f, 100.0f),
                    PathNode.CurveTo(166.62741f, 100.0f, 172.0f, 105.37258f, 172.0f, 112.0f),
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
        return _arrowCircleDownRight!!
    }

private var _arrowCircleDownRight: ImageVector? = null
