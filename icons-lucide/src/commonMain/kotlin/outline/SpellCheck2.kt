package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SpellCheck2: ImageVector
    get() {
        if (_spellCheck2 != null) return _spellCheck2!!
        _spellCheck2 = lucideOutlineIcon(
            name = "SpellCheck2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 16.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.LineTo(18.0f, 16.0f)
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
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
                    PathNode.MoveTo(4.0f, 21.0f),
                    PathNode.CurveTo(5.1f, 21.0f, 5.1f, 20.0f, 6.3f, 20.0f),
                    PathNode.CurveTo(7.5f, 20.0f, 7.4f, 21.0f, 8.6f, 21.0f),
                    PathNode.CurveTo(9.7f, 21.0f, 9.7f, 20.0f, 10.9f, 20.0f),
                    PathNode.CurveTo(12.0f, 20.0f, 12.0f, 21.0f, 13.2f, 21.0f),
                    PathNode.CurveTo(14.3f, 21.0f, 14.3f, 20.0f, 15.5f, 20.0f),
                    PathNode.CurveTo(16.6f, 20.0f, 16.6f, 21.0f, 17.8f, 21.0f),
                    PathNode.CurveTo(18.9f, 21.0f, 18.9f, 20.0f, 20.1f, 20.0f)
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
        return _spellCheck2!!
    }

private var _spellCheck2: ImageVector? = null
