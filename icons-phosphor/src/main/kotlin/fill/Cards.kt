package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorFillIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 88.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(200.0f, 208.83656f, 192.83656f, 216.0f, 184.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 88.0f),
                    PathNode.CurveTo(24.0f, 79.163445f, 31.163445f, 72.0f, 40.0f, 72.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.CurveTo(192.83656f, 72.0f, 200.0f, 79.163445f, 200.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(59.581722f, 40.0f, 56.0f, 43.581722f, 56.0f, 48.0f),
                    PathNode.CurveTo(56.0f, 52.418278f, 59.581722f, 56.0f, 64.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 180.41827f, 219.58173f, 184.0f, 224.0f, 184.0f),
                    PathNode.CurveTo(228.41827f, 184.0f, 232.0f, 180.41827f, 232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cards!!
    }

private var _cards: ImageVector? = null
