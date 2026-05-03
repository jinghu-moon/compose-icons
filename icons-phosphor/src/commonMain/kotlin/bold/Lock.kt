package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = phosphorBoldIcon(
            name = "Lock",
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
                    PathNode.MoveTo(144.0f, 152.0f),
                    PathNode.CurveTo(144.0f, 160.83656f, 136.83656f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(119.163445f, 168.0f, 112.0f, 160.83656f, 112.0f, 152.0f),
                    PathNode.CurveTo(112.0f, 143.16344f, 119.163445f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(136.83656f, 136.0f, 144.0f, 143.16344f, 144.0f, 152.0f),
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
        return _lock!!
    }

private var _lock: ImageVector? = null
