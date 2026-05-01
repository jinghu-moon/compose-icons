package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacCapricorn: ImageVector
    get() {
        if (_zodiacCapricorn != null) return _zodiacCapricorn!!
        _zodiacCapricorn = lucideOutlineIcon(
            name = "ZodiacCapricorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 21.0f),
                    PathNode.CurveTo(12.656855f, 21.0f, 14.0f, 19.656855f, 14.0f, 18.0f),
                    PathNode.LineTo(14.0f, 6.5f),
                    PathNode.CurveTo(14.0f, 4.567004f, 12.432997f, 3.0f, 10.5f, 3.0f),
                    PathNode.CurveTo(8.567003f, 3.0f, 7.0f, 4.567004f, 7.0f, 6.5f)
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
                    PathNode.MoveTo(7.0f, 19.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.CurveTo(7.0f, 4.343146f, 5.656854f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(4.0f, 3.0f)
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
                    PathNode.MoveTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 18.656855f, 18.656855f, 20.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(15.343145f, 20.0f, 14.0f, 18.656855f, 14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 15.343145f, 15.343145f, 14.0f, 17.0f, 14.0f),
                    PathNode.CurveTo(18.656855f, 14.0f, 20.0f, 15.343145f, 20.0f, 17.0f),
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
        }
        return _zodiacCapricorn!!
    }

private var _zodiacCapricorn: ImageVector? = null
