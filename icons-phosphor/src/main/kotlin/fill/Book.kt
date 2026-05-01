package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorFillIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 196.41827f, 212.41827f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(63.163445f, 200.0f, 56.0f, 207.16344f, 56.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(196.41827f, 216.0f, 200.0f, 219.58173f, 200.0f, 224.0f),
                    PathNode.CurveTo(200.0f, 228.41827f, 196.41827f, 232.0f, 192.0f, 232.0f),
                    PathNode.LineTo(48.0f, 232.0f),
                    PathNode.CurveTo(43.581722f, 232.0f, 40.0f, 228.41827f, 40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 38.32689f, 54.32689f, 24.0f, 72.0f, 24.0f),
                    PathNode.LineTo(208.0f, 24.0f),
                    PathNode.CurveTo(212.41827f, 24.0f, 216.0f, 27.581722f, 216.0f, 32.0f),
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
        return _book!!
    }

private var _book: ImageVector? = null
