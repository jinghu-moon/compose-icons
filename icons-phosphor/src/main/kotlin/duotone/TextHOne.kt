package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorDuotoneIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 72.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(47.163445f, 208.0f, 40.0f, 200.83656f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(216.83656f, 56.0f, 224.0f, 63.163445f, 224.0f, 72.0f),
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
                    PathNode.MoveTo(152.0f, 56.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 180.41827f, 148.41827f, 184.0f, 144.0f, 184.0f),
                    PathNode.CurveTo(139.58173f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 124.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 44.418278f, 184.0f, 40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 180.41827f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(44.418278f, 48.0f, 48.0f, 51.581722f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.LineTo(136.0f, 108.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.CurveTo(136.0f, 51.581722f, 139.58173f, 48.0f, 144.0f, 48.0f),
                    PathNode.CurveTo(148.41827f, 48.0f, 152.0f, 51.581722f, 152.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.77f, 105.0f),
                    PathNode.CurveTo(225.17065f, 103.60676f, 222.01558f, 103.75663f, 219.56f, 105.39f),
                    PathNode.LineTo(195.56f, 121.39f),
                    PathNode.CurveTo(191.88179f, 123.84214f, 190.88786f, 128.81178f, 193.34f, 132.49f),
                    PathNode.CurveTo(195.79214f, 136.16821f, 200.76178f, 137.16214f, 204.44f, 134.71f),
                    PathNode.LineTo(216.0f, 127.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(216.0f, 212.41827f, 219.58173f, 216.0f, 224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 112.0f),
                    PathNode.CurveTo(231.97943f, 109.067764f, 230.35632f, 106.381775f, 227.77f, 105.0f),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
