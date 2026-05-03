package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorBoldIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 20.0f),
                    PathNode.CurveTo(185.37259f, 20.0f, 180.0f, 25.372583f, 180.0f, 32.0f),
                    PathNode.LineTo(180.0f, 60.0f),
                    PathNode.LineTo(76.0f, 60.0f),
                    PathNode.LineTo(76.0f, 32.0f),
                    PathNode.CurveTo(76.0f, 25.372583f, 70.62742f, 20.0f, 64.0f, 20.0f),
                    PathNode.CurveTo(57.37258f, 20.0f, 52.0f, 25.372583f, 52.0f, 32.0f),
                    PathNode.LineTo(52.0f, 224.0f),
                    PathNode.CurveTo(52.0f, 230.62741f, 57.37258f, 236.0f, 64.0f, 236.0f),
                    PathNode.CurveTo(70.62742f, 236.0f, 76.0f, 230.62741f, 76.0f, 224.0f),
                    PathNode.LineTo(76.0f, 196.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(180.0f, 224.0f),
                    PathNode.CurveTo(180.0f, 230.62741f, 185.37259f, 236.0f, 192.0f, 236.0f),
                    PathNode.CurveTo(198.62741f, 236.0f, 204.0f, 230.62741f, 204.0f, 224.0f),
                    PathNode.LineTo(204.0f, 32.0f),
                    PathNode.CurveTo(204.0f, 25.372583f, 198.62741f, 20.0f, 192.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 84.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.LineTo(76.0f, 116.0f),
                    PathNode.LineTo(76.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 172.0f),
                    PathNode.LineTo(76.0f, 140.0f),
                    PathNode.LineTo(180.0f, 140.0f),
                    PathNode.LineTo(180.0f, 172.0f),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
