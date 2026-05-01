package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorBoldIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 88.49f),
                    PathNode.LineTo(176.49f, 136.49f),
                    PathNode.CurveTo(171.79558f, 141.18442f, 164.18442f, 141.18442f, 159.49f, 136.49f),
                    PathNode.CurveTo(154.79558f, 131.79558f, 154.79558f, 124.18442f, 159.49f, 119.49f),
                    PathNode.LineTo(187.0f, 92.0f),
                    PathNode.LineTo(84.0f, 92.0f),
                    PathNode.LineTo(84.0f, 224.0f),
                    PathNode.CurveTo(84.0f, 230.62741f, 78.62742f, 236.0f, 72.0f, 236.0f),
                    PathNode.CurveTo(65.37258f, 236.0f, 60.0f, 230.62741f, 60.0f, 224.0f),
                    PathNode.LineTo(60.0f, 80.0f),
                    PathNode.CurveTo(60.0f, 73.37258f, 65.37258f, 68.0f, 72.0f, 68.0f),
                    PathNode.LineTo(187.0f, 68.0f),
                    PathNode.LineTo(159.51f, 40.49f),
                    PathNode.CurveTo(154.81558f, 35.79558f, 154.81558f, 28.18442f, 159.51f, 23.49f),
                    PathNode.CurveTo(164.20442f, 18.79558f, 171.81558f, 18.79558f, 176.51f, 23.49f),
                    PathNode.LineTo(224.51f, 71.49f),
                    PathNode.CurveTo(226.7668f, 73.74428f, 228.03322f, 76.80434f, 228.02946f, 79.99415f),
                    PathNode.CurveTo(228.02571f, 83.18397f, 226.7521f, 86.241035f, 224.49f, 88.49f),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
