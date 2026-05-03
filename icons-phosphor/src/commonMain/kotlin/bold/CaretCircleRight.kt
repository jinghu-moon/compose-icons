package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleRight: ImageVector
    get() {
        if (_caretCircleRight != null) return _caretCircleRight!!
        _caretCircleRight = phosphorBoldIcon(
            name = "CaretCircleRight",
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
                    PathNode.MoveTo(160.49f, 119.51f),
                    PathNode.CurveTo(162.74945f, 121.76162f, 164.01947f, 124.82018f, 164.01947f, 128.01f),
                    PathNode.CurveTo(164.01947f, 131.19981f, 162.74945f, 134.25838f, 160.49f, 136.51f),
                    PathNode.LineTo(120.49f, 176.51f),
                    PathNode.CurveTo(115.79558f, 181.20442f, 108.18442f, 181.20442f, 103.49f, 176.51f),
                    PathNode.CurveTo(98.79558f, 171.81558f, 98.79558f, 164.20442f, 103.49f, 159.51f),
                    PathNode.LineTo(135.0f, 128.0f),
                    PathNode.LineTo(103.51f, 96.49f),
                    PathNode.CurveTo(98.81558f, 91.79558f, 98.81558f, 84.18442f, 103.51f, 79.49f),
                    PathNode.CurveTo(108.20442f, 74.79558f, 115.81558f, 74.79558f, 120.51f, 79.49f),
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
        return _caretCircleRight!!
    }

private var _caretCircleRight: ImageVector? = null
