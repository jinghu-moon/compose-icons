package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BedSingle: ImageVector
    get() {
        if (_bedSingle != null) return _bedSingle!!
        _bedSingle = lucideOutlineIcon(
            name = "BedSingle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 10.895431f, 3.895431f, 10.0f, 5.0f, 10.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(20.10457f, 10.0f, 21.0f, 10.895431f, 21.0f, 12.0f),
                    PathNode.LineTo(21.0f, 20.0f)
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
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.CurveTo(5.0f, 4.895431f, 5.895431f, 4.0f, 7.0f, 4.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(18.10457f, 4.0f, 19.0f, 4.895431f, 19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 10.0f)
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
                    PathNode.MoveTo(3.0f, 18.0f),
                    PathNode.LineTo(21.0f, 18.0f)
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
        return _bedSingle!!
    }

private var _bedSingle: ImageVector? = null
