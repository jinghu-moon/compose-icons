package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) return _checkSquare!!
        _checkSquare = phosphorBoldIcon(
            name = "CheckSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(79.51f, 144.49f),
                    PathNode.CurveTo(74.81558f, 139.79558f, 74.81558f, 132.18442f, 79.51f, 127.49f),
                    PathNode.CurveTo(84.20442f, 122.79558f, 91.81558f, 122.79558f, 96.51f, 127.49f),
                    PathNode.LineTo(112.0f, 143.0f),
                    PathNode.LineTo(159.51f, 95.48f),
                    PathNode.CurveTo(164.20442f, 90.78558f, 171.81558f, 90.78558f, 176.51f, 95.48f),
                    PathNode.CurveTo(181.20442f, 100.17442f, 181.20442f, 107.785576f, 176.51f, 112.48f),
                    PathNode.LineTo(120.51f, 168.48f),
                    PathNode.CurveTo(118.25838f, 170.73946f, 115.19982f, 172.00946f, 112.01f, 172.00946f),
                    PathNode.CurveTo(108.82018f, 172.00946f, 105.76162f, 170.73946f, 103.51f, 168.48f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 219.0457f, 219.0457f, 228.0f, 208.0f, 228.0f),
                    PathNode.LineTo(48.0f, 228.0f),
                    PathNode.CurveTo(36.954304f, 228.0f, 28.0f, 219.0457f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 36.954304f, 36.954304f, 28.0f, 48.0f, 28.0f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(219.0457f, 28.0f, 228.0f, 36.954304f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 52.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(204.0f, 204.0f),
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
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
