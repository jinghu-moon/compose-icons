package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = lucideOutlineIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.CurveTo(12.67f, 5.0f, 13.35f, 5.09f, 14.0f, 5.26f),
                    PathNode.CurveTo(15.78f, 3.26f, 19.03f, 2.42f, 20.42f, 3.0f),
                    PathNode.CurveTo(21.82f, 3.58f, 20.0f, 10.0f, 20.0f, 10.0f),
                    PathNode.CurveTo(20.57f, 11.07f, 21.0f, 12.24f, 21.0f, 13.44f),
                    PathNode.CurveTo(21.0f, 17.9f, 16.97f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(7.03f, 21.0f, 3.0f, 18.0f, 3.0f, 13.44f),
                    PathNode.CurveTo(3.0f, 12.19f, 3.5f, 11.04f, 4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 10.0f, 2.11f, 3.58f, 3.5f, 3.0f),
                    PathNode.CurveTo(4.89f, 2.42f, 8.220001f, 3.23f, 10.0f, 5.23f),
                    PathNode.CurveTo(10.656024f, 5.079109f, 11.326849f, 5.001964f, 12.0f, 5.0f),
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
                    PathNode.MoveTo(8.0f, 14.0f),
                    PathNode.LineTo(8.0f, 14.5f)
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
                    PathNode.MoveTo(16.0f, 14.0f),
                    PathNode.LineTo(16.0f, 14.5f)
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
                    PathNode.MoveTo(11.25f, 16.25f),
                    PathNode.LineTo(12.75f, 16.25f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(11.25f, 16.25f),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
