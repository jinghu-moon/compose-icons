package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextItalic: ImageVector
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = phosphorLightIcon(
            name = "TextItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 56.0f),
                    PathNode.CurveTo(198.0f, 59.31371f, 195.3137f, 62.0f, 192.0f, 62.0f),
                    PathNode.LineTo(156.32f, 62.0f),
                    PathNode.LineTo(112.32f, 194.0f),
                    PathNode.LineTo(144.0f, 194.0f),
                    PathNode.CurveTo(147.3137f, 194.0f, 150.0f, 196.6863f, 150.0f, 200.0f),
                    PathNode.CurveTo(150.0f, 203.3137f, 147.3137f, 206.0f, 144.0f, 206.0f),
                    PathNode.LineTo(64.0f, 206.0f),
                    PathNode.CurveTo(60.68629f, 206.0f, 58.0f, 203.3137f, 58.0f, 200.0f),
                    PathNode.CurveTo(58.0f, 196.6863f, 60.68629f, 194.0f, 64.0f, 194.0f),
                    PathNode.LineTo(99.68f, 194.0f),
                    PathNode.LineTo(143.68f, 62.0f),
                    PathNode.LineTo(112.0f, 62.0f),
                    PathNode.CurveTo(108.686295f, 62.0f, 106.0f, 59.31371f, 106.0f, 56.0f),
                    PathNode.CurveTo(106.0f, 52.68629f, 108.686295f, 50.0f, 112.0f, 50.0f),
                    PathNode.LineTo(192.0f, 50.0f),
                    PathNode.CurveTo(195.3137f, 50.0f, 198.0f, 52.68629f, 198.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
