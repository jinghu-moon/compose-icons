package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorBoldIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 192.0f),
                    PathNode.CurveTo(204.0f, 198.62741f, 198.62741f, 204.0f, 192.0f, 204.0f),
                    PathNode.LineTo(88.0f, 204.0f),
                    PathNode.CurveTo(81.37258f, 204.0f, 76.0f, 198.62741f, 76.0f, 192.0f),
                    PathNode.CurveTo(76.0f, 185.37259f, 81.37258f, 180.0f, 88.0f, 180.0f),
                    PathNode.LineTo(163.0f, 180.0f),
                    PathNode.LineTo(55.51f, 72.48f),
                    PathNode.CurveTo(50.81558f, 67.785576f, 50.81558f, 60.17442f, 55.51f, 55.48f),
                    PathNode.CurveTo(60.20442f, 50.78558f, 67.81558f, 50.78558f, 72.51f, 55.48f),
                    PathNode.LineTo(180.0f, 163.0f),
                    PathNode.LineTo(180.0f, 88.0f),
                    PathNode.CurveTo(180.0f, 81.37258f, 185.37259f, 76.0f, 192.0f, 76.0f),
                    PathNode.CurveTo(198.62741f, 76.0f, 204.0f, 81.37258f, 204.0f, 88.0f),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
