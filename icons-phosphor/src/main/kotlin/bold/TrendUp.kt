package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorBoldIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 56.0f),
                    PathNode.LineTo(244.0f, 120.0f),
                    PathNode.CurveTo(244.0f, 126.62742f, 238.62741f, 132.0f, 232.0f, 132.0f),
                    PathNode.CurveTo(225.37259f, 132.0f, 220.0f, 126.62742f, 220.0f, 120.0f),
                    PathNode.LineTo(220.0f, 85.0f),
                    PathNode.LineTo(144.49f, 160.52f),
                    PathNode.CurveTo(142.23837f, 162.77945f, 139.17982f, 164.04947f, 135.99f, 164.04947f),
                    PathNode.CurveTo(132.80019f, 164.04947f, 129.74162f, 162.77945f, 127.49f, 160.52f),
                    PathNode.LineTo(96.0f, 129.0f),
                    PathNode.LineTo(32.49f, 192.49f),
                    PathNode.CurveTo(27.79558f, 197.18442f, 20.18442f, 197.18442f, 15.49f, 192.49f),
                    PathNode.CurveTo(10.79558f, 187.79558f, 10.79558f, 180.18442f, 15.49f, 175.49f),
                    PathNode.LineTo(87.49f, 103.49f),
                    PathNode.CurveTo(89.74162f, 101.230545f, 92.80018f, 99.96054f, 95.99f, 99.96054f),
                    PathNode.CurveTo(99.17982f, 99.96054f, 102.23838f, 101.230545f, 104.49f, 103.49f),
                    PathNode.LineTo(136.0f, 135.0f),
                    PathNode.LineTo(203.0f, 68.0f),
                    PathNode.LineTo(168.0f, 68.0f),
                    PathNode.CurveTo(161.37259f, 68.0f, 156.0f, 62.62742f, 156.0f, 56.0f),
                    PathNode.CurveTo(156.0f, 49.37258f, 161.37259f, 44.0f, 168.0f, 44.0f),
                    PathNode.LineTo(232.0f, 44.0f),
                    PathNode.CurveTo(238.62741f, 44.0f, 244.0f, 49.37258f, 244.0f, 56.0f),
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
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
