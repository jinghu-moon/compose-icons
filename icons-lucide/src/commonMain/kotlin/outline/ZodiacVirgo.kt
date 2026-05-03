package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacVirgo: ImageVector
    get() {
        if (_zodiacVirgo != null) return _zodiacVirgo!!
        _zodiacVirgo = lucideOutlineIcon(
            name = "ZodiacVirgo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 5.5f),
                    PathNode.CurveTo(11.0f, 4.119288f, 12.119288f, 3.0f, 13.5f, 3.0f),
                    PathNode.CurveTo(14.880712f, 3.0f, 16.0f, 4.119288f, 16.0f, 5.5f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 18.761423f, 18.238577f, 21.0f, 21.0f, 21.0f)
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
                    PathNode.MoveTo(16.0f, 11.5f),
                    PathNode.CurveTo(16.0f, 10.119288f, 17.119287f, 9.0f, 18.5f, 9.0f),
                    PathNode.CurveTo(19.880713f, 9.0f, 21.0f, 10.119288f, 21.0f, 11.5f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 18.761423f, 18.761423f, 21.0f, 16.0f, 21.0f)
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
                    PathNode.MoveTo(6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.CurveTo(6.0f, 4.343146f, 4.656854f, 3.0f, 3.0f, 3.0f),
                    PathNode.LineTo(3.0f, 3.0f)
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
                    PathNode.MoveTo(6.0f, 5.5f),
                    PathNode.CurveTo(6.0f, 4.119288f, 7.119288f, 3.0f, 8.5f, 3.0f),
                    PathNode.CurveTo(9.880712f, 3.0f, 11.0f, 4.119288f, 11.0f, 5.5f),
                    PathNode.LineTo(11.0f, 19.0f)
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
        return _zodiacVirgo!!
    }

private var _zodiacVirgo: ImageVector? = null
