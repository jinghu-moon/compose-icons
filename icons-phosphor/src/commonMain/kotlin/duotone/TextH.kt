package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextH: ImageVector
    get() {
        if (_textH != null) return _textH!!
        _textH = phosphorDuotoneIcon(
            name = "TextH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 56.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 204.41827f, 204.41827f, 208.0f, 200.0f, 208.0f),
                    PathNode.CurveTo(195.58173f, 208.0f, 192.0f, 204.41827f, 192.0f, 200.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(64.0f, 204.41827f, 60.418278f, 208.0f, 56.0f, 208.0f),
                    PathNode.CurveTo(51.581722f, 208.0f, 48.0f, 204.41827f, 48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(48.0f, 51.581722f, 51.581722f, 48.0f, 56.0f, 48.0f),
                    PathNode.CurveTo(60.418278f, 48.0f, 64.0f, 51.581722f, 64.0f, 56.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.CurveTo(192.0f, 51.581722f, 195.58173f, 48.0f, 200.0f, 48.0f),
                    PathNode.CurveTo(204.41827f, 48.0f, 208.0f, 51.581722f, 208.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textH!!
    }

private var _textH: ImageVector? = null
