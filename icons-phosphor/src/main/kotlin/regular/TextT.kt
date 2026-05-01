package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorRegularIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 56.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(208.0f, 92.41828f, 204.41827f, 96.0f, 200.0f, 96.0f),
                    PathNode.CurveTo(195.58173f, 96.0f, 192.0f, 92.41828f, 192.0f, 88.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(164.41827f, 192.0f, 168.0f, 195.58173f, 168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 204.41827f, 164.41827f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(91.58172f, 208.0f, 88.0f, 204.41827f, 88.0f, 200.0f),
                    PathNode.CurveTo(88.0f, 195.58173f, 91.58172f, 192.0f, 96.0f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(64.0f, 92.41828f, 60.418278f, 96.0f, 56.0f, 96.0f),
                    PathNode.CurveTo(51.581722f, 96.0f, 48.0f, 92.41828f, 48.0f, 88.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(48.0f, 51.581722f, 51.581722f, 48.0f, 56.0f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.CurveTo(204.41827f, 48.0f, 208.0f, 51.581722f, 208.0f, 56.0f),
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
        return _textT!!
    }

private var _textT: ImageVector? = null
