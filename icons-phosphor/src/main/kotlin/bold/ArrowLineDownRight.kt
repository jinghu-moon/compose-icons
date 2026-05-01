package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorBoldIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 46.62742f, 222.62741f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 46.62742f, 28.0f, 40.0f),
                    PathNode.CurveTo(28.0f, 33.37258f, 33.37258f, 28.0f, 40.0f, 28.0f),
                    PathNode.LineTo(216.0f, 28.0f),
                    PathNode.CurveTo(222.62741f, 28.0f, 228.0f, 33.37258f, 228.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 92.0f),
                    PathNode.CurveTo(185.37259f, 92.0f, 180.0f, 97.37258f, 180.0f, 104.0f),
                    PathNode.LineTo(180.0f, 171.0f),
                    PathNode.LineTo(88.49f, 79.51f),
                    PathNode.CurveTo(83.79558f, 74.81558f, 76.18442f, 74.81558f, 71.49f, 79.51f),
                    PathNode.CurveTo(66.79558f, 84.20442f, 66.79558f, 91.81558f, 71.49f, 96.51f),
                    PathNode.LineTo(163.0f, 188.0f),
                    PathNode.LineTo(96.0f, 188.0f),
                    PathNode.CurveTo(89.37258f, 188.0f, 84.0f, 193.37259f, 84.0f, 200.0f),
                    PathNode.CurveTo(84.0f, 206.62741f, 89.37258f, 212.0f, 96.0f, 212.0f),
                    PathNode.LineTo(192.0f, 212.0f),
                    PathNode.CurveTo(198.62741f, 212.0f, 204.0f, 206.62741f, 204.0f, 200.0f),
                    PathNode.LineTo(204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 97.37258f, 198.62741f, 92.0f, 192.0f, 92.0f),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
