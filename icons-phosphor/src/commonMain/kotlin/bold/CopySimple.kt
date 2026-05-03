package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorBoldIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(33.37258f, 64.0f, 28.0f, 69.37258f, 28.0f, 76.0f),
                    PathNode.LineTo(28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 222.62741f, 33.37258f, 228.0f, 40.0f, 228.0f),
                    PathNode.LineTo(180.0f, 228.0f),
                    PathNode.CurveTo(186.62741f, 228.0f, 192.0f, 222.62741f, 192.0f, 216.0f),
                    PathNode.LineTo(192.0f, 76.0f),
                    PathNode.CurveTo(192.0f, 69.37258f, 186.62741f, 64.0f, 180.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 40.0f),
                    PathNode.LineTo(228.0f, 180.0f),
                    PathNode.CurveTo(228.0f, 186.62741f, 222.62741f, 192.0f, 216.0f, 192.0f),
                    PathNode.CurveTo(209.37259f, 192.0f, 204.0f, 186.62741f, 204.0f, 180.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.CurveTo(69.37258f, 52.0f, 64.0f, 46.62742f, 64.0f, 40.0f),
                    PathNode.CurveTo(64.0f, 33.37258f, 69.37258f, 28.0f, 76.0f, 28.0f),
                    PathNode.LineTo(216.0f, 28.0f),
                    PathNode.CurveTo(222.62741f, 28.0f, 228.0f, 33.37258f, 228.0f, 40.0f),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
