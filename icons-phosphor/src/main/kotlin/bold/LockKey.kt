package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LockKey: ImageVector
    get() {
        if (_lockKey != null) return _lockKey!!
        _lockKey = phosphorBoldIcon(
            name = "LockKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 76.0f),
                    PathNode.LineTo(180.0f, 76.0f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 27.281193f, 156.71881f, 4.0f, 128.0f, 4.0f),
                    PathNode.CurveTo(99.2812f, 4.0f, 76.0f, 27.281193f, 76.0f, 56.0f),
                    PathNode.LineTo(76.0f, 76.0f),
                    PathNode.LineTo(48.0f, 76.0f),
                    PathNode.CurveTo(36.954304f, 76.0f, 28.0f, 84.95431f, 28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 84.95431f, 219.0457f, 76.0f, 208.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 40.53603f, 112.536026f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(143.46397f, 28.0f, 156.0f, 40.53603f, 156.0f, 56.0f),
                    PathNode.LineTo(156.0f, 76.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(112.688286f, 112.00566f, 99.52618f, 122.857254f, 96.60115f, 137.887f),
                    PathNode.CurveTo(93.67613f, 152.91672f, 101.80795f, 167.91245f, 116.0f, 173.66f),
                    PathNode.LineTo(116.0f, 180.0f),
                    PathNode.CurveTo(116.0f, 186.62741f, 121.37258f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(134.62741f, 192.0f, 140.0f, 186.62741f, 140.0f, 180.0f),
                    PathNode.LineTo(140.0f, 173.66f),
                    PathNode.CurveTo(154.19205f, 167.91245f, 162.32387f, 152.91672f, 159.39885f, 137.887f),
                    PathNode.CurveTo(156.47383f, 122.857254f, 143.3117f, 112.00566f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.CurveTo(132.41827f, 136.0f, 136.0f, 139.58173f, 136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 148.41827f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(123.58172f, 152.0f, 120.0f, 148.41827f, 120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 139.58173f, 123.58172f, 136.0f, 128.0f, 136.0f),
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
        return _lockKey!!
    }

private var _lockKey: ImageVector? = null
