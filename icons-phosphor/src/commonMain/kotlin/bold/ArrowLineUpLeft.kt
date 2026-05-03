package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorBoldIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 214.62741f, 230.62741f, 220.0f, 224.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 201.37259f, 41.37258f, 196.0f, 48.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(230.62741f, 196.0f, 236.0f, 201.37259f, 236.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 156.0f),
                    PathNode.CurveTo(78.62742f, 156.0f, 84.0f, 150.62741f, 84.0f, 144.0f),
                    PathNode.LineTo(84.0f, 77.0f),
                    PathNode.LineTo(175.51f, 168.52f),
                    PathNode.CurveTo(180.20442f, 173.21442f, 187.81558f, 173.21442f, 192.51f, 168.52f),
                    PathNode.CurveTo(197.20442f, 163.82558f, 197.20442f, 156.21442f, 192.51f, 151.52f),
                    PathNode.LineTo(101.0f, 60.0f),
                    PathNode.LineTo(168.0f, 60.0f),
                    PathNode.CurveTo(174.62741f, 60.0f, 180.0f, 54.62742f, 180.0f, 48.0f),
                    PathNode.CurveTo(180.0f, 41.37258f, 174.62741f, 36.0f, 168.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(65.37258f, 36.0f, 60.0f, 41.37258f, 60.0f, 48.0f),
                    PathNode.LineTo(60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 150.62741f, 65.37258f, 156.0f, 72.0f, 156.0f),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
