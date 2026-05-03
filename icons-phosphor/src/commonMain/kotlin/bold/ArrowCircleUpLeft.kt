package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) return _arrowCircleUpLeft!!
        _arrowCircleUpLeft = phosphorBoldIcon(
            name = "ArrowCircleUpLeft",
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
                    PathNode.MoveTo(168.49f, 151.51f),
                    PathNode.CurveTo(173.18442f, 156.20442f, 173.18442f, 163.81558f, 168.49f, 168.51f),
                    PathNode.CurveTo(163.79558f, 173.20442f, 156.18442f, 173.20442f, 151.49f, 168.51f),
                    PathNode.LineTo(108.0f, 125.0f),
                    PathNode.LineTo(108.0f, 144.0f),
                    PathNode.CurveTo(108.0f, 150.62741f, 102.62742f, 156.0f, 96.0f, 156.0f),
                    PathNode.CurveTo(89.37258f, 156.0f, 84.0f, 150.62741f, 84.0f, 144.0f),
                    PathNode.LineTo(84.0f, 96.0f),
                    PathNode.CurveTo(84.0f, 89.37258f, 89.37258f, 84.0f, 96.0f, 84.0f),
                    PathNode.LineTo(144.0f, 84.0f),
                    PathNode.CurveTo(150.62741f, 84.0f, 156.0f, 89.37258f, 156.0f, 96.0f),
                    PathNode.CurveTo(156.0f, 102.62742f, 150.62741f, 108.0f, 144.0f, 108.0f),
                    PathNode.LineTo(125.0f, 108.0f),
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
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
