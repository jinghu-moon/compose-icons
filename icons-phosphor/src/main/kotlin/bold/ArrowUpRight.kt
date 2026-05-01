package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorBoldIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 64.0f),
                    PathNode.LineTo(204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 174.62741f, 198.62741f, 180.0f, 192.0f, 180.0f),
                    PathNode.CurveTo(185.37259f, 180.0f, 180.0f, 174.62741f, 180.0f, 168.0f),
                    PathNode.LineTo(180.0f, 93.0f),
                    PathNode.LineTo(72.49f, 200.49f),
                    PathNode.CurveTo(67.79558f, 205.18442f, 60.18442f, 205.18442f, 55.49f, 200.49f),
                    PathNode.CurveTo(50.79558f, 195.79558f, 50.79558f, 188.18442f, 55.49f, 183.49f),
                    PathNode.LineTo(163.0f, 76.0f),
                    PathNode.LineTo(88.0f, 76.0f),
                    PathNode.CurveTo(81.37258f, 76.0f, 76.0f, 70.62742f, 76.0f, 64.0f),
                    PathNode.CurveTo(76.0f, 57.37258f, 81.37258f, 52.0f, 88.0f, 52.0f),
                    PathNode.LineTo(192.0f, 52.0f),
                    PathNode.CurveTo(198.62741f, 52.0f, 204.0f, 57.37258f, 204.0f, 64.0f),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
