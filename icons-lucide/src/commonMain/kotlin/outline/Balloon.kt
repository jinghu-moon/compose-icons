package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = lucideOutlineIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.CurveTo(12.0f, 18.10457f, 12.895431f, 19.0f, 14.0f, 19.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.CurveTo(16.10457f, 19.0f, 17.0f, 19.89543f, 17.0f, 21.0f),
                    PathNode.LineTo(17.0f, 22.0f)
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(13.104569f, 6.0f, 14.0f, 6.895431f, 14.0f, 8.0f)
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
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 12.0f, 14.5f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(9.5f, 16.0f, 6.0f, 12.0f, 6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 4.686292f, 8.686292f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(15.313708f, 2.0f, 18.0f, 4.686292f, 18.0f, 8.0f)
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
