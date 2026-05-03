package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleUpRight: ImageVector
    get() {
        if (_arrowCircleUpRight != null) return _arrowCircleUpRight!!
        _arrowCircleUpRight = phosphorBoldIcon(
            name = "ArrowCircleUpRight",
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
                    PathNode.MoveTo(172.0f, 96.0f),
                    PathNode.LineTo(172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 150.62741f, 166.62741f, 156.0f, 160.0f, 156.0f),
                    PathNode.CurveTo(153.37259f, 156.0f, 148.0f, 150.62741f, 148.0f, 144.0f),
                    PathNode.LineTo(148.0f, 125.0f),
                    PathNode.LineTo(104.49f, 168.52f),
                    PathNode.CurveTo(99.79558f, 173.21442f, 92.18442f, 173.21442f, 87.49f, 168.52f),
                    PathNode.CurveTo(82.79558f, 163.82558f, 82.79558f, 156.21442f, 87.49f, 151.52f),
                    PathNode.LineTo(131.0f, 108.0f),
                    PathNode.LineTo(112.0f, 108.0f),
                    PathNode.CurveTo(105.37258f, 108.0f, 100.0f, 102.62742f, 100.0f, 96.0f),
                    PathNode.CurveTo(100.0f, 89.37258f, 105.37258f, 84.0f, 112.0f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(166.62741f, 84.0f, 172.0f, 89.37258f, 172.0f, 96.0f),
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
        return _arrowCircleUpRight!!
    }

private var _arrowCircleUpRight: ImageVector? = null
