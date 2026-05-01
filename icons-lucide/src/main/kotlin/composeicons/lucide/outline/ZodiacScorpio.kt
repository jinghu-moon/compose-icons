package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacScorpio: ImageVector
    get() {
        if (_zodiacScorpio != null) return _zodiacScorpio!!
        _zodiacScorpio = lucideOutlineIcon(
            name = "ZodiacScorpio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 19.0f),
                    PathNode.LineTo(10.0f, 5.5f),
                    PathNode.CurveTo(10.0f, 4.119288f, 11.119288f, 3.0f, 12.5f, 3.0f),
                    PathNode.CurveTo(13.880712f, 3.0f, 15.0f, 4.119288f, 15.0f, 5.5f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(15.0f, 18.10457f, 15.895431f, 19.0f, 17.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.LineTo(19.0f, 16.0f)
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
                    PathNode.MoveTo(22.0f, 19.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
                    PathNode.MoveTo(5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 5.5f),
                    PathNode.CurveTo(5.0f, 4.119288f, 6.119288f, 3.0f, 7.5f, 3.0f),
                    PathNode.CurveTo(8.880712f, 3.0f, 10.0f, 4.119288f, 10.0f, 5.5f)
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
                    PathNode.MoveTo(5.0f, 5.5f),
                    PathNode.CurveTo(5.0f, 4.119288f, 3.880712f, 3.0f, 2.5f, 3.0f)
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
        return _zodiacScorpio!!
    }

private var _zodiacScorpio: ImageVector? = null
