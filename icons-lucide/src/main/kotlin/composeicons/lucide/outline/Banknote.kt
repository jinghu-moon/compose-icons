package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Banknote: ImageVector
    get() {
        if (_banknote != null) return _banknote!!
        _banknote = lucideOutlineIcon(
            name = "Banknote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(21.10457f, 6.0f, 22.0f, 6.895431f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 17.10457f, 21.10457f, 18.0f, 20.0f, 18.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(2.895431f, 18.0f, 2.0f, 17.10457f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.895431f, 2.895431f, 6.0f, 4.0f, 6.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 13.104569f, 13.104569f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(10.895431f, 14.0f, 10.0f, 13.104569f, 10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 10.895431f, 10.895431f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(13.104569f, 10.0f, 14.0f, 10.895431f, 14.0f, 12.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(6.01f, 12.0f),
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.LineTo(18.01f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _banknote!!
    }

private var _banknote: ImageVector? = null
