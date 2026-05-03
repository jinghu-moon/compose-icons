package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WavesVertical: ImageVector
    get() {
        if (_wavesVertical != null) return _wavesVertical!!
        _wavesVertical = lucideOutlineIcon(
            name = "WavesVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.QuadTo(14.0f, 4.5f, 12.0f, 7.0f),
                    PathNode.QuadTo(10.0f, 9.5f, 12.0f, 12.0f),
                    PathNode.QuadTo(14.0f, 14.5f, 12.0f, 17.0f),
                    PathNode.QuadTo(10.0f, 19.5f, 12.0f, 22.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.QuadTo(21.0f, 4.5f, 19.0f, 7.0f),
                    PathNode.QuadTo(17.0f, 9.5f, 19.0f, 12.0f),
                    PathNode.QuadTo(21.0f, 14.5f, 19.0f, 17.0f),
                    PathNode.QuadTo(17.0f, 19.5f, 19.0f, 22.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 2.0f),
                    PathNode.QuadTo(7.0f, 4.5f, 5.0f, 7.0f),
                    PathNode.QuadTo(3.0f, 9.5f, 5.0f, 12.0f),
                    PathNode.QuadTo(7.0f, 14.5f, 5.0f, 17.0f),
                    PathNode.QuadTo(3.0f, 19.5f, 5.0f, 22.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wavesVertical!!
    }

private var _wavesVertical: ImageVector? = null
