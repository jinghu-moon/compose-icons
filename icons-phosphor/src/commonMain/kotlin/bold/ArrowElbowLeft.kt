package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorBoldIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.49f, 104.49f),
                    PathNode.LineTo(144.49f, 200.49f),
                    PathNode.CurveTo(142.23837f, 202.74945f, 139.17982f, 204.01947f, 135.99f, 204.01947f),
                    PathNode.CurveTo(132.80019f, 204.01947f, 129.74162f, 202.74945f, 127.49f, 200.49f),
                    PathNode.LineTo(36.0f, 109.0f),
                    PathNode.LineTo(36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 158.62741f, 30.627417f, 164.0f, 24.0f, 164.0f),
                    PathNode.CurveTo(17.372583f, 164.0f, 12.0f, 158.62741f, 12.0f, 152.0f),
                    PathNode.LineTo(12.0f, 80.0f),
                    PathNode.CurveTo(12.0f, 73.37258f, 17.372583f, 68.0f, 24.0f, 68.0f),
                    PathNode.LineTo(96.0f, 68.0f),
                    PathNode.CurveTo(102.62742f, 68.0f, 108.0f, 73.37258f, 108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 86.62742f, 102.62742f, 92.0f, 96.0f, 92.0f),
                    PathNode.LineTo(53.0f, 92.0f),
                    PathNode.LineTo(136.0f, 175.0f),
                    PathNode.LineTo(223.51f, 87.48f),
                    PathNode.CurveTo(228.20442f, 82.78558f, 235.81558f, 82.78558f, 240.51f, 87.48f),
                    PathNode.CurveTo(245.20442f, 92.17442f, 245.20442f, 99.785576f, 240.51f, 104.48f),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
