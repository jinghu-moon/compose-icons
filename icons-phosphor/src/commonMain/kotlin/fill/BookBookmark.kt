package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorFillIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(54.32689f, 24.0f, 40.0f, 38.32689f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(40.0f, 228.41827f, 43.581722f, 232.0f, 48.0f, 232.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(196.41827f, 232.0f, 200.0f, 228.41827f, 200.0f, 224.0f),
                    PathNode.CurveTo(200.0f, 219.58173f, 196.41827f, 216.0f, 192.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 207.16344f, 63.163445f, 200.0f, 72.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(212.41827f, 200.0f, 216.0f, 196.41827f, 216.0f, 192.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(216.0f, 27.581722f, 212.41827f, 24.0f, 208.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 120.0f),
                    PathNode.LineTo(158.39f, 100.8f),
                    PathNode.CurveTo(156.96777f, 99.73333f, 155.01222f, 99.73333f, 153.59f, 100.8f),
                    PathNode.LineTo(128.0f, 120.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
