package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorBoldIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 76.0f),
                    PathNode.LineTo(111.42f, 76.0f),
                    PathNode.LineTo(90.73f, 34.63f),
                    PathNode.CurveTo(88.69684f, 30.566935f, 84.54337f, 28.000532f, 80.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(41.37258f, 28.0f, 36.0f, 33.37258f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 76.0f),
                    PathNode.LineTo(24.0f, 76.0f),
                    PathNode.CurveTo(17.372583f, 76.0f, 12.0f, 81.37258f, 12.0f, 88.0f),
                    PathNode.CurveTo(12.0f, 94.62742f, 17.372583f, 100.0f, 24.0f, 100.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(36.0f, 204.0f),
                    PathNode.LineTo(24.0f, 204.0f),
                    PathNode.CurveTo(17.372583f, 204.0f, 12.0f, 209.37259f, 12.0f, 216.0f),
                    PathNode.CurveTo(12.0f, 222.62741f, 17.372583f, 228.0f, 24.0f, 228.0f),
                    PathNode.LineTo(128.0f, 228.0f),
                    PathNode.CurveTo(134.62741f, 228.0f, 140.0f, 222.62741f, 140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 209.37259f, 134.62741f, 204.0f, 128.0f, 204.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(116.0f, 100.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.LineTo(192.0f, 180.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 169.37259f, 186.62741f, 164.0f, 180.0f, 164.0f),
                    PathNode.CurveTo(173.37259f, 164.0f, 168.0f, 169.37259f, 168.0f, 176.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.CurveTo(168.0f, 195.0457f, 176.9543f, 204.0f, 188.0f, 204.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(219.0457f, 204.0f, 228.0f, 195.0457f, 228.0f, 184.0f),
                    PathNode.LineTo(228.0f, 100.0f),
                    PathNode.LineTo(240.0f, 100.0f),
                    PathNode.CurveTo(246.62741f, 100.0f, 252.0f, 94.62742f, 252.0f, 88.0f),
                    PathNode.CurveTo(252.0f, 81.37258f, 246.62741f, 76.0f, 240.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 52.0f),
                    PathNode.LineTo(72.58f, 52.0f),
                    PathNode.LineTo(84.58f, 76.0f),
                    PathNode.LineTo(60.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 204.0f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 140.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.LineTo(60.0f, 100.0f),
                    PathNode.LineTo(92.0f, 100.0f),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
