package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextItalic: ImageVector
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = phosphorDuotoneIcon(
            name = "TextItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 56.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.CurveTo(200.0f, 60.418278f, 196.41827f, 64.0f, 192.0f, 64.0f),
                    PathNode.LineTo(157.77f, 64.0f),
                    PathNode.LineTo(115.1f, 192.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(148.41827f, 192.0f, 152.0f, 195.58173f, 152.0f, 200.0f),
                    PathNode.CurveTo(152.0f, 204.41827f, 148.41827f, 208.0f, 144.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.CurveTo(59.581722f, 208.0f, 56.0f, 204.41827f, 56.0f, 200.0f),
                    PathNode.CurveTo(56.0f, 195.58173f, 59.581722f, 192.0f, 64.0f, 192.0f),
                    PathNode.LineTo(98.23f, 192.0f),
                    PathNode.LineTo(140.9f, 64.0f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.CurveTo(107.58172f, 64.0f, 104.0f, 60.418278f, 104.0f, 56.0f),
                    PathNode.CurveTo(104.0f, 51.581722f, 107.58172f, 48.0f, 112.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(196.41827f, 48.0f, 200.0f, 51.581722f, 200.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
