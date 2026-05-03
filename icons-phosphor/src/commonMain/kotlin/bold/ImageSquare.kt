package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorBoldIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 52.0f),
                    PathNode.LineTo(204.0f, 115.72f),
                    PathNode.LineTo(186.14f, 97.86f),
                    PathNode.CurveTo(178.33f, 90.05236f, 165.67f, 90.05236f, 157.86f, 97.86f),
                    PathNode.LineTo(52.0f, 203.72f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.66f, 204.0f),
                    PathNode.LineTo(172.0f, 117.66f),
                    PathNode.LineTo(204.0f, 149.66f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 84.95431f, 84.95431f, 76.0f, 96.0f, 76.0f),
                    PathNode.CurveTo(107.04569f, 76.0f, 116.0f, 84.95431f, 116.0f, 96.0f),
                    PathNode.CurveTo(116.0f, 107.04569f, 107.04569f, 116.0f, 96.0f, 116.0f),
                    PathNode.CurveTo(84.95431f, 116.0f, 76.0f, 107.04569f, 76.0f, 96.0f),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
