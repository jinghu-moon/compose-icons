package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorBoldIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 204.0f),
                    PathNode.LineTo(228.0f, 204.0f),
                    PathNode.LineTo(228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 84.95431f, 219.0457f, 76.0f, 208.0f, 76.0f),
                    PathNode.LineTo(172.0f, 76.0f),
                    PathNode.LineTo(172.0f, 32.0f),
                    PathNode.CurveTo(171.99754f, 25.167318f, 168.5071f, 18.808708f, 162.74403f, 15.13818f),
                    PathNode.CurveTo(156.98097f, 11.467652f, 149.74289f, 10.993191f, 143.55f, 13.88f),
                    PathNode.LineTo(39.55f, 62.42f),
                    PathNode.CurveTo(32.5136f, 65.71634f, 28.013737f, 72.77976f, 28.0f, 80.55f),
                    PathNode.LineTo(28.0f, 204.0f),
                    PathNode.LineTo(16.0f, 204.0f),
                    PathNode.CurveTo(9.372583f, 204.0f, 4.0f, 209.37259f, 4.0f, 216.0f),
                    PathNode.CurveTo(4.0f, 222.62741f, 9.372583f, 228.0f, 16.0f, 228.0f),
                    PathNode.LineTo(240.0f, 228.0f),
                    PathNode.CurveTo(246.62741f, 228.0f, 252.0f, 222.62741f, 252.0f, 216.0f),
                    PathNode.CurveTo(252.0f, 209.37259f, 246.62741f, 204.0f, 240.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 100.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.LineTo(172.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 83.09f),
                    PathNode.LineTo(148.0f, 38.3f),
                    PathNode.LineTo(148.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 112.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.CurveTo(132.0f, 130.62741f, 126.62742f, 136.0f, 120.0f, 136.0f),
                    PathNode.CurveTo(113.37258f, 136.0f, 108.0f, 130.62741f, 108.0f, 124.0f),
                    PathNode.LineTo(108.0f, 112.0f),
                    PathNode.CurveTo(108.0f, 105.37258f, 113.37258f, 100.0f, 120.0f, 100.0f),
                    PathNode.CurveTo(126.62742f, 100.0f, 132.0f, 105.37258f, 132.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 112.0f),
                    PathNode.LineTo(92.0f, 124.0f),
                    PathNode.CurveTo(92.0f, 130.62741f, 86.62742f, 136.0f, 80.0f, 136.0f),
                    PathNode.CurveTo(73.37258f, 136.0f, 68.0f, 130.62741f, 68.0f, 124.0f),
                    PathNode.LineTo(68.0f, 112.0f),
                    PathNode.CurveTo(68.0f, 105.37258f, 73.37258f, 100.0f, 80.0f, 100.0f),
                    PathNode.CurveTo(86.62742f, 100.0f, 92.0f, 105.37258f, 92.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 164.0f),
                    PathNode.LineTo(92.0f, 176.0f),
                    PathNode.CurveTo(92.0f, 182.62741f, 86.62742f, 188.0f, 80.0f, 188.0f),
                    PathNode.CurveTo(73.37258f, 188.0f, 68.0f, 182.62741f, 68.0f, 176.0f),
                    PathNode.LineTo(68.0f, 164.0f),
                    PathNode.CurveTo(68.0f, 157.37259f, 73.37258f, 152.0f, 80.0f, 152.0f),
                    PathNode.CurveTo(86.62742f, 152.0f, 92.0f, 157.37259f, 92.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 164.0f),
                    PathNode.LineTo(132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 182.62741f, 126.62742f, 188.0f, 120.0f, 188.0f),
                    PathNode.CurveTo(113.37258f, 188.0f, 108.0f, 182.62741f, 108.0f, 176.0f),
                    PathNode.LineTo(108.0f, 164.0f),
                    PathNode.CurveTo(108.0f, 157.37259f, 113.37258f, 152.0f, 120.0f, 152.0f),
                    PathNode.CurveTo(126.62742f, 152.0f, 132.0f, 157.37259f, 132.0f, 164.0f),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
