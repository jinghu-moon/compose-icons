package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorLightIcon(
            name = "ToggleRight",
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
                    PathNode.MoveTo(176.0f, 90.0f),
                    PathNode.CurveTo(155.01318f, 90.0f, 138.0f, 107.013176f, 138.0f, 128.0f),
                    PathNode.CurveTo(138.0f, 148.98682f, 155.01318f, 166.0f, 176.0f, 166.0f),
                    PathNode.CurveTo(196.98682f, 166.0f, 214.0f, 148.98682f, 214.0f, 128.0f),
                    PathNode.CurveTo(214.0f, 107.013176f, 196.98682f, 90.0f, 176.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 154.0f),
                    PathNode.CurveTo(161.6406f, 154.0f, 150.0f, 142.3594f, 150.0f, 128.0f),
                    PathNode.CurveTo(150.0f, 113.640594f, 161.6406f, 102.0f, 176.0f, 102.0f),
                    PathNode.CurveTo(190.3594f, 102.0f, 202.0f, 113.640594f, 202.0f, 128.0f),
                    PathNode.CurveTo(202.0f, 142.3594f, 190.3594f, 154.0f, 176.0f, 154.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
