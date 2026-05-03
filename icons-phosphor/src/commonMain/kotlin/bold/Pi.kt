package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorBoldIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 172.0f),
                    PathNode.CurveTo(236.0f, 194.09138f, 218.09138f, 212.0f, 196.0f, 212.0f),
                    PathNode.CurveTo(173.90862f, 212.0f, 156.0f, 194.09138f, 156.0f, 172.0f),
                    PathNode.LineTo(156.0f, 76.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.LineTo(100.0f, 200.0f),
                    PathNode.CurveTo(100.0f, 206.62741f, 94.62742f, 212.0f, 88.0f, 212.0f),
                    PathNode.CurveTo(81.37258f, 212.0f, 76.0f, 206.62741f, 76.0f, 200.0f),
                    PathNode.LineTo(76.0f, 76.0f),
                    PathNode.LineTo(72.0f, 76.0f),
                    PathNode.CurveTo(52.11775f, 76.0f, 36.0f, 92.11775f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 118.62742f, 30.627417f, 124.0f, 24.0f, 124.0f),
                    PathNode.CurveTo(17.372583f, 124.0f, 12.0f, 118.62742f, 12.0f, 112.0f),
                    PathNode.CurveTo(12.038574f, 78.87891f, 38.878906f, 52.038574f, 72.0f, 52.0f),
                    PathNode.LineTo(224.0f, 52.0f),
                    PathNode.CurveTo(230.62741f, 52.0f, 236.0f, 57.37258f, 236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 70.62742f, 230.62741f, 76.0f, 224.0f, 76.0f),
                    PathNode.LineTo(180.0f, 76.0f),
                    PathNode.LineTo(180.0f, 172.0f),
                    PathNode.CurveTo(180.0f, 180.83656f, 187.16344f, 188.0f, 196.0f, 188.0f),
                    PathNode.CurveTo(204.83656f, 188.0f, 212.0f, 180.83656f, 212.0f, 172.0f),
                    PathNode.CurveTo(212.0f, 165.37259f, 217.37259f, 160.0f, 224.0f, 160.0f),
                    PathNode.CurveTo(230.62741f, 160.0f, 236.0f, 165.37259f, 236.0f, 172.0f),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
