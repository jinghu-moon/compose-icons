package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextItalic: ImageVector
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = phosphorBoldIcon(
            name = "TextItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 56.0f),
                    PathNode.CurveTo(204.0f, 62.62742f, 198.62741f, 68.0f, 192.0f, 68.0f),
                    PathNode.LineTo(160.65f, 68.0f),
                    PathNode.LineTo(120.65f, 188.0f),
                    PathNode.LineTo(144.0f, 188.0f),
                    PathNode.CurveTo(150.62741f, 188.0f, 156.0f, 193.37259f, 156.0f, 200.0f),
                    PathNode.CurveTo(156.0f, 206.62741f, 150.62741f, 212.0f, 144.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(57.37258f, 212.0f, 52.0f, 206.62741f, 52.0f, 200.0f),
                    PathNode.CurveTo(52.0f, 193.37259f, 57.37258f, 188.0f, 64.0f, 188.0f),
                    PathNode.LineTo(95.35f, 188.0f),
                    PathNode.LineTo(135.35f, 68.0f),
                    PathNode.LineTo(112.0f, 68.0f),
                    PathNode.CurveTo(105.37258f, 68.0f, 100.0f, 62.62742f, 100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 49.37258f, 105.37258f, 44.0f, 112.0f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(198.62741f, 44.0f, 204.0f, 49.37258f, 204.0f, 56.0f),
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
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
