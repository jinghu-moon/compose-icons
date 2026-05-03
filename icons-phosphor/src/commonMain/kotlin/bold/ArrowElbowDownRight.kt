package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorBoldIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 184.49f),
                    PathNode.LineTo(176.49f, 232.49f),
                    PathNode.CurveTo(171.79558f, 237.18442f, 164.18442f, 237.18442f, 159.49f, 232.49f),
                    PathNode.CurveTo(154.79558f, 227.79558f, 154.79558f, 220.18442f, 159.49f, 215.49f),
                    PathNode.LineTo(187.0f, 188.0f),
                    PathNode.LineTo(72.0f, 188.0f),
                    PathNode.CurveTo(65.37258f, 188.0f, 60.0f, 182.62741f, 60.0f, 176.0f),
                    PathNode.LineTo(60.0f, 32.0f),
                    PathNode.CurveTo(60.0f, 25.372583f, 65.37258f, 20.0f, 72.0f, 20.0f),
                    PathNode.CurveTo(78.62742f, 20.0f, 84.0f, 25.372583f, 84.0f, 32.0f),
                    PathNode.LineTo(84.0f, 164.0f),
                    PathNode.LineTo(187.0f, 164.0f),
                    PathNode.LineTo(159.48f, 136.49f),
                    PathNode.CurveTo(154.78558f, 131.79558f, 154.78558f, 124.18442f, 159.48f, 119.49f),
                    PathNode.CurveTo(164.17442f, 114.79558f, 171.78558f, 114.79558f, 176.48f, 119.49f),
                    PathNode.LineTo(224.48f, 167.49f),
                    PathNode.CurveTo(226.74078f, 169.7403f, 228.01259f, 172.79811f, 228.01447f, 175.98793f),
                    PathNode.CurveTo(228.01634f, 179.17773f, 226.74812f, 182.23705f, 224.49f, 184.49f),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
