package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorBoldIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 168.49f),
                    PathNode.LineTo(184.49f, 216.49f),
                    PathNode.CurveTo(182.23837f, 218.74945f, 179.17982f, 220.01947f, 175.99f, 220.01947f),
                    PathNode.CurveTo(172.80019f, 220.01947f, 169.74162f, 218.74945f, 167.49f, 216.49f),
                    PathNode.LineTo(119.49f, 168.49f),
                    PathNode.CurveTo(114.79558f, 163.79558f, 114.79558f, 156.18442f, 119.49f, 151.49f),
                    PathNode.CurveTo(124.18442f, 146.79558f, 131.79558f, 146.79558f, 136.49f, 151.49f),
                    PathNode.LineTo(164.0f, 179.0f),
                    PathNode.LineTo(164.0f, 76.0f),
                    PathNode.LineTo(32.0f, 76.0f),
                    PathNode.CurveTo(25.372583f, 76.0f, 20.0f, 70.62742f, 20.0f, 64.0f),
                    PathNode.CurveTo(20.0f, 57.37258f, 25.372583f, 52.0f, 32.0f, 52.0f),
                    PathNode.LineTo(176.0f, 52.0f),
                    PathNode.CurveTo(182.62741f, 52.0f, 188.0f, 57.37258f, 188.0f, 64.0f),
                    PathNode.LineTo(188.0f, 179.0f),
                    PathNode.LineTo(215.51f, 151.48f),
                    PathNode.CurveTo(220.20442f, 146.78558f, 227.81558f, 146.78558f, 232.51f, 151.48f),
                    PathNode.CurveTo(237.20442f, 156.17442f, 237.20442f, 163.78558f, 232.51f, 168.48f),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
