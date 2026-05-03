package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockAfternoon: ImageVector
    get() {
        if (_clockAfternoon != null) return _clockAfternoon!!
        _clockAfternoon = phosphorBoldIcon(
            name = "ClockAfternoon",
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
                    PathNode.MoveTo(196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 134.62741f, 190.62741f, 140.0f, 184.0f, 140.0f),
                    PathNode.LineTo(157.0f, 140.0f),
                    PathNode.LineTo(176.52f, 159.51f),
                    PathNode.CurveTo(181.21442f, 164.20442f, 181.21442f, 171.81558f, 176.52f, 176.51f),
                    PathNode.CurveTo(171.82558f, 181.20442f, 164.21442f, 181.20442f, 159.52f, 176.51f),
                    PathNode.LineTo(119.52f, 136.51f),
                    PathNode.CurveTo(116.07098f, 133.08105f, 115.032684f, 127.90942f, 116.89095f, 123.41495f),
                    PathNode.CurveTo(118.74922f, 118.92048f, 123.13653f, 115.99209f, 128.0f, 116.0f),
                    PathNode.LineTo(184.0f, 116.0f),
                    PathNode.CurveTo(190.62741f, 116.0f, 196.0f, 121.37258f, 196.0f, 128.0f),
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
        return _clockAfternoon!!
    }

private var _clockAfternoon: ImageVector? = null
