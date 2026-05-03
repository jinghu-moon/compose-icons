package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorBoldIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 198.62741f, 222.62741f, 204.0f, 216.0f, 204.0f),
                    PathNode.CurveTo(209.37259f, 204.0f, 204.0f, 198.62741f, 204.0f, 192.0f),
                    PathNode.CurveTo(204.0f, 114.8f, 141.2f, 52.0f, 64.0f, 52.0f),
                    PathNode.CurveTo(57.37258f, 52.0f, 52.0f, 46.62742f, 52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 33.37258f, 57.37258f, 28.0f, 64.0f, 28.0f),
                    PathNode.CurveTo(154.43f, 28.0f, 228.0f, 101.57f, 228.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 100.0f),
                    PathNode.CurveTo(57.37258f, 100.0f, 52.0f, 105.37258f, 52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 118.62742f, 57.37258f, 124.0f, 64.0f, 124.0f),
                    PathNode.CurveTo(101.53937f, 124.03858f, 131.96141f, 154.46065f, 132.0f, 192.0f),
                    PathNode.CurveTo(132.0f, 198.62741f, 137.37259f, 204.0f, 144.0f, 204.0f),
                    PathNode.CurveTo(150.62741f, 204.0f, 156.0f, 198.62741f, 156.0f, 192.0f),
                    PathNode.CurveTo(155.94489f, 141.21265f, 114.78735f, 100.055115f, 64.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 172.0f),
                    PathNode.CurveTo(59.163445f, 172.0f, 52.0f, 179.16344f, 52.0f, 188.0f),
                    PathNode.CurveTo(52.0f, 196.83656f, 59.163445f, 204.0f, 68.0f, 204.0f),
                    PathNode.CurveTo(76.836555f, 204.0f, 84.0f, 196.83656f, 84.0f, 188.0f),
                    PathNode.CurveTo(84.0f, 179.16344f, 76.836555f, 172.0f, 68.0f, 172.0f),
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
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
