package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) return _circlesFour!!
        _circlesFour = phosphorLightIcon(
            name = "CirclesFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 42.0f),
                    PathNode.CurveTo(59.01318f, 42.0f, 42.0f, 59.01318f, 42.0f, 80.0f),
                    PathNode.CurveTo(42.0f, 100.986824f, 59.01318f, 118.0f, 80.0f, 118.0f),
                    PathNode.CurveTo(100.986824f, 118.0f, 118.0f, 100.986824f, 118.0f, 80.0f),
                    PathNode.CurveTo(118.0f, 59.01318f, 100.986824f, 42.0f, 80.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 106.0f),
                    PathNode.CurveTo(65.640594f, 106.0f, 54.0f, 94.359406f, 54.0f, 80.0f),
                    PathNode.CurveTo(54.0f, 65.640594f, 65.640594f, 54.0f, 80.0f, 54.0f),
                    PathNode.CurveTo(94.359406f, 54.0f, 106.0f, 65.640594f, 106.0f, 80.0f),
                    PathNode.CurveTo(106.0f, 94.359406f, 94.359406f, 106.0f, 80.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 118.0f),
                    PathNode.CurveTo(196.98682f, 118.0f, 214.0f, 100.986824f, 214.0f, 80.0f),
                    PathNode.CurveTo(214.0f, 59.01318f, 196.98682f, 42.0f, 176.0f, 42.0f),
                    PathNode.CurveTo(155.01318f, 42.0f, 138.0f, 59.01318f, 138.0f, 80.0f),
                    PathNode.CurveTo(138.0f, 100.986824f, 155.01318f, 118.0f, 176.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 54.0f),
                    PathNode.CurveTo(190.3594f, 54.0f, 202.0f, 65.640594f, 202.0f, 80.0f),
                    PathNode.CurveTo(202.0f, 94.359406f, 190.3594f, 106.0f, 176.0f, 106.0f),
                    PathNode.CurveTo(161.6406f, 106.0f, 150.0f, 94.359406f, 150.0f, 80.0f),
                    PathNode.CurveTo(150.0f, 65.640594f, 161.6406f, 54.0f, 176.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 138.0f),
                    PathNode.CurveTo(59.01318f, 138.0f, 42.0f, 155.01318f, 42.0f, 176.0f),
                    PathNode.CurveTo(42.0f, 196.98682f, 59.01318f, 214.0f, 80.0f, 214.0f),
                    PathNode.CurveTo(100.986824f, 214.0f, 118.0f, 196.98682f, 118.0f, 176.0f),
                    PathNode.CurveTo(118.0f, 155.01318f, 100.986824f, 138.0f, 80.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 202.0f),
                    PathNode.CurveTo(65.640594f, 202.0f, 54.0f, 190.3594f, 54.0f, 176.0f),
                    PathNode.CurveTo(54.0f, 161.6406f, 65.640594f, 150.0f, 80.0f, 150.0f),
                    PathNode.CurveTo(94.359406f, 150.0f, 106.0f, 161.6406f, 106.0f, 176.0f),
                    PathNode.CurveTo(106.0f, 190.3594f, 94.359406f, 202.0f, 80.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 138.0f),
                    PathNode.CurveTo(155.01318f, 138.0f, 138.0f, 155.01318f, 138.0f, 176.0f),
                    PathNode.CurveTo(138.0f, 196.98682f, 155.01318f, 214.0f, 176.0f, 214.0f),
                    PathNode.CurveTo(196.98682f, 214.0f, 214.0f, 196.98682f, 214.0f, 176.0f),
                    PathNode.CurveTo(214.0f, 155.01318f, 196.98682f, 138.0f, 176.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 202.0f),
                    PathNode.CurveTo(161.6406f, 202.0f, 150.0f, 190.3594f, 150.0f, 176.0f),
                    PathNode.CurveTo(150.0f, 161.6406f, 161.6406f, 150.0f, 176.0f, 150.0f),
                    PathNode.CurveTo(190.3594f, 150.0f, 202.0f, 161.6406f, 202.0f, 176.0f),
                    PathNode.CurveTo(202.0f, 190.3594f, 190.3594f, 202.0f, 176.0f, 202.0f),
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
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null
