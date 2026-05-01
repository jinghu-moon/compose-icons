package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorBoldIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 60.0f),
                    PathNode.LineTo(12.0f, 60.0f),
                    PathNode.CurveTo(5.372583f, 60.0f, 0f, 65.37258f, 0f, 72.0f),
                    PathNode.CurveTo(0f, 78.62742f, 5.372583f, 84.0f, 12.0f, 84.0f),
                    PathNode.LineTo(16.0f, 84.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 198.62741f, 21.372583f, 204.0f, 28.0f, 204.0f),
                    PathNode.CurveTo(34.62742f, 204.0f, 40.0f, 198.62741f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 156.0f),
                    PathNode.LineTo(216.0f, 156.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 198.62741f, 221.37259f, 204.0f, 228.0f, 204.0f),
                    PathNode.CurveTo(234.62741f, 204.0f, 240.0f, 198.62741f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 84.0f),
                    PathNode.LineTo(244.0f, 84.0f),
                    PathNode.CurveTo(250.62741f, 84.0f, 256.0f, 78.62742f, 256.0f, 72.0f),
                    PathNode.CurveTo(256.0f, 65.37258f, 250.62741f, 60.0f, 244.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 84.0f),
                    PathNode.LineTo(116.0f, 84.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.LineTo(40.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 132.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.LineTo(140.0f, 84.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 108.0f),
                    PathNode.CurveTo(100.0f, 114.62742f, 94.62742f, 120.0f, 88.0f, 120.0f),
                    PathNode.LineTo(68.0f, 120.0f),
                    PathNode.CurveTo(61.37258f, 120.0f, 56.0f, 114.62742f, 56.0f, 108.0f),
                    PathNode.CurveTo(56.0f, 101.37258f, 61.37258f, 96.0f, 68.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(94.62742f, 96.0f, 100.0f, 101.37258f, 100.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 108.0f),
                    PathNode.CurveTo(156.0f, 101.37258f, 161.37259f, 96.0f, 168.0f, 96.0f),
                    PathNode.LineTo(188.0f, 96.0f),
                    PathNode.CurveTo(194.62741f, 96.0f, 200.0f, 101.37258f, 200.0f, 108.0f),
                    PathNode.CurveTo(200.0f, 114.62742f, 194.62741f, 120.0f, 188.0f, 120.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(161.37259f, 120.0f, 156.0f, 114.62742f, 156.0f, 108.0f),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
