package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorBoldIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.49f, 200.49f),
                    PathNode.CurveTo(198.23837f, 202.74945f, 195.17982f, 204.01947f, 191.99f, 204.01947f),
                    PathNode.CurveTo(188.80019f, 204.01947f, 185.74162f, 202.74945f, 183.49f, 200.49f),
                    PathNode.LineTo(76.0f, 93.0f),
                    PathNode.LineTo(76.0f, 168.0f),
                    PathNode.CurveTo(76.0f, 174.62741f, 70.62742f, 180.0f, 64.0f, 180.0f),
                    PathNode.CurveTo(57.37258f, 180.0f, 52.0f, 174.62741f, 52.0f, 168.0f),
                    PathNode.LineTo(52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 57.37258f, 57.37258f, 52.0f, 64.0f, 52.0f),
                    PathNode.LineTo(168.0f, 52.0f),
                    PathNode.CurveTo(174.62741f, 52.0f, 180.0f, 57.37258f, 180.0f, 64.0f),
                    PathNode.CurveTo(180.0f, 70.62742f, 174.62741f, 76.0f, 168.0f, 76.0f),
                    PathNode.LineTo(93.0f, 76.0f),
                    PathNode.LineTo(200.49f, 183.51f),
                    PathNode.CurveTo(202.74333f, 185.76082f, 204.00945f, 188.8151f, 204.00945f, 192.0f),
                    PathNode.CurveTo(204.00945f, 195.1849f, 202.74333f, 198.23918f, 200.49f, 200.49f),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
