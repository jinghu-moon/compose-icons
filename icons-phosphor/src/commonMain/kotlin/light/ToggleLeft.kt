package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorLightIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 58.0f),
                    PathNode.LineTo(80.0f, 58.0f),
                    PathNode.CurveTo(41.34007f, 58.0f, 10.0f, 89.340065f, 10.0f, 128.0f),
                    PathNode.CurveTo(10.0f, 166.65993f, 41.34007f, 198.0f, 80.0f, 198.0f),
                    PathNode.LineTo(176.0f, 198.0f),
                    PathNode.CurveTo(214.65993f, 198.0f, 246.0f, 166.65993f, 246.0f, 128.0f),
                    PathNode.CurveTo(246.0f, 89.340065f, 214.65993f, 58.0f, 176.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 186.0f),
                    PathNode.LineTo(80.0f, 186.0f),
                    PathNode.CurveTo(47.967484f, 186.0f, 22.0f, 160.03252f, 22.0f, 128.0f),
                    PathNode.CurveTo(22.0f, 95.96748f, 47.967484f, 70.0f, 80.0f, 70.0f),
                    PathNode.LineTo(176.0f, 70.0f),
                    PathNode.CurveTo(208.03252f, 70.0f, 234.0f, 95.96748f, 234.0f, 128.0f),
                    PathNode.CurveTo(234.0f, 160.03252f, 208.03252f, 186.0f, 176.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 90.0f),
                    PathNode.CurveTo(59.01318f, 90.0f, 42.0f, 107.013176f, 42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 148.98682f, 59.01318f, 166.0f, 80.0f, 166.0f),
                    PathNode.CurveTo(100.986824f, 166.0f, 118.0f, 148.98682f, 118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 107.013176f, 100.986824f, 90.0f, 80.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 154.0f),
                    PathNode.CurveTo(65.640594f, 154.0f, 54.0f, 142.3594f, 54.0f, 128.0f),
                    PathNode.CurveTo(54.0f, 113.640594f, 65.640594f, 102.0f, 80.0f, 102.0f),
                    PathNode.CurveTo(94.359406f, 102.0f, 106.0f, 113.640594f, 106.0f, 128.0f),
                    PathNode.CurveTo(106.0f, 142.3594f, 94.359406f, 154.0f, 80.0f, 154.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
