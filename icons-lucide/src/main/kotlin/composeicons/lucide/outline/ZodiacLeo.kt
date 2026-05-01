package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacLeo: ImageVector
    get() {
        if (_zodiacLeo != null) return _zodiacLeo!!
        _zodiacLeo = lucideOutlineIcon(
            name = "ZodiacLeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 12.0f, 7.0f, 11.5f, 7.0f, 8.0f),
                    PathNode.CurveTo(7.0f, 5.238577f, 9.238576f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.761424f, 3.0f, 17.0f, 5.238577f, 17.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 11.466f, 14.0f, 14.196f, 14.0f, 18.0f),
                    PathNode.CurveTo(14.0f, 19.656855f, 15.343145f, 21.0f, 17.0f, 21.0f),
                    PathNode.CurveTo(18.656855f, 21.0f, 20.0f, 19.656855f, 20.0f, 18.0f)
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
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 17.656855f, 8.656855f, 19.0f, 7.0f, 19.0f),
                    PathNode.CurveTo(5.343146f, 19.0f, 4.0f, 17.656855f, 4.0f, 16.0f),
                    PathNode.CurveTo(4.0f, 14.343145f, 5.343146f, 13.0f, 7.0f, 13.0f),
                    PathNode.CurveTo(8.656855f, 13.0f, 10.0f, 14.343145f, 10.0f, 16.0f),
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
        return _zodiacLeo!!
    }

private var _zodiacLeo: ImageVector? = null
