package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorBoldIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.49f, 72.48f),
                    PathNode.LineTo(93.0f, 180.0f),
                    PathNode.LineTo(168.0f, 180.0f),
                    PathNode.CurveTo(174.62741f, 180.0f, 180.0f, 185.37259f, 180.0f, 192.0f),
                    PathNode.CurveTo(180.0f, 198.62741f, 174.62741f, 204.0f, 168.0f, 204.0f),
                    PathNode.LineTo(64.0f, 204.0f),
                    PathNode.CurveTo(57.37258f, 204.0f, 52.0f, 198.62741f, 52.0f, 192.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(52.0f, 81.37258f, 57.37258f, 76.0f, 64.0f, 76.0f),
                    PathNode.CurveTo(70.62742f, 76.0f, 76.0f, 81.37258f, 76.0f, 88.0f),
                    PathNode.LineTo(76.0f, 163.0f),
                    PathNode.LineTo(183.51f, 55.51f),
                    PathNode.CurveTo(188.20442f, 50.81558f, 195.81558f, 50.81558f, 200.51f, 55.51f),
                    PathNode.CurveTo(205.20442f, 60.20442f, 205.20442f, 67.81558f, 200.51f, 72.51f),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
